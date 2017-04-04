/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class Link extends HtmlPage{

    public Link()
    {

    }

    public Link(String linkText, String linkDescription)
    {
       super(linkText, linkDescription);
    }

    public String addLink(String linkText, String linkDescription)
    {
        return "<a href=\"" + linkText + "\">" + linkDescription + "</a>\n";
    }
}
