package palg.Cviko12;

public class Uloha06
{
    public static void main(String[] args)
    {
        // TODO: Co se vypíše?
        String row1 = "Dacia,120000,4A53225,2007,2017,true,false,true";
        String row2 = ",,,,2008,,,,";
        for(var part : row2.split(",",-1))
        {
            System.out.println("data: " + part);
        }
    }
}
