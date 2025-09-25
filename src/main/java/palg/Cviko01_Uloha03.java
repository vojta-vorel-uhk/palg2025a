package palg;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Cviko01_Uloha03 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Zadej město:");
            Scanner s = new Scanner(System.in);
            String city = s.nextLine();
            if (isOk(city))
                System.out.println("OK");
            else
                System.out.println("NOT_OK");
        }
    }

    public static boolean isOk(String input)
    {
        var bytes = input.getBytes(StandardCharsets.UTF_8);
        return bytes.length > input.length();
    }
}