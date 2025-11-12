package palg.Cviko08.Uloha01;

import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        useHashMap();
        usePalgMap();
    }

    public static void useHashMap()
    {
        var collection = new HashMap<Long, Person>();
        collection.put(6468L,new Person("Honza5",new byte[]{}));
        collection.put(158725L,new Person("Honza6",new byte[]{}));
        System.out.println(collection.get(6468L).getName());
        System.out.println(collection.get(158725L).getName());
    }

    public static void usePalgMap()
    {
        var collection = new PalgMap();
        collection.put(6468L,new Person("Honza5",new byte[]{}));
        collection.put(158725L,new Person("Honza6",new byte[]{}));
        System.out.println(collection.get(6468).getName());
        System.out.println(collection.get(158725).getName());
    }
}
