package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/kyle/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Gundam Extreme Vs. Maxi Boost On");
		element.submit();

		System.out.println("Page title is: " + driver.getTitle());

		/*(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("cheese!");
				}
			});*/

		System.out.println("Page title is: " + driver.getTitle());
		
		driver.close();
	}

}
