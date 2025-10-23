package palg.Cviko05_Uloha03;

import java.util.ArrayList;
import java.util.List;

public class NaiveLongSet implements LongSet {
    boolean[] jeTam = new boolean[1000001];
    public void add(long value) {
        jeTam[(int)value] = true;
    }
    public void remove(long value) {
        jeTam[(int)value] = false;
    }
    public boolean contains(long value) {
        return jeTam[(int)value];
    }
}
