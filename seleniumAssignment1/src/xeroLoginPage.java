	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xeroLoginPage extends ReUsableMethods {

		public void enterUserMail(String textVal) throws IOException{

			
			WebElement userName = Driver.driver.findElement(By.cssSelector("input[id='email']"));	
			enterText(userName, textVal, "User name");           //is display method
		
		}
		
     public void enterPwd(String textval) throws IOException{
			
    	 WebElement passWord = Driver.driver.findElement(By.cssSelector("input[id='password']"));
    	 enterText(passWord, textval, "Pass Word");           

		}
		
     public void clickButton() throws IOException{
	        
    WebElement logInSubmit = driver.findElement(By.cssSelector("button[id='submitButton']"));
    clickButton(logInSubmit, "logInSubmit button");

		}
				
}
