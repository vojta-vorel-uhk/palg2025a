package palg.Cviko07_Uloha02;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        var r = search(new File("C:\\Pictures"), "4e68.png");
        System.out.println(r);
    }

    // Doplň metodu tak, aby ve složce "startDir" a jejích podsložkách
    // hledala soubor s názvem "fileName". Pokud ho najde, vrátí celou cestu k němu.
    public static String search(File startDir, String fileName) {
        return null;
    }
}
