package misc;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLS{

public static void main (String[] args) {
	
	WebDriver driver = new ChromeDriver(); 
	
	List<String> urls = new ArrayList<>(); 
    urls.add("https://www.getcalley.com/"); 
    urls.add("https://www.getcalley.com/calley-call-from-browser/"); 
    urls.add("https://www.getcalley.com/calley-pro-features/"); 
    urls.add("https://www.getcalley.com/best-auto-dialer-app/");
    urls.add("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
    
    for (String url : urls) { 
        driver.get(url); 
    } 
	
	driver.quit();
	
}
	 
	
	   

}