package assignments;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATest01_UITesting2 {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.getcalley.com/page-sitemap.xml");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/']")).click();
	Dimension d =new Dimension(1920, 1080);
    driver.manage().window().setSize(d);
    driver.navigate().back();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/']")).click();
    Dimension d1 =new Dimension(1366, 768);
    driver.manage().window().setSize(d1);
    driver.navigate().back();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/']")).click();
    Dimension d2 =new Dimension(1536,864 );
    driver.manage().window().setSize(d2);
    driver.navigate().back();
    Thread.sleep(3000);
    
    TakesScreenshot t=(TakesScreenshot)driver;
    File srcFile = t.getScreenshotAs(OutputType.FILE);
	File dstFile = new File("./screenshot/FirefoxBrowser/getcalley.png");		
    FileUtils.copyFile(srcFile, dstFile);
    
    driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/calley-call-from-browser/']")).click();
    driver.manage().window().maximize();
    driver.navigate().back();
    
    driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/calley-pro-features/']")).click();
    driver.manage().window().maximize();
    driver.navigate().back();
    
    driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/best-auto-dialer-app/']")).click();
    driver.manage().window().maximize();
    driver.navigate().back();
    
    driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/how-calley-auto-dialer-app-works/']")).click();
    driver.manage().window().maximize();
    driver.navigate().back();

    driver.quit();
		
	}	
	

}