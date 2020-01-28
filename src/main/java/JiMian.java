import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.URIParameter;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


public class JiMian {

    private static final String PUBLICKEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSRW0JBHD8hhM6TRasY8Ot9gT8sPWCmmmrJurDp9g//1yFuGMvwTSFrVwPtqcT8a9UEq3xHASnQRX2zZ1naUzfMKidfbZZEjJ/I5IrxfbRtXpCjrmLt2PYKHtjkdGhTur7237Nc5RyxAoA5oxhoBYldcVfF3g85LTLGsHLLmUCdQIDAQAB";

    private static final String SEND_SMS_URL = "";

    private static final String PHONE = "18074629071";

    public static void main(String[] args) throws ParseException, URISyntaxException, IOException, NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidKeySpecException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        Date parse = simpleDateFormat.parse(format);
        String oauthToken = JiMian.PHONE + "_CR_" + String.valueOf(parse.getTime());

        String encrypt = RSA.encrypt(oauthToken, JiMian.PUBLICKEY);

        URIBuilder uriBuilder = new URIBuilder(JiMian.SEND_SMS_URL);
        uriBuilder.addParameter("PhoneNumber",JiMian.PHONE);
        System.out.println(uriBuilder.build());

        CloseableHttpClient defaultClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.setHeader("OauthToken",encrypt);
        httpGet.addHeader("Content-Type","application/json");
        CloseableHttpResponse response = defaultClient.execute(httpGet);
        if (HttpStatus.SC_OK == response.getStatusLine().getStatusCode())
        {
            HttpEntity entity = response.getEntity();
            String objectStr = EntityUtils.toString(entity, "UTF-8");
            Map<String,Object> map = (Map)JSONObject.parseObject(objectStr);
            System.out.println(map);
        }
        System.out.println(response.getEntity());
    }


}
