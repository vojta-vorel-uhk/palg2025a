package palg.Cviko10;


import palg.Messages.Message;

import java.util.Arrays;

public class JavaSorter extends Sorter
{
    public void sort(Message[] messages)
    {
        Arrays.sort(messages,(m1, m2) -> m1.compareTo(m2) );

        // TODO 1: zbavit se druhého parametru, použít Arrays.sort(messages)
    }
}
