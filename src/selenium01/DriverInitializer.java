package selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInitializer {
	
	public static void main(String[] a) {
		
		chromeDriverInitializer().get("https://elm.school");
		
	}
	
	
	public static WebDriver chromeDriverInitializer() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sgadi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}

	public static WebDriver firefoxDriverInitializer() {
		
		System.setProperty("webdriver.chrome.driver",
				"POINT to Firefox executable");
		
		WebDriver driver = new FirefoxDriver();
		
		return driver;
	}
	
	public static WebDriver ieDriverInitializer() {
		
		System.setProperty("webdriver.chrome.driver",
				"POINT to IE executable");
		
		WebDriver driver = new InternetExplorerDriver();
		
		return driver;
	}

}
