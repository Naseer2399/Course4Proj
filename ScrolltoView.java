package swiggyAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ScrolltoView {

	public boolean isElementVisible(String expView, AndroidDriver driver) {
		// MobileElement expElem =
		// driver.findElement(By.xpath("//android.widget.TextView[@text=]"+expView));
		Boolean flgPresent = false;
		
		List<WebElement> Hyderabadi_Chicken_Dum_Biryani_Boneless = driver.findElements(By.xpath("//android.widget.TextView[@text= 'Hyderabadi_Chicken_Dum_Biryani_Boneless']"));
		for (WebElement view : Hyderabadi_Chicken_Dum_Biryani_Boneless) {
			System.out.println(view.getText());
			if (view.getText().contains(expView)) {
//						foundElem = view;
				
				flgPresent = true;
				break;
			}
		}
		return flgPresent;

	}

	public void ScrollUp(AndroidDriver driver) {
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		System.out.println("Height is:- " + height);
		System.out.println("Width is:- " + width);

		int strtX = (int) (0.5 * width);
		int endX = strtX;

		int strtY = (int) (0.9 * height);
		int endY = (int) (0.1 * height);

		TouchAction action = new TouchAction(driver);

		action
		.longPress(PointOption.point(strtX, strtY)).
		moveTo(PointOption.point(endX, endY))
		.release()
		.perform();
	}

	// Condition: View name should be present in the list / application
	// Views, Seek Bar : Name of a view
	public boolean scrollTillElement(String Hyderabadi_Chicken_Dum_Biryani_Boneless, AndroidDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String clickView = Hyderabadi_Chicken_Dum_Biryani_Boneless;
			//driver.findElement(By.xpath("//android.widget.TextView[@text='Hyderabadi_Chicken_Dum_Biryani_Boneless']")).click();
		// driver.findElement(By.xpath(""))
		boolean elemnFound = false;

		while (!elemnFound) {
			boolean elementVisible = isElementVisible(clickView, driver);
			if (!elementVisible) {
				driver.findElement(By.xpath("//android.widget.TextView[@text = '']")).click();
				ScrollUp(driver);
			} else {
				elemnFound = true;

				break;
			}

		}

		return elemnFound;

	}

}
