package palg.Cviko12;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Uloha02
{
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        String heslo1 = "12346_Jarda1985";
        String hashA = encrypt(heslo1,"MD5");
        String hashB = encrypt(heslo1,"SHA256");
        System.out.println(heslo1 + ">" + hashA);
        System.out.println(heslo1 + ">" + hashB);
        // TODO 2
        //  Vyzkoušej zahashování nějakého stringu algoritmem MD5 a algoritmem SHA256
        //  (vypiš původní string i jeho hash)
    }

    public static String encrypt(String input, String algorithm) throws NoSuchAlgorithmException
    {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[] bytes = messageDigest.digest(input.getBytes());
        return bytesToHex(bytes);
    }

    public static String bytesToHex(byte[] bytes)
    {
        StringBuilder sb = new StringBuilder();
        for(var b : bytes)
            sb.append(String.format("%02x ",b));
        return sb.toString();
    }
}
