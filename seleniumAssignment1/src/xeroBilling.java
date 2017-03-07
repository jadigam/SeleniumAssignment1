import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xeroBilling  extends ReUsableMethods {

		public String starterBillTo() throws IOException{
			
			WebElement billTo = Driver.driver.findElement(By.cssSelector("#LegalName"));
			 return billTo.getText();						
		}
		
     public void streetAddress() throws IOException{
			WebElement streetAddress = Driver.driver.findElement(By.cssSelector("#POAddress"));	
			enterText(streetAddress, "39900, blacow rd", "streetAddress entered");           
		}
       
     public void city() throws IOException{
			
    	 WebElement city= Driver.driver.findElement(By.cssSelector("#POCity"));	
    	 enterText(city, "Fremont", "city text enter");                    
		}
	
     public void State() throws IOException{
			
    	 WebElement State = Driver.driver.findElement(By.cssSelector("#PORegionDropdown_toggle"));	
    	 State.sendKeys("California");
		}
     
     public void zipCode() throws IOException{
			
    	 WebElement zipCode= Driver.driver.findElement(By.cssSelector("#POPostalCode"));	
    	 enterText(zipCode, "94538", "zip code");                    
		}
     
     public void continueButton() throws IOException{
			
    	 WebElement continueButton= Driver.driver.findElement(By.cssSelector(".text"));	
    	 clickButton(continueButton, "continue Button");                    
		} 
     
     
     public void creditcardNum() throws IOException{
			
    	 WebElement creditcardNum= Driver.driver.findElement(By.xpath(".//*[@id='18947']"));	
    	 creditcardNum.sendKeys("222");    
		}
     
     public void nameOnCard() throws IOException{
			
    	 WebElement nameOnCard= Driver.driver.findElement(By.xpath(".//*[@id='18948']"));	
    	 nameOnCard.sendKeys("aaa");
		}
     
     public void securityCd() throws IOException{			
    	 WebElement securityCd= Driver.driver.findElement(By.xpath(".//*[@id='18952']"));	
    	 securityCd.sendKeys("111111");
		}
}

