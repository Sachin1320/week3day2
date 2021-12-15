package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter')]")).click();
		Thread.sleep(3000)	;
		
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter')]")).click();
		Thread.sleep(3000)	;
		List<WebElement> item=driver.findElements(By.tagName("img"));
		System.out.println("Number of bags found:"+item.size());
		Thread.sleep(3000)	;
		List<WebElement> brand=driver.findElements(By.className("brand"));
		System.out.println(brand.size());
		Thread.sleep(3000)	;
		List<WebElement> name=driver.findElements(By.className("name"));
		System.out.println(name.size());
		
		
}
}