import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONToken;
import domain.Student;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
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
     * zip解压成json字符串
     * @param encoderString
     * @return
     * @throws IOException
     */
    private static String unZip(String encoderString) throws IOException {
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
        return unZipStringObj;
    }

    /**
     * 解析成list对象返回
     * @param StringBase64
     * @param obj
     * @param <R>
     * @return
     */
    public static <R> List<R> parseJsonArray(String StringBase64, R obj) throws IOException {
        String jsonString = ZipUtils.unZip(StringBase64);
        List<R> jsonArray = (List<R>) JSONArray.parseArray(jsonString).toJavaList(obj.getClass());
        return jsonArray;
    }

    /**
     * 解析成具体domain对象返回
     * @param StringBase64
     * @param obj
     * @param <R>
     * @return
     */
    public static <R> R parseJsonObject(String StringBase64, R obj) throws IOException {
        String jsonString = ZipUtils.unZip(StringBase64);
        R targetObj = (R)JSONObject.parseObject(jsonString).toJavaObject( obj.getClass());
        return targetObj;
    }

//----------------------------测试代码----------------------------------------------
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        List<Student> demo = ZipUtils.demo(new Student());
        JSONToken jsonToken = new JSONToken();
        System.out.println(demo);

    }

    public static <R> List<R> demo(R obj) {
        String studentJsonString = "[{\"age\":123,\"name\":\"liaoweixian\"}]";
        //R o = (R)JSONObject.parseObject(studentJsonString).toJavaObject( obj.getClass());
        List<R> list = (List<R>) JSONArray.parseArray(studentJsonString).toJavaList(obj.getClass());
        System.out.println(list);
        return list;
    }
}
