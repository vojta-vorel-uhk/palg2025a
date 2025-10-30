package palg.Cviko06;

public class RouteListNode
{
    private Location location;
    private RouteListNode next;

    public RouteListNode(RouteListNode next, Location location) {
        this.next = next;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public RouteListNode getNext() {
        return next;
    }

    public void setNext(RouteListNode next) {
        this.next = next;
    }
}
