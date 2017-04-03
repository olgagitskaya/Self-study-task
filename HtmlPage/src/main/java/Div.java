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

    public Div()
    {
        list.add(new ListItem(this.listItem));
        linkList.add(new Link(this.linkText, this.linkDescription));
    }

    public String toString()
    {
        String itemResult = "";
        String linkresult = "";

        for(ListItem item : list)
        {
            itemResult = item.toString();
            return itemResult;
        }
        for(Link link : linkList)
        {
            linkresult = link.toString();
            return linkresult;
        }

        return "<div>" + text + "<ul>" + itemResult + "</ul>" + linkresult + "</div";
    }
}
