package selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelectorDemo {
	
	public static void main(String[] args) {
		// get the WebDriver from our method
		WebDriver driver = DriverInitializer.chromeDriverInitializer(); 
		
		// go to the page that we want to automate
		driver.get("https://phptravels.com/demo");
		
		// 	enter First Name (John)
		// find and store the 'First Name' element
		WebElement firstNameInput = driver.findElement(By.name("first_name")); 
		firstNameInput.sendKeys("John");
		
		// enter Last Name  (Doe)
		WebElement lastNameInput = driver.findElement(By.cssSelector("[placeholder='Last Name']"));
		lastNameInput.sendKeys("Doe");
		
		// enter Business Name (ELM)
		WebElement businessNameInput = driver.findElement(By.cssSelector(".input:nth-of-type(3)"));
		businessNameInput.sendKeys("ELM");
		
		// enter Email (john@doe.com)
		WebElement emailInput = driver.findElement(By.cssSelector("input:nth-of-type(4)"));
		emailInput.sendKeys("john@doe.com");
		
		// capture first number (DYNAMIC)
		WebElement firstNumberElement = driver.findElement(By.cssSelector("#numb1"));
		String firstNumberTextString = firstNumberElement.getText();
		int firstNumberInt = Integer.valueOf( firstNumberTextString );
System.out.println("First number in text: " + firstNumberTextString);

		// capture second number (DYNAMIC)
		WebElement secondNumberElement = driver.findElement(By.cssSelector("#numb2"));
		String secondNumberTextString = secondNumberElement.getText();
		int secondNumberInt = Integer.parseInt(secondNumberTextString);
System.out.println("Second number in text: " + secondNumberTextString);
		
		// enter Result of first + second number (DYNAMIC)
		WebElement resultInput = driver.findElement(By.id("number"));
		int resultOfAddition = firstNumberInt + secondNumberInt;
		resultInput.sendKeys(String.valueOf(resultOfAddition));
		
		// hit Submit (click)
		WebElement submitButton = driver.findElement(By.id("demo"));
		submitButton.click();

		try { Thread.sleep(3000); } catch (Exception e) {}
		// VERIFY: "Thank you!" message (getText)
		WebElement thankYouMessage = driver.findElement(By.cssSelector("h2[class='text-center cw'] > strong"));
		String thankYouMessageText = thankYouMessage.getText().trim();
		
		if (thankYouMessageText.equals("Thank you!")) {
			System.out.println("Test case PASSED!");
		} else {
			System.out.println("Test case FAILED!");
			System.out.println("Text on UI: " + thankYouMessageText);
		}
		
	}
	
	
	
	
	
	
	
	

}
