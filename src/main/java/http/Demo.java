package http;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import http.pojo.Student;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class Demo {

    public static void main(String[] args) {
        //javaApiDemo();
        apachHttpClient();

    }

    public static void javaApiDemo() {

        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL("http://demo.lwx.cn/");
            HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
            httpUrlConnection.setDoInput(true);
            httpUrlConnection.setRequestMethod("GET");
            httpUrlConnection.connect();
            InputStream inputStream = httpUrlConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = null;
            while ( (str = bufferedReader.readLine()) != null ) {
                buffer.append(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            //断开连接
            httpUrlConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(buffer.toString());

        ObjectMapper objectMapper = new ObjectMapper();
        try {

            System.out.println("------------------------Json--------------");

            Student student = objectMapper.readValue(buffer.toString(), Student.class);

            System.out.println(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void apachHttpClient() {

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://demo.lwx.cn/");
        try {
            CloseableHttpResponse response = client.execute(httpGet);
            if (HttpStatus.SC_OK  == response.getStatusLine().getStatusCode()) {
                HttpEntity entity = response.getEntity();
                String s = EntityUtils.toString(entity, "utf-8");
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(s);
                JsonNode name = jsonNode.get("name");

                System.out.println(name);

                Student student = objectMapper.readValue(s, Student.class);

                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
