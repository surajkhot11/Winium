package winiumTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class NotepadTest 
{
	//@Test
	public static void main(String args[])
	{
		DesktopOptions options= new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
		try
		{
			WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),options);
			Thread.sleep(5000);
			/*driver.findElement(By.id("num4Button")).click();
			driver.findElement(By.id("plusButton")).click();
			driver.findElement(By.id("num7Button")).click();
			driver.findElement(By.id("equalButton")).click();*/
			
			
			driver.findElement(By.name("Text Editor")).sendKeys("Winium Test");
			Thread.sleep(2000);
			driver.findElement(By.name("File")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("Save")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("File name")).sendKeys("Filename");
			driver.findElement(By.name("Save")).click();
			driver.findElement(By.name("Close")).click();
			driver.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

