package palg.Cviko10;

import palg.Messages.Message;

import java.time.Instant;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        new NoSorter().sortWithReport(randomMessages(), "NoSorter.html");
        new JavaSorter().sortWithReport(randomMessages(), "JavaSorter.html");
        //new HeapSorter().sortWithReport(randomMessages(), "HeapSorter.html");
        //new SelectionSorter().sortWithReport(randomMessages(), "SelectionSorter.html");
        //new InsertionSorter().sortWithReport(randomMessages(),"InsertionSorter.html");
    }

    private static Message[] randomMessages()
    {
        Random random = new Random();
        Message[] messages = new Message[300];
        for(int i=0; i< messages.length; i++)
        {
            var epochSeconds=random.nextInt(0, 10000);
            System.out.println(epochSeconds);
            messages[i] = new Message( Instant.ofEpochSecond(epochSeconds),"Uběhlo "+epochSeconds+" sekund");
        }
        return messages;
    }
}
