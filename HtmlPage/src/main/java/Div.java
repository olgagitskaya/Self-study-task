import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class Div extends HtmlPage{

    public Div()
    {

    }

    public Div(String text)
    {
        super(text);
    }

    public String addDiv(String text)
    {
        return "<div>" + text + "</div>\n";
    }
}
