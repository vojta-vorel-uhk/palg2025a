package palg.Messages;
import java.time.Instant;

public class Message
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
}
