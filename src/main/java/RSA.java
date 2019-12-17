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
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSA {

    private static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCUPiXYrE/VJMFS8mGIxfnU4x9LDa6gDtDS6a54qcC+DXZFe6ao8QBuhTnYBGLLmK3e8fu6CynmhPMGVDXHknm19P6jK4eI2XzPL2Jnt9cSKkp6TFZ0fjvu4J4sJBPI/gBzNh6kENiYEwbW5/XPmCzOH/nPFRSMwEYieZjXX6BHRwIDAQAB";

    private static String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJQ+JdisT9UkwVLyYYjF+dTjH0sNrqAO0NLprnipwL4NdkV7pqjxAG6FOdgEYsuYrd7x+7oLKeaE8wZUNceSebX0/qMrh4jZfM8vYme31xIqSnpMVnR+O+7gniwkE8j+AHM2HqQQ2JgTBtbn9c+YLM4f+c8VFIzARiJ5mNdfoEdHAgMBAAECgYAEoC/UJARVtVDnArMybmMOVov6bpHdYrj3a91K3JksFQV0w5f+u4505GlaqUBf9AKw60Icmw6Sp+FheC05bgOoMouVVdGvD78Q2y7uohCqjdfv703QD2gealvO9heVIKspyKo+oLN/9+YBZ6CX0nbX/9tS1NySnhqj5ya9uy252QJBAOWF8yKqtxrWb+gAfYVBj5bVdfpLXSmSUextSI4CEGDjHB7By5glDg8xip5KM5VzWa977QQhp7KoVdxX6k5q0n0CQQClV+eQzzB0ZnQHMJ2V8TEkm7nubdCzJ1HIuWyMnMW5/t0vJNobDFXjigZbMkAebomB+hqgO7EEchwBsfs5FcgTAkBSua3BT/CBDsr0vsB+9/tN7RABr4obgq5eXaEp9dp7YT/wYf8Ejk578Wo51Rq0ggfQNQVfWNX9kaioq1M7AkttAkEApHCvijK1Ux7OCJSONaDiKjGCkqG+7V6OlR3s2k/Uym2yVv/Etx/mj90nAy4P3PQ8Z/tw3algHTbLqdf0Lcr+5wJABBnLoS3/EnZ35lXlwe3GvObkYHU4VvnvSrtx51f73/CUKRl3KNje5QgooW01HMov/d/L+YZBvBXomXIPCbkRJw==";


    public static void main(String[] args) throws Exception
    {

        //RSA.genKeyPair();
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
}
