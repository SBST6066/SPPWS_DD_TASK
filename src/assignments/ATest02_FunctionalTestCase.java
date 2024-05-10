package assignments;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ATest02_FunctionalTestCase {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation3 MuiCard-root css-1cl20sq']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-vwfva9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\SEL_PP_WS\\Data\\demo-data.xlsx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']")).click();
		Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();//click on OK
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='material-icons notranslate MuiIcon-root MuiIcon-fontSizeMedium css-1jgtvd5']")).click();
		Thread.sleep(3000);
		TakesScreenshot t=(TakesScreenshot)driver;
	    File srcFile = t.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./screenshot/demo-datapage.png");		
	    FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
	}
	
}
	 
	
	
	

