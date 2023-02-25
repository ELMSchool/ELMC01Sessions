package selenium02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import selenium01.DriverInitializer;

public class DragAndDropInSelenium {

	public static void main(String[] args) {
		WebDriver driver = DriverInitializer.chromeDriverInitializer();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// go to http://the-internet.herokuapp.com/drag_and_drop
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		
		// find and capture leftBox and rightBox
		WebElement leftBox = driver.findElement(By.id("column-a"));
		WebElement rightBox = driver.findElement(By.id("column-b"));
		
		// capture current header for leftBox and rightBox
		String initialLeftBoxHeaderText = leftBox.getText();
		String initialRightBoxHeaderText = rightBox.getText();
		
		System.out.println("LeftBox initial header: " + initialLeftBoxHeaderText);
		System.out.println("RightBox initial header: " + initialRightBoxHeaderText);
		
		// drag and drop leftBox to rightBox
		Actions actions = new Actions(driver);
//		Action builder = actions.clickAndHold(leftBox).moveToElement(rightBox).release(rightBox).build();
//		builder.perform();
		actions.clickAndHold(leftBox).moveToElement(rightBox, 50, 50)
			.release().build().perform();

		
		// capture new header for leftBox and rightBox
		
		// verify the initial headers for boxes are now CHANGED / DIFFERENT / swapped
		
		
		
		// TODO - HOMEWORK
		// AGAIN drag and drop leftBox to rightBox
		// THIS TIME the current headers should be equal to initial headers
		//  in other terms, back to original
	}
}
