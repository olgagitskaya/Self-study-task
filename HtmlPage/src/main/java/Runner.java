/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class Runner {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder();
        HtmlPage page = new HtmlPage();
        buf.append(page.addInitialPageTags());
        Div div = new Div();
        buf.append(div.addDiv("This is my first page."));
        Link link = new Link();
        buf.append(link.addLink("www.google.com", "Search in Google"));
        ListItem listItem = new ListItem();
        buf.append(listItem.addMarkedList("Item number one"));
        buf.append(page.addClosingPageTags());
        System.out.println(buf.toString());
    }
}
