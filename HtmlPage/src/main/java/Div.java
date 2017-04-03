import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class Div {
    String text;
    String linkText;
    String linkDescription;
    String listItem;
    ArrayList<Link> linkList = new ArrayList<Link>();
    ArrayList<ListItem> list = new ArrayList<ListItem>();
    //ArrayList<String> listItems = new ArrayList<String>();

    public Div(String text, String linkText, String linkDescription, String listItem)
    {
        this.text = text;
        this.linkText = linkText;
        this.linkDescription = linkDescription;
        this.listItem = listItem;
        list.add(new ListItem(listItem));
        linkList.add(new Link(linkText, linkDescription));
    }

    public String toString()
    {
        String itemResult = "";
        String linkresult = "";

        for(ListItem item : list)
        {
            itemResult = item.toString();
        }
        for(Link link : linkList)
        {
            linkresult = link.toString();
        }

        return "<div>\n" + text + "\n<ul>\n" + itemResult + "</ul>\n" + linkresult + "</div>\n";
    }
}
