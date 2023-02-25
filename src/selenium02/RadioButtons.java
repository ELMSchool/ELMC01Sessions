package selenium02;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium01.DriverInitializer;

public class RadioButtons {
	
	public static void main(String[] args) {
		WebDriver driver = DriverInitializer.chromeDriverInitializer(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// go to https://www.html.am/html-codes/forms/html-radio-button-code.cfm
		driver.get("https://www.html.am/html-codes/forms/html-radio-button-code.cfm");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		// find 'Male' within 'Radio Buttons vs Checkboxes' paragraph
		WebElement maleRadioButton = driver.findElement(By
				.cssSelector("form[target='result2'] > input[value='male']"));
		
		// click on it
		maleRadioButton.click();
		
		// verify it is selected
		boolean maleIsSelected = maleRadioButton.isSelected();
		if (maleIsSelected) {
			System.out.println("Male is selected, test is PASSING.");
		} else {
			System.out.println("Male is NOT selected, test is FAILING.");
		}
		
		// verify other buttons ('Female' and 'Unknown') are NOT selected
		WebElement femaleRadioButton = driver.findElement(By
				.cssSelector("form[target='result2'] > input[value='female']"));
		WebElement unknownRadioButton = driver.findElement(By
				.cssSelector("form[target='result2'] > input[value='unknown']"));
		boolean femaleIsSelected = femaleRadioButton.isSelected();
		boolean unknownIsSelected = unknownRadioButton.isSelected();
		
		if (femaleIsSelected || unknownIsSelected) {
			System.out.println("WRONG selection. Only Male can be selected. Test is FAILING.");
		} else {
			System.out.println("Only Male is selected. Test is PASSING.");
		}
		
		// Further tests on VERIFYING CORRECT RADIO BUTTON FUNCTIONALITY
		// now click on 'Female' button
		femaleRadioButton.click();
		
		// now verify Female is selected
		femaleIsSelected = femaleRadioButton.isSelected();
		if (femaleIsSelected) {
			System.out.println("Now Female is selected, test is PASSING.");
		} else {
			System.out.println("Female is still NOT selected, test is FAILING.");
		}
		
		// and now verify 'Male' is UNselected
		maleIsSelected = maleRadioButton.isSelected();
		if (maleIsSelected) {
			System.out.println("Male should be UN-selected, test is FAILING.");
		} else {
			System.out.println("Male is UN-selected, test is PASSING.");
		}
		
		// and 'Unknown' is till NOT selected
		unknownIsSelected = unknownRadioButton.isSelected();
		if (unknownIsSelected) {
			System.out.println("Unknown should NOT be selected, test is FAILING.");
		} else {
			System.out.println("Unknown is still NOT selected, test is PASSING.");
		}
		
		
		// TODO - HOMEWORK - This time click Unknown and verify that other are NOT selected
	}

}
