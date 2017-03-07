import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationScripts extends ReUsableMethods{
	// Page object model --> POM
	
	
	public static void testLogoutFunctionality() throws IOException, InterruptedException{
		// Get test Data sheet
		// Read test data
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		 
		 
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		xeroLandPage.maxmizeWindpow();
		xeroLandPage.clickLogin();
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
		
		Thread.sleep(10000);
		xeroDashBoardPage _xeroDashBoardPage = new xeroDashBoardPage();
		_xeroDashBoardPage.UserMenu();
		Thread.sleep(4000);
		_xeroDashBoardPage.logOut();
				
	}

	
	public static void testUploadprofileimage() throws IOException, InterruptedException{
		// Get test Data sheet
		// Read test data
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		  
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		
		xeroLandPage.maxmizeWindpow();
		Thread.sleep(7000);
		xeroLandPage.clickLogin();
		
		Thread.sleep(4000);
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
		
		Thread.sleep(10000);
		xeroDashBoardPage _xeroDashBoardPage = new xeroDashBoardPage();
		_xeroDashBoardPage.UserMenu();
		
		Thread.sleep(4000);
		_xeroDashBoardPage.profile();
		
		Thread.sleep(5000);
		xeroProfilePage profilePage = new xeroProfilePage();		
		profilePage.uploadButton();
		
		
		Thread.sleep(5000);
		profilePage.browseButton();
		
		Thread.sleep(7000);
				
		profilePage.uploadimage();
		Thread.sleep(4000);
	}

	public static void addAnotherOrganizationTrailVersion1() throws IOException, InterruptedException{
		// Get test Data sheet
		// Read test data
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		  
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		
		xeroLandPage.maxmizeWindpow();
		Thread.sleep(7000);
		xeroLandPage.clickLogin();
		
		Thread.sleep(4000);
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
	
		Thread.sleep(3000);
		xeroDashBoardPage dashBoardPage = new xeroDashBoardPage();
		dashBoardPage.demoCompany();
		Thread.sleep(2000);
		dashBoardPage.myXero();
		Thread.sleep(6000);
		
		xeroMyXero myxero = new xeroMyXero();
		myxero.addOrganization();
		
		Thread.sleep(2000);
		
		xeroOrganization organization = new xeroOrganization();
		organization.organizationName();
		
		//select control for countries like usa
		//select for timezone
		organization.organizationPayTax();
		organization.timeZone();
		organization.organizationDo();
		
		organization.startTrial();
		
		Thread.sleep(4000);
			
	}

	public static void addAnotherOrganizationPaidVersion1() throws IOException, InterruptedException{
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		  
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		
		xeroLandPage.maxmizeWindpow();
		Thread.sleep(7000);
		xeroLandPage.clickLogin();
		
		Thread.sleep(4000);
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
	
		Thread.sleep(3000);
		xeroDashBoardPage dashBoardPage = new xeroDashBoardPage();
		dashBoardPage.demoCompany();
		Thread.sleep(2000);
		dashBoardPage.myXero();
		Thread.sleep(6000);
		
		xeroMyXero myxero = new xeroMyXero();
		myxero.addOrganization();
		
		Thread.sleep(2000);
		
		xeroOrganization organization = new xeroOrganization();
		organization.organizationName();
		
		//select control for countries like usa
		//select for timezone
		organization.organizationPayTax();
		organization.timeZone();
		organization.organizationDo();
		
		organization.buyNow();
		
		Thread.sleep(5000);
			
		String actualValue = organization.purchaseXero();
		String expectedValue = "Choose a pricing plan";
		
		if(actualValue.equals(expectedValue)){
			System.out.println("test case validated");
		}else{
			System.out.println("test case not validated");
		}				
	}
	
	public static void addAnotherOrganizationStarterPlan() throws IOException, InterruptedException{
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		  
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		
		xeroLandPage.maxmizeWindpow();
		Thread.sleep(7000);
		xeroLandPage.clickLogin();
		
		Thread.sleep(4000);
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
	
		Thread.sleep(3000);
		xeroDashBoardPage dashBoardPage = new xeroDashBoardPage();
		dashBoardPage.demoCompany();
		Thread.sleep(2000);
		dashBoardPage.myXero();
		Thread.sleep(6000);
		
		xeroMyXero myxero = new xeroMyXero();
		myxero.addOrganization();
		
		Thread.sleep(2000);
		
		xeroOrganization organization = new xeroOrganization();
		organization.organizationName();
		
		//select control for countries like usa
		//select for timezone
		organization.organizationPayTax();
		organization.timeZone();
		organization.organizationDo();
		
		organization.buyNow();
		
		Thread.sleep(5000);
			
		String actualValue = organization.purchaseXero();
		String expectedValue = "Choose a pricing plan";
		
		if(actualValue.equals(expectedValue)){
			System.out.println("test case validated");
		}else{
			System.out.println("test case not validated");
		}	
		
		xeroPurchasePlanPage purchasePlan = new xeroPurchasePlanPage();
		purchasePlan.starter();
		purchasePlan.continueButton();
		
		xeroBilling billing = new xeroBilling();
		String Actualstr = billing.starterBillTo();
		String Expectedstr = "vijay3";
		if(actualValue.equals(expectedValue)){
			System.out.println("test case name filed validated");
		}else{
			System.out.println("test case name filed  not validated");
		}	
		
		billing.streetAddress();
		billing.city();
		billing.State();
		billing.zipCode();
		billing.continueButton();
		Thread.sleep(10000);
		billing.creditcardNum();
		billing.nameOnCard();
		billing.securityCd();
	}
	
	public static void addAnotherOrganizationStandardPlan() throws IOException, InterruptedException{
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		  
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		
		xeroLandPage.maxmizeWindpow();
		Thread.sleep(7000);
		xeroLandPage.clickLogin();
		
		Thread.sleep(4000);
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
	
		Thread.sleep(3000);
		xeroDashBoardPage dashBoardPage = new xeroDashBoardPage();
		dashBoardPage.demoCompany();
		Thread.sleep(2000);
		dashBoardPage.myXero();
		Thread.sleep(6000);
		
		xeroMyXero myxero = new xeroMyXero();
		myxero.addOrganization();
		
		Thread.sleep(2000);
		
		xeroOrganization organization = new xeroOrganization();
		organization.organizationName();
		
		//select control for countries like usa
		//select for timezone
		organization.organizationPayTax();
		organization.timeZone();
		organization.organizationDo();
		
		organization.buyNow();
		
		Thread.sleep(5000);
			
		String actualValue = organization.purchaseXero();
		String expectedValue = "Choose a pricing plan";
		
		if(actualValue.equals(expectedValue)){
			System.out.println("test case validated");
		}else{
			System.out.println("test case not validated");
		}	
		
		xeroPurchasePlanPage purchasePlan = new xeroPurchasePlanPage();
		purchasePlan.standard();
		purchasePlan.continueButton();
		
		xeroBilling billing = new xeroBilling();
		String Actualstr = billing.starterBillTo();
		String Expectedstr = "vijay3";
		if(actualValue.equals(expectedValue)){
			System.out.println("test case name filed validated");
		}else{
			System.out.println("test case name filed  not validated");
		}	
		
		billing.streetAddress();
		billing.city();
		billing.State();
		billing.zipCode();
		billing.continueButton();
		Thread.sleep(10000);
		billing.creditcardNum();
		billing.nameOnCard();
		billing.securityCd();
	}
	
	public static void addAnotherOrganizationPremiumPlan() throws IOException, InterruptedException{
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		  
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		
		xeroLandPage.maxmizeWindpow();
		Thread.sleep(7000);
		xeroLandPage.clickLogin();
		
		Thread.sleep(4000);
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
	
		Thread.sleep(3000);
		xeroDashBoardPage dashBoardPage = new xeroDashBoardPage();
		dashBoardPage.demoCompany();
		Thread.sleep(2000);
		dashBoardPage.myXero();
		Thread.sleep(6000);
		
		xeroMyXero myxero = new xeroMyXero();
		myxero.addOrganization();
		
		Thread.sleep(2000);
		
		xeroOrganization organization = new xeroOrganization();
		organization.organizationName();
		
		//select control for countries like usa
		//select for timezone
		organization.organizationPayTax();
		organization.timeZone();
		organization.organizationDo();
		
		organization.buyNow();
		
		Thread.sleep(5000);
			
		String actualValue = organization.purchaseXero();
		String expectedValue = "Choose a pricing plan";
		
		if(actualValue.equals(expectedValue)){
			System.out.println("test case validated");
		}else{
			System.out.println("test case not validated");
		}	
		
		xeroPurchasePlanPage purchasePlan = new xeroPurchasePlanPage();
		purchasePlan.Premium();
		purchasePlan.continueButton();
		
		xeroBilling billing = new xeroBilling();
		String Actualstr = billing.starterBillTo();
		String Expectedstr = "vijay3";
		if(actualValue.equals(expectedValue)){
			System.out.println("test case name filed validated");
		}else{
			System.out.println("test case name filed  not validated");
		}	
		
		billing.streetAddress();
		billing.city();
		billing.State();
		billing.zipCode();
		billing.continueButton();
		Thread.sleep(10000);
		billing.creditcardNum();
		billing.nameOnCard();
		billing.securityCd();
	}

	public static void addAnotherOrganizationWithCurrentQuickbooksUser() throws IOException, InterruptedException{
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		  
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		
		xeroLandPage.maxmizeWindpow();
		Thread.sleep(7000);
		xeroLandPage.clickLogin();
		
		Thread.sleep(4000);
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
	
		Thread.sleep(3000);
		xeroDashBoardPage dashBoardPage = new xeroDashBoardPage();
		dashBoardPage.demoCompany();
		Thread.sleep(2000);
		dashBoardPage.myXero();
		Thread.sleep(6000);
		
		xeroMyXero myxero = new xeroMyXero();
		myxero.addOrganization();
		
		Thread.sleep(2000);
		
		xeroOrganization organization = new xeroOrganization();
		organization.organizationName();
		
		//select control for countries like usa
		//select for timezone
		organization.organizationPayTax();
		organization.timeZone();
		organization.organizationDo();
		organization.convertQuickbooks();
		Thread.sleep(2000);
		organization.convertQuickbooksCheckBox();
		organization.buyNow();
		
		Thread.sleep(5000);
		
		xeroQuickBooks qb = new xeroQuickBooks();
				
		String convention = qb.quickbookfile();
		String expectedConvention = "QuickBooks file conversion";
		
		if(convention.equals(expectedConvention)){
			System.out.println("test case validated");
		}else{
			System.out.println("test case not validated");
		}	
				
	}
	
	public static void checkIfUsersCanLookoutForTheirSubscription() throws IOException, InterruptedException{
		String dt_path = "C:/Users/Chinnu/Desktop/SCM/sheets/XeroTestSuite1/TestData/testLogoutFunctionality.xls";
		 String[][] recData = ReUsableMethods.readSheet(dt_path, "Sheet1");
		  
		 String url = recData[1][1];
		 String un = recData[1][2];
		 String pwd = recData[1][3];
		
//		String Un = recData[][];
		xeroLandingPage xeroLandPage = new xeroLandingPage();		
		xeroLandPage.lauchApp(url);
		
		xeroLandPage.maxmizeWindpow();
		Thread.sleep(7000);
		xeroLandPage.clickLogin();
		
		Thread.sleep(4000);
		
		xeroLoginPage loginPage = new xeroLoginPage();		
		loginPage.enterUserMail(un);
		loginPage.enterPwd(pwd);
		loginPage.clickButton();
	
		Thread.sleep(3000);
		xeroDashBoardPage dashBoardPage = new xeroDashBoardPage();
		dashBoardPage.demoCompany();
		Thread.sleep(2000);
		dashBoardPage.myXero();
		Thread.sleep(6000);
		
		xeroMyXero myxero = new xeroMyXero();
		myxero.addOrganization();
		
		Thread.sleep(2000);
		
		xeroOrganization organization = new xeroOrganization();
		organization.organizationName();
		
		//select control for countries like usa
		//select for timezone
		organization.organizationPayTax();
		organization.timeZone();
		organization.organizationDo();
		organization.convertQuickbooks();
		Thread.sleep(2000);
		organization.convertQuickbooksCheckBox();
		organization.buyNow();
		
		Thread.sleep(5000);
		
		xeroQuickBooks qb = new xeroQuickBooks();
				
		String convention = qb.quickbookfile();
		String expectedConvention = "QuickBooks file conversion";
		
		if(convention.equals(expectedConvention)){
			System.out.println("test case validated");
		}else{
			System.out.println("test case not validated");
		}	
	}
}
