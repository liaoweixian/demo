import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.sun.tools.internal.ws.wsdl.document.http.HTTPUrlEncoded;
import org.omg.IOP.Encoding;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Zip {

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
    public static String unZip(String encoderString) throws IOException {
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
        System.out.println(unZipStringObj);
        return unZipStringObj;
    }

    public static void main(String[] args) throws IOException {
//         Map<String, Object> map = new HashMap<>();
//         map.put("id",1);
//         map.put("name","liaoweixian");
//         map.put("sex","男");
//         map.put("qq","男");
//         map.put("sewwx","男");
//
//        String s = JSONObject.toJSONString(map);
//        String zip = Zip.zip(s);
        String str = "H4sIAAAAAAAAAHWWzW7cIBDH34VzI2HvbtXNNblUqhQpbc8RhvF6shhcwNs6VR+lp1566WvlOQrr/TAfOSRSfjOYYfjPn/wkjDvUitzSd4R3KJ8+9v0jcG3El2kAcqtGKU+RB87HISKPMABzn4Ad4szPvNNa3klmbcS/KnTY92MEmRAGQiIhMRFonUHu4mxoMQbG4AEEc3EJDSqBaldihVzjOsEmX0K13VY3tLqpKFkGO20HdEzmy5TO2XfAXReX3Wi991sPBpXL9ufMiBmSmtY03v8YhIGhyNaEvcl6Tav3NaUV9T93l1UdU7u8K+GX6PAQQ3RTcgyuRbLQ+Iv2shiVm65amWm+yxH3TBWoxTR5NOF4xvWgXBKxTvdZKSDQpd8OzLq0DpAQPsrM9Aa2R51ez+NrxviOW9ajnBLkOjAF5IdmKOBeNyihEEh6PkMHSQHgxniIWqN7C+aQ1NCxBp+CSOgC5LPVAZOZav2+QXwXzZ3lLuGQlBM2INU5D1ULJ/tY5ijNM00EWL6lEGkBvDHkPNRJF3+XV48yCCsP2d6fne1S6lgTO9DzqFCbAur8HKca8WMsoj4HkB1XZp54JOW8vPQjdqkBn47DBm8jL8VQ1sSz+Ei1oVW93myrDytyiWVCnlEm5Bl3TQkmZjLTgubnQCK8GaaaVyycgrz+/vv67w+5QBfre3a/VVXXm+DatKroelVvLvm68U8beMONvj1o63xgH0MDb3jQtxH5vrjmGHGGKduCuU8v0ICfDW04TMCMTUJerunMnOFTYvNnngnHeK8y+wSF1zhBFgUoDte2WW9/3BV7Y0F5e8YDuinhwW2kn5xcqRZ+LJ0jm630bp3vGuRP4Ann79wcSGTzZtv91PpKLS4fqSvL0wepmSigrL4XrWB5N7r3coGH5vlMrvqJHk+09xD+bWiZtPDrP5Ja6JRuCQAA" ;
        Zip.unZip(str);
    }

    public static void text() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        byte[] original="asdfasfasfasfsafsadfasfasfasfasfasdfasdasfsasdfasfsafsafsadsafsadsadfasffasdfsafdasf！".getBytes();
        System.out.println("original:"+original.length);
        System.out.println(Arrays.toString(original));
        //byteArrayOutputStream.write(original);
        GZIPOutputStream gzipOutputStream=new GZIPOutputStream(byteArrayOutputStream);
        gzipOutputStream.write(original);
        //这里一定要先把gzipOutputStream流关闭了，否则得到的是部分数据,并且下面在解压缩的时候会出现EOFException异常
        gzipOutputStream.close();
        byteArrayOutputStream.close();
        byte[] compressByteArray = byteArrayOutputStream.toByteArray();
        System.out.println("compress:"+compressByteArray.length);


        //解压缩
        GZIPInputStream gunzip = new GZIPInputStream(new ByteArrayInputStream(compressByteArray));
        ByteArrayOutputStream compressByteArrayOut=new ByteArrayOutputStream();
        byte[] buffer=new byte[4096];
        int temp=-1;
        while((temp=gunzip.read(buffer))>0){
            compressByteArrayOut.write(buffer, 0, temp);
        }
        byte[] unCompressByte = compressByteArrayOut.toByteArray();
        System.out.println("uncompress:"+unCompressByte.length);
        System.out.println(Arrays.toString(unCompressByte));
        gunzip.close();
        compressByteArrayOut.close();
    }
}
