package palg.Cviko10;

import palg.Messages.Message;

public class HeapSorter extends Sorter
{
    public void sort(Message[] messages)
    {
        palg.Cviko09.Heap heap = new palg.Cviko09.Heap(messages.length);
        for(var m : messages)
            heap.add(m);
        for(int i=0; i<messages.length;i++)
            messages[i] = heap.extractMin();
        // TODO 2: doplnit kód
    }
}
