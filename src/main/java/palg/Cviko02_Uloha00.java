package palg;

public class Cviko02_Uloha00 {
    public static void main(String[] args)
    {
        System.out.println(5 << 1 == 10); // Doplň operátor aby se vypsalo true
        System.out.println(5 % 10 == 5); // Doplň operátor aby se vypsalo true
        System.out.println(5 / 6 == 0); // Doplň operátor aby se vypsalo true
        System.out.println(-7 % 5 == -2); // Doplň operátor aby se vypsalo true
        System.out.println(9 >> 1 == 4); // Doplň operátor aby se vypsalo true
        int a= Integer.MAX_VALUE;
        System.out.println(a > a + 1); // Doplň hodnotu a aby se vypsalo true
        int b = Integer.MIN_VALUE;
        System.out.println(b < 0 && Math.abs(b) == b); // Doplň hodnotu b aby se vypsalo true

        double c = 0.1;
        double d = Double.NaN;
        System.out.println( 3 * c / 10 != 0.3 * c); // Doplň hodnotu c aby se vypsalo true
        System.out.println( !(d >= 0) && !(d <= 0) ); // Doplň hodnotu d aby se vypsalo true

        int e1 = 10;
        int e2=10;
        System.out.println((8 & e1) == 8); // Doplň hodnotu e1 aby se vypsalo true
        System.out.println((6 | e2) == 14); // Doplň hodnotu e2 aby se vypsalo true


    }
}
