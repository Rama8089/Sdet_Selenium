package in.prodapt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		
		// making changes on bug_001
		int i = 10;
		int j = 20;
		int k = 30;

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		// print the title of webpage
		System.out.println(driver.getTitle());
		
		// making changes on bug 202
		String name = "prodapt";
		// print the current url of webpage
		System.out.println(driver.getCurrentUrl());
		System.out.println("Thank you");
		// close the driver execution complete
		driver.close();



		public void changesMade(){
		System.out.println("This is changes Made statement");
		}
	}
}
