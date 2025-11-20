package palg.Cviko09;

import palg.Messages.Message;

public class Heap
{
    private Message[] data;
    private int count;

    public Heap(int capacity)
    {
        this.data = new Message[capacity];
        count = 0;
    }
}
