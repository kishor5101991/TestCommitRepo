package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver(); // use for launch the chrome browser

		d.manage().window().maximize(); // maximize the window

		d.get("https://www.facebook.com/"); // it will enter site automatically

		String titl = d.getTitle(); // it will give us title of the open site

		System.out.println("The title of the site is: " + titl); // it will
																	// print the
																	// site

		String cururl = d.getCurrentUrl(); // It will give us the url of the
											// site

		System.out.println("The currunt url is: " + cururl);

		d.close(); // it will close the current browser

		d.quit(); // it will close all browsers launched by d

	}

}
