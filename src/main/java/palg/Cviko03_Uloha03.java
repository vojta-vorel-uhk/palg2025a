package palg;

public class Cviko03_Uloha03
{
    public static void main(String[] args)
    {
        double[][] matrix0 = {{1,1,2,2,1},{1,2,2,4,4},{1,2,3,4,1},{1,4,1,2,5}};
        System.out.println(sum(matrix0));
    }

    // Doplň metodu, která spočítá součet všech prvků 2D pole
    public static double sum(double[][] matrix)
    {
        double sum=0;
        for (int y=0; y<matrix.length; y++)
        {
            for (int x=0; x<matrix[y].length; x++)
            {
                sum += matrix[y][x];
            }
        }
        return sum;
    }
}