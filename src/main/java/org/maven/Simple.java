package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	
	
}
}
