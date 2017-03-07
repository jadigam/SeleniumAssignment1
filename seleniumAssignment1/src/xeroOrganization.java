import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xeroOrganization extends ReUsableMethods {
		
public void organizationName() throws IOException{
			
			WebElement organizationName = Driver.driver.findElement(By.cssSelector("[name='OrganisationName']"));	
			enterText(organizationName,"vijaya3" ,"upload Button");          
		}
public void organizationPayTax() throws IOException{
	try{
	WebElement organizationPayTax = Driver.driver.findElement(By.cssSelector("#ext-gen1089"));	
	Select select = new Select(organizationPayTax);
	select.selectByVisibleText("United States");
	}
	catch(Exception ex){
		
	}
}

public void timeZone() throws IOException{
	try{
	WebElement organizationPayTax = Driver.driver.findElement(By.cssSelector("#ext-gen1093"));	
	Select select = new Select(organizationPayTax);
	select.selectByVisibleText("(UTC-08:00) Pacific Time (US & Canada)");}
	catch(Exception ex){
		
	}
}

public void organizationDo() throws IOException{
	try{
	WebElement organizationDo = Driver.driver.findElement(By.cssSelector("#industrysearchcombofield-1025-inputEl"));	
    enterText(organizationDo, "engineering", "organization Do engineering");	
	}
	catch(Exception ex){
		
	}
	}

public void startTrial() throws IOException{
	
	WebElement startTrial = Driver.driver.findElement(By.cssSelector("#simplebutton-1032"));	
    clickButton(startTrial, "start Trial Button");	

	}

public void buyNow() throws IOException{
	
	WebElement buyNow = Driver.driver.findElement(By.cssSelector("#simplebutton-1033"));	
    clickButton(buyNow, "Buy NowButton");	

	}

public String purchaseXero() throws IOException{
	
	WebElement purchaseXero = Driver.driver.findElement(By.cssSelector(".form.w100>h2"));	
	return purchaseXero.getText();
		
	}

public void convertQuickbooks() throws IOException{
	
	WebElement convertQuickbooks = Driver.driver.findElement(By.cssSelector("#conversionLink"));	
    clickButton(convertQuickbooks, "quickbooks link clicked");	

	}

public void convertQuickbooksCheckBox() throws IOException{
	
	WebElement quickBookCheckBox = Driver.driver.findElement(By.cssSelector("#conversionCheckbox-inputEl"));	
    clickButton(quickBookCheckBox, "check box clicked");	

	}


		
}
