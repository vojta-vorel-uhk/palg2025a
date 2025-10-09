package palg;

public class Cviko03_Uloha06
{
    public static void main(String[] args)
    {
        double[][] matrix0 = {
                {1.0, 1.5, 2.5, 2.7, 1.7},
                {1.9, 2.1, 4.0, 4.0, 4.6},
                {8.8, 2.1, 3.9, 8.1, 11.6},
                {10.9, 2.1, 2.1, 4.0, 4.6},
                {0.1, 3.1, 7.2, 7.1, 9.6}};
        mirror(matrix0);
    }

    // Doplň metodu, která matici převrátí podle hlavní diagonály (osy)
    public static void mirror(double[][] matrix)
    {
        cyklus1: for (int y=0; y<matrix.length; y++)
        {
            cyklus2: for (int x=0; x<y; x++)
            {
                double temp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = temp;
                continue cyklus1;
            }
        }
    }
}
