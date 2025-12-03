package palg.Cviko11;

import jdk.jshell.execution.Util;
import palg.Cviko10.InsertionSorter;
import palg.Messages.Message;

import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        var a = new String[]{"A","C","R","T","X","Z"};
        var b = new String[]{"D","E","F","H","S","Y"};
        var c = new String[12];
        Utils.merge(a,b,c,0);
        System.out.println(Arrays.toString(c));

        // TODO 1: Zprovozni metodu Utils.merge, tak aby se zde správně vypsalo [A, C, D, E, F, H, R, S, T, X, Y, Z]

        // TODO 2: Uprav metodu Utils.merge tak, aby fungovala pro String[] i pro Message[]

        // TODO 3: Odkomentuj a zprovozni MergeSorter
        //new MergeSorter().sortWithReport(randomMessages(),"MergeSorter.html");
        //new BubbleSorter().sortWithReport(randomMessages(),"BubbleSorter.html");
    }

    private static Message[] randomMessages()
    {
        Random random = new Random();
        Message[] messages = new Message[300];
        for(int i=0; i< messages.length; i++)
        {
            var epochSeconds=random.nextInt(0, 10000);
            messages[i] = new Message( Instant.ofEpochSecond(epochSeconds),"Uběhlo "+epochSeconds+" sekund");
        }
        return messages;
    }
}
