package misc;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.getcalley.com/page-sitemap.xml");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/']")).click();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        Thread.sleep(3000);
        driver.quit();
	}

}
