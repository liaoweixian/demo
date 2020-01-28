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
        String str = "H4sIAAAAAAAAAG2T3WrDIBTHX6V4vQ6TlH7kFcZg92OEM7XpoeYoxnSUsXefaZs0xoB48fuf76OfvwwlK9lmv2UvDMmICshjrYiV1Gn9YN8gfCWMVMGUF7xgI/fiRCbQj+Jtl2fvgyCAhNJRDHECV6sZQl3d8mf5YXQ1zg65OpLqiKTkU+zIX28+kzgSfG+d85yvebbmu1W2LTeHstiwiUUllPOAwT92VhaSgEZ440JIkA0Si+i94JnQQt8am4C4UyXR36ucwQYoYa2fWx6dikF/pWb91elAf+A6rouNotUJJPBo6IEnkahz7QKZz8lYpOAfMQvxfK1DEULxV56NxMgqmUagtYPGYxP4xNSGrV2nNTtVY+uVS9a+T9YeTPt5GDeO46kgHY0TcQ1teKOT7B7qSI5r62hxdJ3VBmTSXtcqj+KsfEQvoFFGfWzXBV/xfcl5OEO1F7GQqIdnJLmgoNYLtHl81/sLHn7s39c/Y2yELgUEAAA=" ;
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
