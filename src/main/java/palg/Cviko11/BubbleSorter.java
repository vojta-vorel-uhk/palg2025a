package palg.Cviko11;

import palg.Cviko10.Sorter;
import palg.Messages.Message;

public class BubbleSorter extends Sorter
{
    @Override
    public void sort(Message[] messages)
    {
        boolean swapped = true;
        while (swapped)
        {
            swapped=false;
            for(int i=0; i<messages.length-1;i++){
                // TODO: skončit for dřív, protože nejvyšší prvky se už hromadí na konci
                if(messages[i].compareTo(messages[i+1])>0)
                {
                    swap(messages,i,i+1);
                    swapped = true;
                }
            }
        }
    }
}
