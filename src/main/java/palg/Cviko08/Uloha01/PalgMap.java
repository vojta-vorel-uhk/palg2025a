package palg.Cviko08.Uloha01;

import java.util.ArrayList;

public class PalgMap
{
    private ArrayList<PalgMapNode> nodes = new ArrayList<>();
    public Person get(long key)
    {
        for(var n:nodes)
        {
            if(n.getKey() == key)
                return n.getValue();
        }
        return null;
    }

    public void put(long key, Person value)
    {
        nodes.add(new PalgMapNode(key, value));
    }
}
