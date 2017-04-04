import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class HtmlPage {
    String text;
    String linkText;
    String linkDescription;
    String listItem;
    int numberOfItems;


    public HtmlPage()
    {
    }

    public HtmlPage(String text)
    {
        this.text = text;
    }

    public HtmlPage(String linkText, String linkDescription)
    {
        this.linkText = linkText;
        this.linkDescription = linkDescription;
    }

    public HtmlPage(String listItem, int numberOfItems)
    {
        this.listItem = listItem;
        this.numberOfItems = numberOfItems;
    }

    public String addInitialPageTags()
    {
        return "<html>\n" + "<body>\n";
    }

    public String addClosingPageTags()
    {
        return "</body>\n" + "</html>";
    }
}
