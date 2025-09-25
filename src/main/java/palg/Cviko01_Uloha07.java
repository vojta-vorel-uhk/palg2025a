package palg;

import java.util.Arrays;
import java.util.Scanner;

public class Cviko01_Uloha07 {
    public static void main(String[] args)
    {
        String string = "Rychnov nad Kněžnou";
        Edit(string);
        // Co se vypíše?
        System.out.println(string);
    }

    public static void Edit(String string)
    {
        string = "Nejlepší město: "+string;
    }
}