package palg.Cviko10;


import palg.Messages.Message;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class Sorter
{
    private String dir = System.getProperty("user.dir");


    public abstract void sort(Message[] messages);

    public void sortWithReport(Message[] messages, String fileName)
    {
        var path = Paths.get(dir,fileName);
        var file = new File(path.toString());
        sort(messages);
        StringBuilder html = new StringBuilder();
        html.append("<html>");
        html.append("<head>");
        html.append("<style>");
        html.append("div .box {font-family: Consolas; padding: 5px; margin: 5px; color: #000B; border-radius: 5px; width:120px; text-align: center; font-size:10px}");
        html.append("</style>");
        html.append("</head>");
        html.append("<body>");
        html.append("<div style='width:100%;display: flex; flex-direction: row; flex-wrap: wrap'>");
        for(Message c : messages)
        {
            String color=c.getColor();
            html.append("<div class='box' style='white-space: nowrap; display: flex;align-items: center;background-color: "+color+"'>");
            html.append("<span style=''>✉&nbsp;</span> "+c);
            html.append("</div>");
        }
        html.append("</body>");
        html.append("</html>");
        try
        {
            Files.write(path, html.toString().getBytes());
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
