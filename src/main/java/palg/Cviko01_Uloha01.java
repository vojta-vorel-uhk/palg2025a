package palg;

import java.util.Scanner;

public class Cviko01_Uloha01 {
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
        return input.compareTo("Budapešť") < 0;
        // Domácí úkol: zjistit jak porovnávat podle abecedy
        // aby nebyla case-sensitive
    }
}