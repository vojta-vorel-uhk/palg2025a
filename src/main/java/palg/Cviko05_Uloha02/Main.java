package palg.Cviko05_Uloha02;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);
        // 1) Přidej třídy Queue a Stack implementující rozhraní Waiting
        Waiting storage;
        if(s.nextLine().equals("QUEUE"))
            storage = new Queue();
        else
            storage = new Stack();
        storage.add("AHOJ");

        // 2) Na jedné z nich otestuj, jaký je průměrný počet čekajících,
        //   pokud 100_000 krát provedeme add nebo remove s pravděpodobností 1:1

    }
}
