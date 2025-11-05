package palg.Cviko07_Uloha01;

public class Main {
    public static void main(String[] args) {
        Item[] db = Utils.getDatabase();
        int[] queries = Utils.getQueries();
        long startTime = System.currentTimeMillis();
        System.out.println("DB size: "+ db.length+" items");
        System.out.println("Queries count: "+ queries.length);
        int successCount = 0;
        StringBuffer s = new StringBuffer();
        for (var q : queries) {


            // Pokud db obsahuje položku s klíčem q, zvyš successCount


        }
        System.out.println("Successful queries count: "+ successCount);
        System.out.print("Trvalo to " + (System.currentTimeMillis() - startTime) / 1000 + " sekund");
    }
}