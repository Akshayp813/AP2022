package CornerstoneFG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest extends ExtentReport {

	
	@Test
	public void fillRegistrationformTest() {
		test = reports.createTest("fillRegistrationformTest");

		WebElement firstName = driver.findElement(By.cssSelector("input[id='u_0_2']"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement submitButton = driver.findElement(By.id("u_0_m"));

		firstName.sendKeys("Anshul");
		lastName.sendKeys("Chauhan");
		submitButton.click();
		String expectedTitle = "FaceBook Home";
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, expectedTitle);
	}

}
