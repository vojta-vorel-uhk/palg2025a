package palg.Cviko12;

import java.util.List;
import java.util.regex.Pattern;

public class Uloha07b
{
    public static void main(String[] args)
    {
        // TODO 1: Oprav regulární výraz, aby se vypisovala data
        String string = "Testy budou dva, jeden na sedmém cvičení (6.11.2025), druhý na posledním cvičení (18.12.2025). ";
        System.out.println("Datumy:");
        printAllMatches(string,Pattern.compile("\\d+\\.\\d+\\.\\d{4}"));

        // TODO 2: Oprav regulární výraz, aby se vypisovala města
        String string2="Nové Město nad Metují + Náchod + Trutnov / Kostelec nad Orlicí / Brandýs nad Labem-Stará Boleslav";
        System.out.println("Města:");
        printAllMatches(string2,Pattern.compile("[\\p{L} -]+"));

        // TIP: https://regex101.com/

    }

    public static void printAllMatches(String string, Pattern regex){
        for(var m :allMatches(string,regex) ) {
            System.out.println(m);
        }
    }
    
    public static List<String> allMatches(String string, Pattern regex){
        var outputStream = regex.matcher(string).results().map(m->m.group()) ;
        return outputStream.toList();
    }
}
