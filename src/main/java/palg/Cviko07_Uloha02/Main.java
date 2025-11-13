package palg.Cviko07_Uloha02;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        var r = search(new File("P:\\palg2025a"), "LongSet.java");
        System.out.println(r);
    }

    public static String search(File startDir, String fileName) {
        for(var child : startDir.listFiles())
        {
            if(child.isDirectory())
            {
                var subResult = search(child,fileName);
                if(subResult != null) return subResult;
            }
            else
            {
                if(child.getName().equals(fileName))
                    return child.getAbsolutePath();
            }
        }
        return null;
    }
}
