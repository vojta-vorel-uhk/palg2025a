package palg.Cviko10;


import palg.Messages.Message;

public class InsertionSorter extends Sorter
{
    @Override
    public void sort(Message[] messages)
    {
        for(int h=0; h< messages.length; h++){
            for(int p=h-1; p>=0; p--){
                if(messages[p].compareTo(messages[p+1])>0)
                    swap(messages,p,p+1);
                else
                    break;
            }
            // Podívej se na prvek na pozici h
            // Zařaď ho na správnou pozici
            // v rozsahu 0 až h
        }
    }

}
