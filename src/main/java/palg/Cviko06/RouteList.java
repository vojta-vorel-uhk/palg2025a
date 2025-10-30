package palg.Cviko06;

public class RouteList
{
    RouteListNode first;
    public void addFirst(Location location)
    {
        first = new RouteListNode(
                first,
                location);
    }
}
