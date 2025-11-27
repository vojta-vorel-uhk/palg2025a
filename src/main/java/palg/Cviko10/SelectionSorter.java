package palg.Cviko10;

import palg.Messages.Message;

public class SelectionSorter extends Sorter
{
    @Override
    public void sort(Message[] messages){
        for(int h=0; h<messages.length;h++){
            var m = minIndex(messages,h); // Najít index minima (m) v části počínaje indexem h
            swap(messages,m,h);// Prohodit pozice m a h
        }
    }
    private int minIndex(Message[] m,int start){
        int minIndex = start;
        for(int i=start+1; i<m.length;i++){
            if(m[i].compareTo(m[minIndex]) < 0)
                minIndex=i;
        }
        return minIndex;
    }
}
