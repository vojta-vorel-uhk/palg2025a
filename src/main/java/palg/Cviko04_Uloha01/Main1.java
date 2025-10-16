package palg.Cviko04_Uloha01;

import java.time.Instant;
import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Zadejte řetězec k zašifrování:");
            String plain = scanner.next();
            SuperSecurityEncryptor s
                    = new SuperSecurityEncryptor(new DefaultRandomSource());
            System.out.println("Výsledek:");
            System.out.println(s.EncryptString(plain));
        }
    }
}
