package selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium01.DriverInitializer;

public class ActionsContextClick {

	public static void main(String[] args) {
		WebDriver driver = DriverInitializer.chromeDriverInitializer(); 
		
		// go to http://the-internet.herokuapp.com/context_menu
		driver.get("http://the-internet.herokuapp.com/context_menu");
		
		// find the box where we can right click
		WebElement rightClickBox = driver.findElement(By.id("hot-spot"));
		
		// right click on the box
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickBox).build().perform();
		
		
		
		// TODO - HOMEWORK - do it after you know how to work with Alert class
		// verify the Alert with 'You selected a context menu' has appeared
	}
}
