import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xeroMyXero extends ReUsableMethods {

		public void addOrganization() throws IOException{
			
			WebElement addOrganization = Driver.driver.findElement(By.cssSelector("a[class='x-btn green']"));	
			clickButton(addOrganization, "upload Button");          
		
		}
				
}
