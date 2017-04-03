/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class Link {
    String linkText;
    String linkDescription;

    public Link(String linkText, String linkDescription)
    {
        this.linkText = linkText;
        this.linkDescription = linkDescription;
    }

    public String toString()
    {
        return "<a href=\"" + linkText + "\">" + "</a>";
    }
}
