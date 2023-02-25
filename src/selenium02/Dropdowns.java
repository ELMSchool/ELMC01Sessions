package selenium02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium01.DriverInitializer;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = DriverInitializer.chromeDriverInitializer(); 
		
		// go to http://the-internet.herokuapp.com/dropdown
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		// find Select element
		WebElement dropdownElement = driver.findElement(By.id("dropdown"));
		Select dropdown = new Select(dropdownElement);
				
		// verify the 'Please select an option' message is displayed
		WebElement currentSelectedElement = dropdown.getFirstSelectedOption();
		String selectedElementText = currentSelectedElement.getText();
		
		if (selectedElementText.equals("Please select an option")) {
			System.out.println("Current visible selection is 'Please select an option', PASSING.");
		} else {
			System.out.println("Current visible selection is incorrect, FAILING.");
		}
		
		// click on 'Option 1' - WRONG!!! - in Select objects we DO NOT click!
		// Select objects give us 3 options to select a dropdown option from (index, visibleText, value attribute)
		dropdown.selectByIndex(1);
		
		// verify 'Option 1' is selected
		currentSelectedElement = dropdown.getFirstSelectedOption();
		selectedElementText = currentSelectedElement.getText();
		
		if (selectedElementText.equals("Option 1")) {
			System.out.println("Current visible selection is 'Option 1', PASSING.");
		} else {
			System.out.println("Current visible selection is incorrect, FAILING.");
		}
		
		// TODO -> Homework
		// select 'Option 2' using either visibleText or value attribute
		
		// verify 'Option 2' is selected
		
	}
}
