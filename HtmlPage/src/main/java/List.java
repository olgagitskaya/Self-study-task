import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class List {
    String listItemText;
    ArrayList<ListItem> list = new ArrayList<ListItem>();

    public List(ListItem listItem, String listItemText)
    {
        list.add(new ListItem(listItemText));
    }

    public String toString()
    {
        return "<ul>" + list + "</ul>";
    }
}
