package selenium02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium01.DriverInitializer;

public class Checkboxes {
	
	public static final String PARENT_FORM_BASE = "form[target='result2'] > ";
	
	public static void main(String[] args) {
		WebDriver driver = DriverInitializer.chromeDriverInitializer(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// go to https://www.html.am/html-codes/forms/html-radio-button-code.cfm
		driver.get("https://www.html.am/html-codes/forms/html-radio-button-code.cfm");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		// check 'Apple' box
		WebElement appleCheckbox = driver.findElement(By
				.cssSelector(PARENT_FORM_BASE + "input[value='apple']"));
		appleCheckbox.click();
		
		// verify 'Apple' box is selected
		boolean isAppleSelected = appleCheckbox.isSelected();
		if (isAppleSelected) {
			System.out.println("Apple is selected, PASSING.");
		} else {
			System.out.println("Apple is NOT selected, FAILING.");
		}
		
		// verify other boxes ('Orange' and 'Banana') are NOT selected
		WebElement orangeCheckbox = driver.findElement(By
				.cssSelector(PARENT_FORM_BASE + "input[value='orange']"));
		WebElement bananaCheckbox = driver.findElement(By
				.cssSelector(PARENT_FORM_BASE + "input[value='banana']"));
		boolean isOrangeSelected = orangeCheckbox.isSelected();
		boolean isBananaSelected = bananaCheckbox.isSelected();
		
		if (isOrangeSelected || isBananaSelected) {
			System.out.println("Wrong selections. FAILING.");
		} else {
			System.out.println("Correct selections. PASSING.");
		}
		
		// this time, check 'Banana' box
		bananaCheckbox.click();
		
		// verify 'Banana' box is selected
		isBananaSelected = bananaCheckbox.isSelected();
		
		if (isBananaSelected) {
			System.out.println("Banana is ALSO selected, PASSING.");
		} else {
			System.out.println("Banana is NOT selected, FAILING.");
		}
		
		// verify 'Apple' box IS ALSO STILL selected
		isAppleSelected = appleCheckbox.isSelected();
		
		if (isAppleSelected) {
			System.out.println("Apple is ALSO STILL selected, PASSING.");
		} else {
			System.out.println("Apple has become UN-selected, FAILING.");
		}
		
		// verify 'Orange' box is STILL NOT selected
		isOrangeSelected = orangeCheckbox.isSelected();
		
		if (isOrangeSelected) {
			System.out.println("Orange SHOULD NOT BE selected, FAILING.");
		} else {
			System.out.println("Orange is STILL NOT selected, PASSING.");
		}
		
		
		// TODO -> HOMEWORK -> check 'Orange' box and verify that ALL boxes are selected
	}

}
