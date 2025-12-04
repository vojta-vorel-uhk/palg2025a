package palg.Cviko11;

import palg.Messages.Message;

public class Utils {

    public static void merge(
            String[] source1,
            String[] source2,
            String[] target,
            int targetStart)
    {
        int next1 = 0;
        int next2 = 0;
        for(int t=0; t<source1.length+source2.length; t++)
        {
            if(next1 >= source1.length){
                target[targetStart+t] = source2[next2];
                next2++;
            }
            else if(next2 >= source2.length){
                target[targetStart+t] = source1[next1];
                next1++;
            }
            else if(source1[next1].compareTo(source2[next2])<0){
                target[targetStart+t] = source1[next1];
                next1++;
            }
            else {
                target[targetStart+t] = source2[next2];
                next2++;
            }
        }

    }
}
