package palg.Cviko09;

import palg.Messages.Message;

public class Heap
{
    private Message[] data;
    private int count;

    public Heap(int capacity)
    {
        data = new Message[capacity];
        count = 0;
    }

    public Message extractMin()
    {
        var result = data[0];
        data[0] = data[count-1];
        var currentIndex = 0;
        while(true){
            var lowerChildIndex = lowerChildIndex(currentIndex);
            if(lowerChildIndex == -1)
                break;
            if(data[currentIndex].compareTo(data[lowerChildIndex])>0){
                swap(lowerChildIndex,currentIndex);
                currentIndex = lowerChildIndex;
            }
            else{
                break;
            }
        }

        return result;
    }
    private int lowerChildIndex(int current){
        var right = rightChild(current);
        var left = leftChild(current);
        if(left >= count) return  -1;
        if(right < count && data[right].compareTo(data[left])<0)
            return right;
        return left;
    }

    public void add(Message m){
        data[count] = m;
        repair(count);
        count++;
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
