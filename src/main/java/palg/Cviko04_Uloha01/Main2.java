package palg.Cviko04_Uloha01;

import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pokud důvěřujete třídě java.util.Random, stiskněte J.");
        System.out.println("Pokud důvěřujete webu randomnumberapi.com, stiskněte R.");
        System.out.println("Pokud důvěřujete náhodnosti z aktuálního času, stiskněte N.");
        var ch = scanner.next().charAt(0);
        switch (ch) {
            case 'J': {
            }
            case 'R': {
            }
            case 'N': {
            }
        }

        while (true) {
            System.out.println("Zadejte řetězec k zašifrování:");
            String plain = scanner.next();
            SuperSecurityEncryptor s = new SuperSecurityEncryptor();
            System.out.println("Výsledek:");
            System.out.println(s.EncryptString(plain));
        }
    }
}
