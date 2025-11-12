package palg.Cviko08.Uloha01;

public class Person
{
    private String name;
    private byte[] picture;

    public Person(String name, byte[] picture)
    {
        this.name = name;
        this.picture = picture;
    }

    public String getName()
    {
        return name;
    }

    public byte[] getPicture()
    {
        return picture;
    }
}
