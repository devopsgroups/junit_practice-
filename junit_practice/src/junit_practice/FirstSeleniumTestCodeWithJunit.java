package junit_practice;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumTestCodeWithJunit {
	
	@Test

	
	public void FirstJunitSeleniumTest() throws InterruptedException {
		
 String user = "firsttestcose17";
		 
		 /*
		   
		   OperaDriverService  service = new OperaDriverService.Builder()
			         .usingDriverExecutable(new File("D:\\software\\browser\\Opera\\operadriver_win64\\operadriver_win64\\operadriver.exe"))
			         .usingAnyFreePort()
			         .build();
			     service.start();
			     
			WebDriver driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.opera() ); 
		
		   //Open Google chrome 
		//System.setProperty("webdriver.chrome.driver", "D:\\software\\browser\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "D:\\software\\browser\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 System.setProperty("webdriver.opera.driver", "D:\\software\\browser\\Opera\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\software\\browser\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.drives", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();	
		//WebDriver driver = new OperaDriver();	
		//implicit wait
		driver.manage().window().maximize();
		
		
		 */
		
		
		
		
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser and put implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		//Open Orange HRM
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		// Do login
		 Thread.sleep(2000);
	     driver.findElement(By.id("txtUsername")).sendKeys("admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
         driver.findElement(By.id("btnLogin")).click();
         System.out.println("Loged in to Orange HRM");
	    
	     // Navigate to User creation page  
	     driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	     driver.findElement(By.id("btnAdd")).click();
	     System.out.println("Opened user creation page");
	     
	     // Fill User Create Form
	     WebElement dddown =  driver.findElement(By.id("systemUser_userType"));
	     Select dropdown  = new  Select(dddown);
	     dropdown.selectByIndex(1);
	     driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("John Smith");
	     driver.findElement(By.id("systemUser_userName")).sendKeys(user);
	     WebElement dddown1 =  driver.findElement(By.id("systemUser_status"));
		 Select dropdown1  = new  Select(dddown1);
	     dropdown1.selectByIndex(1);
	     driver.findElement(By.id("systemUser_password")).sendKeys(user);
	     driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(user);
	     Thread.sleep(2000);
	     driver.findElement(By.id("btnSave")).click();
	     System.out.println("User is successfuly created ");
	     
	     // Search User
	     driver.findElement(By.id("searchSystemUser_userName")).sendKeys(user);
	     Thread.sleep(2000);
	     driver.findElement(By.id("searchBtn")).click();
	     System.out.println("Searhed neuwly created user");
	     
	     //Delete created User from Web table
	     driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr[1]/td[1]/input")).click();
	     driver.findElement(By.id("btnDelete")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("dialogDeleteBtn")).click();
	     
	     System.out.println("User is successfully deleted");
	     
	     // Sign out from application
	     driver.findElement(By.xpath("//a[@id='welcome']")).click();
         Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 System.out.println("Logged out from user creation page");
		 
		 // Quit Application
		 driver.quit();
		
	}  







}
