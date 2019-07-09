import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\jars\\SeleniumJAR\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");	
	    System.out.println(driver.getTitle());
	  
	    
	    
	    WebElement element = driver.findElementByXPath("/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[2]/a/paper-item/span[1]");
        element.click();
	    
	    /*WebElement element = driver.findElementByXPath("//*[@id=\"search\"]");
	    Thread.sleep(3000);
	    element.sendKeys("Taki Taki hol https:");
	    */
	}

}
