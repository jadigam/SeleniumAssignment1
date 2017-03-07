	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xeroDashBoardPage extends ReUsableMethods {

		public void UserMenu() throws IOException, InterruptedException{
 
			Thread.sleep(10000);
			
			WebElement userMenu = Driver.driver.findElement(By.cssSelector(".username"));
			 clickButton(userMenu, "userMenu button");
			 
		}
		
     public void logOut() throws IOException{
		
    	 WebElement logOut = Driver.driver.findElement(By.cssSelector("a[data-js='logout']"));
    	 clickButton(logOut, "logOut button");
    	
		}	
     
     public void profile() throws IOException{
    	 WebElement proifle = Driver.driver.findElement(By.cssSelector(".xn-h-profile-card-navigation-item.grid-3.profile>a"));
    	 clickButton(proifle, "proifle button");
    	
     }
     
     public void demoCompany() throws IOException{
    	 WebElement demoCompany = Driver.driver.findElement(By.cssSelector(".org-name"));
    	 clickButton(demoCompany, "demoCompany button");
    	
     }
     
     public void myXero() throws IOException{
    	 WebElement myXero = Driver.driver.findElement(By.cssSelector(".myxero-link"));
    	 clickButton(myXero, "myXero button");
    	
     }
       

   				
}