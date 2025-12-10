package palg.Cviko12;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Uloha02
{
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        String heslo1 = "12346_Jarda1985";
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
        // TODO 1
        return null;
    }
}
