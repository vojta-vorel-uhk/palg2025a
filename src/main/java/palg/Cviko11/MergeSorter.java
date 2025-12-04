package palg.Cviko11;

import palg.Cviko10.Sorter;
import palg.Messages.Message;

import java.util.Arrays;

public class MergeSorter extends Sorter
{
    public void sort(Message[] sequence)
    {
        sortPart(sequence, 0, sequence.length);
    }

    private void sortPart(Message[] sequence,int start, int end)
    {
        if(end - start <= 1)
            return;
        int part2start = (start + end)/2;
        sortPart( sequence, start, part2start );
        sortPart( sequence, part2start, end);
        var part1copy = Arrays.copyOfRange(sequence,start,part2start);
        var part2copy = Arrays.copyOfRange(sequence,part2start,end);
        Utils.merge( part1copy, part2copy, sequence, start);
    }
}
