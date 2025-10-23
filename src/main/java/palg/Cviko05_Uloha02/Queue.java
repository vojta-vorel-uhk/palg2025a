package palg.Cviko05_Uloha02;

import java.util.ArrayList;
import java.util.List;

public class Queue implements Waiting {
    List<Object> list = new ArrayList<>();

    public void add(Object object) {
        list.add(index(),object);
    }
    private int index()
    {
        return 0;
    }

    public Object remove() {
        if(list.isEmpty())
            return null;
        Object result = list.removeLast();
        return result;
    }

    public int count() {
        return list.size();
    }
}
