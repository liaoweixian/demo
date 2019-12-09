import com.alibaba.fastjson.JSONObject;
import domain.Student;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class  ZipUtils {
    /**
     * zip 加密
     * @param txt
     * @return
     * @throws IOException
     */
    public static String zip(String txt) throws IOException {
        //转码
        byte[] bytes = txt.getBytes("UTF-8");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);

        //写入进行压缩
        gzipOutputStream.write(bytes);
        gzipOutputStream.close();
        byteArrayOutputStream.close();

        //转化成byte数组 编译成base64编码
        byte[] zipData = byteArrayOutputStream.toByteArray();
        return Base64.getEncoder().encodeToString(zipData);
    }

    /**
     * zip解密
     * @param encoderString
     * @return
     * @throws IOException
     */
    public static <T> T unZip(String encoderString,T obj) throws IOException {
        //解析base64编码
        byte[] bytes = Base64.getDecoder().decode(encoderString);

        //解码读出
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        GZIPInputStream unZip = new GZIPInputStream(in);
        byte buffer[] = new byte[4096];
        int n =-1;
        while ((n = unZip.read(buffer)) >= 0)
        {
            out.write(buffer, 0, n);
        }

        byte[] bytes1 = out.toByteArray();
        unZip.close();
        out.close();
        String unZipStringObj = new String(bytes1);
        T targetObj = (T)JSONObject.parseObject(unZipStringObj).toJavaObject(obj.getClass());
        return targetObj;
    }

    public static void main(String[] args) throws IOException {


    }

    public static <R> R demo(R obj) {
        //obj.getClass().
        String studentJsonString = "{\"age\":123,\"name\":\"liaoweixian\"}";
        R o = (R)JSONObject.parseObject(studentJsonString).toJavaObject( obj.getClass());
        System.out.println(o);
        return o;
    }
}
