package palg.Messages;
import java.time.Instant;

public class Message implements Comparable<Message>
{
    private long unixTimestamp;
    private String text;

    public Message(Instant instant, String text)
    {
        this.unixTimestamp = instant.getEpochSecond();
        this.text = text;
    }

    public int compareTo(Message o)
    {
        return (int) (this.unixTimestamp - o.unixTimestamp);
    }

    public String toString()
    {
        return text;
    }

    public String getColor(){ return "rgba("+(this.unixTimestamp%10000)*255/10000+",100,100,0.3)";}
}
