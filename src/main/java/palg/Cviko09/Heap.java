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
    public void add(Message m){
        this.data[count] = m;
        count++;
        repair(count);
    }
    private void repair(int index){
        int parent= parent(index);
        if(data[parent].compareTo(data[index]) > 0){
            swap(index,parent);
            repair(parent);
        }
    }
    private void swap(int a, int b){
        var temp = data[b];
        data[b] = data[a];
        data[a] = temp;
    }

    private static int leftChild(int index)
    {return index*2 + 1; }

    private static int rightChild(int index)
    {return index*2 + 2; }

    private static int parent(int index)
    { return (index-1)/2; }
}
