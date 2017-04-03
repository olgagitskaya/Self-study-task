import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class HtmlPage {
    String text;
    String linkText;
    String linkDescription;
    String listItem;
    ArrayList<Div> divList = new ArrayList<Div>();

    public HtmlPage(String text, String linkText,  String linkDescription, String listItem)
    {
        this.text = text;
        this.linkText = linkText;
        this.linkDescription = linkDescription;
        this.listItem = listItem;
        divList.add(new Div());
    }

    public String toString()
    {
        String divResult = "";

        for(Div div : divList)
        {
            divResult = div.toString();
            return divResult;
        }
        return "<html>" + "<body" + divResult + "</body>" + "</html>";
    }
}
