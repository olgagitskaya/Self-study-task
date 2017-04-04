
/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class ListItem extends HtmlPage{

    public ListItem()
    {

    }

    public ListItem(String listItem, int numberOfItems)
    {
        super(listItem, numberOfItems);


    }

    private String addListItem(String listItem)
    {
        return "<li>" + listItem + "</li>\n";

    }

    public String addMarkedList(String listItem)
    {
        return "<ul>\n" + addListItem(listItem) + "</ul>\n";
    }
}
