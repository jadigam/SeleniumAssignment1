import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xeroQuickBooks  extends ReUsableMethods {

		public String quickbookfile() throws IOException{
			
			WebElement quickbookfileconvention = Driver.driver.findElement(By.cssSelector("#tbtext-1045"));
			 return quickbookfileconvention.getText();						
		}		
}
