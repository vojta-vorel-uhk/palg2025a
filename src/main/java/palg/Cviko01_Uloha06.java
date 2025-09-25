package palg;

import java.util.Arrays;
import java.util.Scanner;

public class Cviko01_Uloha06 {
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
        var stream = Arrays.stream(input.split(" "));
        return stream.filter(p->p.length()<=2).count() > 1;
    }
}