package palg.Cviko09;
import palg.Messages.Message;

import java.time.Instant;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Message[] arr = new Message[4];
        arr[0] = new Message(Instant.parse("2018-11-30T18:31:00Z"),"Ahoj 3");
        arr[1] = new Message(Instant.parse("2018-11-30T19:35:00Z"),"Ahoj 4");
        arr[2] = new Message(Instant.parse("2018-11-30T11:25:00Z"),"Ahoj 1");
        arr[3] = new Message(Instant.parse("2018-11-30T16:16:00Z"),"Ahoj 2");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
