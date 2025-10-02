package palg;

import java.io.IOException;

public class Cviko02_Uloha01 {
    // Vesmírné plavidlo stoupá k mezinárodní vermírné stanici.
    // Doplň metodu isAscending, která zkontroluje, zda data z výškoměru (spaceX.txt)
    // vykazují vždy stoupání.

    public static void main(String[] args) throws IOException {
        var floats
                = Cviko02_FileUtils.floatsFromFile("spaceX.txt");
        if(isAscending(floats)) {
            System.out.println("OK");
        }
        else {
            System.out.println("NOT_OK");
        }
    }

    public static boolean isAscending( float[] floats)
    {
        for(int i=0;i<floats.length - 1;i++)
        {
            if(floats[i] >= floats[i+1])
            {
                System.out.println(i+": "+floats[i]);
                System.out.println(i+1+": "+floats[i+1]);
                return false;
            }
        }
        return true;
    }
}
