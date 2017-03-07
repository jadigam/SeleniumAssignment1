	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xeroProfilePage extends ReUsableMethods {

		public void uploadButton() throws IOException{
			
			WebElement uploadButton = Driver.driver.findElement(By.cssSelector("#button-1041-btnInnerEl"));	
			clickButton(uploadButton, "upload Button");           //is display method
		
		}
		
     public void browseButton() throws IOException{
			
			WebElement browse = Driver.driver.findElement(By.cssSelector("#filefield-1174-button-fileInputEl"));	
			browse.sendKeys("C:/Users/Chinnu/Desktop/test.png");
			System.out.println("browse button is clicked");
		}
     
     public void uploadimage() throws IOException{
			
			WebElement uploadimage = Driver.driver.findElement(By.cssSelector("#button-1192-btnInnerEl"));	
			clickButton(uploadimage, "upload image");
		}
 
     	
}

		