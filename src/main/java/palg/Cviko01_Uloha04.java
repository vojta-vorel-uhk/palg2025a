package palg;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Cviko01_Uloha04 {
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
        input = input.toLowerCase();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i) != input.charAt(input.length()-1-i))
                return false;
        }
        return true;
    }
}