package palg.Cviko06;

import java.util.Iterator;
import java.util.List;

public class RouteList implements Iterable<Location>
{
    RouteListNode first;
    public void addFirst(Location location)
    {
        first = new RouteListNode(
                first,
                location);
    }

    public void addLast(Location location)
    {
        RouteListNode last = first;
        while ( last.getNext() != null )
        { last = last.getNext();  }
        RouteListNode newNode
                = new RouteListNode(null, location);
        last.setNext(newNode);
    }
    public Location get(int index)
    {
        RouteListNode current = first;
        for (int i=0;i<index;i++)
        {
            current = first.getNext();
            if(current == null)
                throw new IndexOutOfBoundsException();
        }
        return current.getLocation();
    }


    @Override
    public Iterator<Location> iterator()
    {
        return null;
        // return new RouteListIterator(current)

        // Přidej třídu (např. RouteListIterator)
        // která bude obalem na RouteListNode
        // a bude implementovat rozhraní
        // Iterator<Location>
    }
}
