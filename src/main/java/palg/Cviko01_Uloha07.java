package palg;

import java.util.Arrays;
import java.util.Scanner;

public class Cviko01_Uloha07 {
    public static void main(String[] args)
    {
        String[] strings
                = new String[]{"Rychnov nad Kněžnou"};
        Edit(strings);
        // Co se vypíše?
        System.out.println(strings[0]);
    }

    public static void Edit(String[] strings)
    {
        strings[0] = "Nejlepší město: "+strings[0];
    }
}