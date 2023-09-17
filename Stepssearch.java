package swiggyAutomation;

	import java.net.MalformedURLException;
	import java.net.URL;
	import java.time.Duration;

	import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

	public class Stepssearch {
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			URL URL = new URL("http://127.0.0.1:4723/wd/hub");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "9");
		    capabilities.setCapability("mainActivity", "in.swiggy.android.activities.LoginActivityV2");
			capabilities.setCapability("AppPackage", "in.swiggy.android");
			//capabilities.setCapability("automationName", "Espresso");
			
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println(driver.getSessionId());
	
	driver.findElement(By.id("in.swiggy.android:id/search_loc_button")).click();
			//For location text ID
			driver.findElement(By.id("in.swiggy.android:id/search_query_edittext")).sendKeys("EXL sector 144 Noida");
			driver.hideKeyboard();
		Thread.sleep(5);			//List of results
		driver.findElement(By.id("in.swiggy.android:id/tv_area_name")).click();  
	Thread.sleep(10);	
		
			//Find ELements
		//	driver.findElement(By.id(" in.swiggy.android:id/tv_area_description")).click(); 
		//  Thread.sleep(10);
		  
driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"explore food deliveries\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		
  WebElement Searchbar = driver.findElement(By.id("in.swiggy.android:id/search_bar"));
	 Searchbar.click();
	 driver.findElement(By.id("in.swiggy.android:id/et_search_query_v2")).sendKeys("Biryani");
	  driver.hideKeyboard();
			driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Biryani Blues, Restaurant, , View similar restaurants\"]")).click();
			Thread.sleep(5);
	
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.view.ViewGroup\r\n")).click();
		Thread.sleep(10);
			
			
		ScrolltoView Lib = new ScrolltoView();
		
	Lib.scrollTillElement("Hyderabadi Chicken Dum Biryani Boneless", driver);
	
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'ADD']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
		
		}
			
			}
