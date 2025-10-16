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
        RandomSource randomSource;
        switch (ch) {
            case 'J':
                randomSource = new DefaultRandomSource();
                break;
            case 'R':
                randomSource = new WebRandomSource();
                break;
            case 'N':
                randomSource = new TimeRandomSource();
                break;
            default:
                return;
        }

        while (true) {
            System.out.println("Zadejte řetězec k zašifrování:");
            String plain = scanner.next();
            SuperSecurityEncryptor s = new SuperSecurityEncryptor(
                    randomSource);
            System.out.println("Výsledek:");
            System.out.println(s.EncryptString(plain));
        }
    }
}
