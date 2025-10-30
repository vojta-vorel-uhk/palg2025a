package palg.Cviko06;

import java.util.List;

public class RouteList
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

    }


}
