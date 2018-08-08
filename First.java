package sasa;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	private static WebDriver driver;
	 
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://knickerbocker-hotel-new-york.nochi.com/?btest=119");
     
        
    }
    @Test
    public void AllPages() throws IOException {
        WebElement PageO = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[4]/ul/li[1]/a"));
        PageO.click();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\result1.png"));
        
        WebElement PageT = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[4]/ul/li[2]/a"));
        PageT.click();
        FileUtils.copyFile(scrFile, new File("c:\\result2.png"));
        
        WebElement PageTh = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[4]/ul/li[3]/a"));
        PageTh.click();
        FileUtils.copyFile(scrFile, new File("c:\\result3.png"));
        
        WebElement PageF = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[4]/ul/li[4]/a"));
        PageF.click();
        FileUtils.copyFile(scrFile, new File("c:\\result4.png")); 
        
        WebElement PageFi = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[4]/ul/li[5]/a"));
        PageFi.click();
        FileUtils.copyFile(scrFile, new File("c:\\result5.png"));  

        WebElement DataOne = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[3]/form/div[2]/div[2]/table[1]/tbody/tr[4]/td[5]/div"));
        DataOne.click();
              
        WebElement DataTwo = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[3]/form/div[2]/div[2]/table[1]/tbody/tr[4]/td[6]/div"));
        DataTwo.click();
      
        WebElement Adults = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[3]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div[2]/div[2]"));
        Adults.click();
        
        WebElement ChooseKids = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[3]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]"));
        ChooseKids.click();      
        
        WebElement KidOne = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[3]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/select[1]"));
        KidOne.click(); 
      
        WebElement KidTwo = driver.findElement(By.xpath("//*[@id='container']/div/div/div/div[3]/form/div[1]/div[3]/div[3]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/select[2]"));
        KidTwo.click(); 
      
        WebElement searchButton = driver.findElement(By.xpath("//button[text()='Поиск']"));
        searchButton.click(); 
   
        WebElement bookedRoom = driver.findElement(By.xpath("//button[text()='Заронировать']"));
        bookedRoom.click(); 
    }
        
    	@Test
    	public void verifyData(String price1,String price2)throws Exception{
    		String expectedResultOne ="1.Взрослый";
    		  WebElement oneUser = driver.findElement(By.name("1.Взрослый"));
    		String expectedResultTwo ="2.Взрослый";
    		  WebElement twoUser = driver.findElement(By.name("2.Взрослый"));
    		String expectedResultThree ="3.Взрослый";
    		  WebElement threeUser = driver.findElement(By.name("3.Взрослый"));
    		String expectedResultFour ="(10 лет)";
    		  WebElement fourUser = driver.findElement(By.name("10 лет"));
    		String expectedResultFive ="(2 года)";
    		  WebElement fiveUser = driver.findElement(By.name("2 года"));
    		
    		Assert.assertEquals(oneUser, expectedResultOne);
    		Assert.assertEquals(twoUser, expectedResultTwo);
    		Assert.assertEquals(threeUser, expectedResultThree);
    		Assert.assertEquals(fourUser, expectedResultFour);
    		Assert.assertEquals(fiveUser, expectedResultFive);
        
    }
		
}
