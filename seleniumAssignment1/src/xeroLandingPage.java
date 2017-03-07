import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

public class xeroLandingPage extends ReUsableMethods{
				
		public void lauchApp(String url){
			Driver.driver.get(url);
			System.out.println("Xero Application is launched...");
		}
				
		public void maxmizeWindpow(){
			Driver.driver.manage().window().maximize();
		}
		
		public  void clickLogin() throws IOException{			
			WebElement Login = Driver.driver.findElement(By.xpath("html/body/div[6]/header/nav/div[3]/div[1]/div/div/div/ul/li[5]/a"));
			clickButton(Login, "Login page");
			
		}

	}

	