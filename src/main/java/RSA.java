import org.junit.Test;
import sun.security.rsa.RSAKeyFactory;
import sun.security.rsa.RSAKeyPairGenerator;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSA {

    private static String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs/yDhxA9KE18rfO3NkPT/cNyM412/p1659GbR40OVskwPH0CiN790Gdv17fypx7GGJYK27ifajNTc64c8F5fFnvnEROUvxJBeRXbUP7Pl6jA48KEve4HQxggjA/btGRObv2b2yhT9QUuDis5WrFuJekcMh3XvrhE+/zunzjGNNoE5cEV70cdcC9uafReBjf4VO52Z5PrZ+2hZwzvXVpSQpT9HWSib9PDy6OLS4oUnFZu6PObi3i9n6cTnLjxTqeL657C+5XxLRyVooZDKUMh/C8Z+XJ/lBodEZfr2W2MSfxIoc5izHV5+W6W4Yg0uxy5ZGV/OO5jixRWUYB28w5M2QIDAQAB";

    private static String privateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCz/IOHED0oTXyt87c2Q9P9w3IzjXb+nXrn0ZtHjQ5WyTA8fQKI3v3QZ2/Xt/KnHsYYlgrbuJ9qM1NzrhzwXl8We+cRE5S/EkF5FdtQ/s+XqMDjwoS97gdDGCCMD9u0ZE5u/ZvbKFP1BS4OKzlasW4l6RwyHde+uET7/O6fOMY02gTlwRXvRx1wL25p9F4GN/hU7nZnk+tn7aFnDO9dWlJClP0dZKJv08PLo4tLihScVm7o85uLeL2fpxOcuPFOp4vrnsL7lfEtHJWihkMpQyH8Lxn5cn+UGh0Rl+vZbYxJ/EihzmLMdXn5bpbhiDS7HLlkZX847mOLFFZRgHbzDkzZAgMBAAECggEAXVyPsWDICH7hPK5eC+T1Mv3N4FXyMrLnjRZaMKxHktb7kXTa+rqI+DCfgEtnsC6zXQ9/hGfpMUJ8eFYJptmdA2G0A1Sf5NkIY1HmGMaEUkvz+nDtQEQXOkNqppyXP6SEVuhwjycFHeTY9fqP3q6Iz1tzB8AZKFIXXoreEHN3xPOspZnG29p5yTuZcVes2N84mOGZ0wrHROduYPMxsFcsQha9YfJM9hBhkJPR9YoSlisYEU8+DgywSQRQa43TTmgZOr/D/HqCtZ4LKw6EaZnt30af7yQ8iMY+UvfOySo+Tge1JuZSHDZoqDXgY39Z2km7dZUhUtSGIWJnZxhEo5ydvQKBgQD9sncOgYyuIofML5ulg9DVimulHdJ3zVk3WRsRe0Muz9QUUUcNKzAX2/9lEf83HRu9RUlAdmPps5WfahNU0EFZzYNehlnLQEQCj8ZZKZVz+jnJ2+or7pVJFylQAO8r8FIjtDg6Jj5Nu13feUWVY+MPb3qpNGC6IZGvXUJoDPyFpwKBgQC1nsL1Slb/OpO9kljqRFX4Zqei7tPgXKqDo+sVnrseWR6jYDaQAGUrzfwC6VWrLwv1LXEF8KprR79rsHj2wqUvC9piKMgInY0uOUkjoQCOmpVEYnNXdPiljQ7MwbDnEbXeLoqPzF5meKYSfl1BVwhXROy2OWdYxqqYe/PPLSXpfwKBgQC34Pt0EyfxKuv8beFFdSYPMJXXBqd+1+K7QCVjZVELg+02kLaL7+qa0ITrL8EopDtv0uFGDMlcISLoeYzrY0qKmW+HOp+otrrUlHryMza06f+qtG+lSfcAE/6IkzTHRxdx83TxiLiNxKlEiXSK0+xGSsnADEuzfRNH5LN2ETuSbwKBgCGmDly/ryqOQb0Hli2hB4SEEF7hfKO+x2CoR++zftt6i3CdbL51NElPWnd3n4Wdq8t65cvB8PD7U/2xrleZbF0xBv7Uq2rdNcDwoBpXw/Cntyv6SYBUjZSuc6V/5TSKVXWajdViecLma25VtxVZ+JOik3CXZgxOkmC55kvmA3YlAoGBANuwPD5CEQkj5xgi/xwLqnoUHcXep5AtjE00hw3ifR1kUXf3b4ZEcYv2g0tNJjYKuReTOkkEHY37Y9SLexFbhLIikSW1yopMH0gA2zIk1MrHxdl42HDr7w+3N56lSnW+I0s7OkZ5EWc46Yx/3+LcnJS/5Nngkn24cFWlXSHuv0BS";


    public static void main(String[] args) throws Exception
    {

        //RSA.genKeyPair();
        /*String encrypt = RSA.encrypt("18074629071", RSA.publicKey);
        System.out.println(RSA.decrypt(encrypt,RSA.privateKey));*/

        //genKeyPair1();
        String encrypt = RSA.encrypt("18074629071", RSA.publicKey);
        System.out.println(RSA.decrypt(encrypt,RSA.privateKey));
    }

    /**
     * 加密 公钥加密
     * @param str
     * @param publicKey
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws NoSuchPaddingException
     * @throws InvalidKeyException
     * @throws UnsupportedEncodingException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     */
    public static String encrypt(String str, String publicKey) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException
    {
        byte[] decode = Base64.getDecoder().decode(publicKey);
        RSAPublicKey key = (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));

        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        String encryptionStr = Base64.getEncoder().encodeToString(cipher.doFinal(str.getBytes("UTF-8")));

        return encryptionStr;
    }

    /**
     * 私钥解密
     * @param str
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static String decrypt(String str, String privateKey) throws Exception
    {
        byte[] encryptBytes = Base64.getDecoder().decode(str.getBytes("UTF-8"));

        byte[] decode = Base64.getDecoder().decode(privateKey);
        RSAPrivateKey key = (RSAPrivateKey)KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decode));
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, key);
        String originalString = new String(cipher.doFinal(encryptBytes));
        return originalString;
    }

    /**
     * 生成公钥 、私钥
     */
    public static void genKeyPair() throws NoSuchAlgorithmException {
        //RSAKeyPairGenerator rsaKeyPairGenerator = new RSAKeyPairGenerator();
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(1024, new SecureRandom());
        KeyPair keyPair = keyPairGen.generateKeyPair();

        //得到公钥、私钥
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();

        String privateKeyString = new String(Base64.getEncoder().encodeToString(privateKey.getEncoded()));
        String publicKeyString = new String(Base64.getEncoder().encodeToString(publicKey.getEncoded()));

        RSA.privateKey = privateKeyString;
        RSA.publicKey = publicKeyString;

        System.out.println(RSA.privateKey);
        System.out.println("{}{}---------");
        System.out.println(RSA.publicKey);
    }


    public static void genKeyPair1() throws Exception
    {
        RSAKeyPairGenerator rsaKeyPairGenerator = new RSAKeyPairGenerator();
        KeyPair keyPair = rsaKeyPairGenerator.generateKeyPair();

        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        String publicKeyString = new String(Base64.getEncoder().encodeToString(publicKey.getEncoded()));
        String privateKeyString = new String(Base64.getEncoder().encodeToString(privateKey.getEncoded()));

        System.out.println(publicKeyString);
        System.out.println("----------------------------------");
        System.out.println(privateKeyString);
    }
}
