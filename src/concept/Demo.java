package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		//ChromeDriver is a class so we create obj for chrome browser to Automate TC.
		
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium work space\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://artoftesting.com");
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());
        driver.quit();
      
		

	}

}
