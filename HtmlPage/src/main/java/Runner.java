/**
 * Created by Volha_Hitskaya on 4/3/2017.
 */
public class Runner {
    public static void main(String[] args) {
        HtmlPage page = new HtmlPage("Hello, this is my first html page.", "https://www.google.by", "Search in google", "Item number 1");
        System.out.println(page.toString());
    }
}
