package devops.pipeline.devops_pipeline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class App {
	public static WebDriver driver;

	public static void main(String[]  args) throws MalformedURLException, InterruptedException{

 		String URL = "https://www.DemoQA.com";
 		String Node = "https://192.168.62.202:4444/wd/hub";
 		DesiredCapabilities capabilities = new DesiredCapabilities();
 		
 		
		capabilities.setBrowserName("chrome");
 				

 		driver = new RemoteWebDriver(new URL(Node), capabilities);

 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();
 	}		
}
