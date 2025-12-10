package palg.Cviko12;

public class Uloha04
{
    public static void main(String[] args)
    {
        //1 Co se vypíše?
        int negative1 = Integer.MIN_VALUE;
        negative1--;
        System.out.println(negative1);

        //2 Co se vypíše?
        int negative2 = Integer.MIN_VALUE;
        int positive2 = Math.abs(negative2);
        System.out.println(positive2);
    }


}
