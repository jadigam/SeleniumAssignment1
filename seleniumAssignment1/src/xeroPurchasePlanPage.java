import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xeroPurchasePlanPage extends ReUsableMethods {

		public void starter() throws IOException{
			
			WebElement starter = Driver.driver.findElement(By.cssSelector("a[id='PRODUCTOPTION/ORG/SOLO']>.h-plan-name"));	
			clickButton(starter, "starter Button");           
		
		}
		
     public void continueButton() throws IOException{
			WebElement continueButton = Driver.driver.findElement(By.cssSelector(".text"));	
			clickButton(continueButton, "continue Button");           
		}
     
     public void standard() throws IOException{
			
    	 WebElement standard = Driver.driver.findElement(By.cssSelector("a[id='PRODUCTOPTION/ORG/SOLO']>.h-plan-name"));	
		 clickButton(standard, "starter Button");           
		}
	
     public void Premium() throws IOException{
			
    	 WebElement Premium= Driver.driver.findElement(By.cssSelector("a[id='PRODUCTOPTION/ORG/SOLO']>.h-plan-name"));	
		 clickButton(Premium, "Premium Button");           
		}
	
}

