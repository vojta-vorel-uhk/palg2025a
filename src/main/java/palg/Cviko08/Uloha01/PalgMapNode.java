package palg.Cviko08.Uloha01;

public class PalgMapNode
{
    private long key;
    private Person value;

    public PalgMapNode(long key, Person value)
    {
        this.key = key;
        this.value = value;
    }

    public long getKey()
    {
        return key;
    }

    public Person getValue()
    {
        return value;
    }
}
