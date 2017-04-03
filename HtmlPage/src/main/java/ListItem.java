import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class ListItem {
    String listItem;

//    public ListItem()
//    {
//
//    }

    public ListItem(String listItem)
    {
        this.listItem = listItem;
    }

    public String toString()
    {
        return "<li>" + listItem + "</li>\n";
    }
}
