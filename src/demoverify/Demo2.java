package demoverify;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver c = new ChromeDriver();
        c.get("https://www.google.com/");
        c.quit();
        
        FirefoxDriver f = new FirefoxDriver();
        f.get("https://www.facebook.com/");
        f.quit();
        
        EdgeDriver e = new EdgeDriver();
        e.get("https://www.gmail.com");
        e.quit();
        
        
//        SafariDriver S = new SafariDriver();
//        S.get("https://www.amazon.in/");
//        S.quit();
	}

}
