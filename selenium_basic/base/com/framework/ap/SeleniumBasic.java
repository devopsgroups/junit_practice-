package com.framework.ap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBasic {
	
	public static Properties CONFIG=null;
	public static Properties OR=null;
	
	
	
	public void SeleniumBasic()  {
		
		try {
			OR = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//com//framework//properties//OR.properties");
			OR.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private By getBy(String property, Properties props, ElementType type) {
		By by = null;
		try {
			switch (type) {

			case id:
				by = By.id(props.getProperty(property));
				break;
			case name:
				by = By.name(props.getProperty(property));
				break;
			case xpath:
				by = By.xpath(props.getProperty(property));
				break;
			case clsname:
				by = By.className(props.getProperty(property));
				break;
			default:
				by = null;
				break;
			}
		} catch (Exception e) {
			/*ErrorBucketUtil.getErrorFromBucket("getBy failed: " + getPortableString(e.toString()) + ": " + property
					+ " by : " + type.toString() + " value : " + props.getProperty(property));
			*/		
			by = null;
		}
		return by;
	}
	
	
	public boolean elementClick(WebDriver dr, String property, ElementType type, Properties props,
			 int...assertion) {
		boolean success = false;
		String message = "";
		WebElement element = null;
		Map<WebElement,String> elementState = new HashMap<>();
		elementState = waitForElementState(dr, property, type, ElementCondition.isPresent, props);
		for(Map.Entry<WebElement, String> entry : elementState.entrySet()) {
			element = entry.getKey();
			message = entry.getValue();
		}
		try {
			element.click();
			success = true;
		} catch (Exception e) {
			String ExceptionMessage =  "elementClick failed: " + ": " + property
					+ " by : " + type.toString() + " value : " + props.getProperty(property);
			
		}
		return success;
	}

	
	public  Map<WebElement,String> waitForElementState(WebDriver dr, String property, ElementType type,ElementCondition condition, Properties props,int time) {
		WebElement element = null;
		By by = getBy(property, props, type);
		Map<WebElement, String> map = new HashMap<>();
		element = getElement(dr,condition,by,time);
		String message = "";
		if (element == null) {
			try {
				throw new Exception();
			} catch (Exception e) {
				message = "State = " + condition.toString() + " failed: ";
			}
		} else {
			message = "State = " + condition.toString() + " Passed: ";

		}
		map.put(element, message);
		return map;
	}
	
	protected enum ElementCondition {
		isDisplayed, isClickable, isPresent,isNotDisplayed
	}
	
	
	
	public WebElement getElement(WebDriver dr, String property, ElementType type, Properties props,
			 int... assertion) {
		String message = "";
		WebElement element = null;
		Map<WebElement,String> elementState = new HashMap<>();
		elementState = waitForElementState(dr, property, type, ElementCondition.isDisplayed, props);
		for(Map.Entry<WebElement, String> entry : elementState.entrySet()) {
			element = entry.getKey();
			message = entry.getValue();
		}
		try {
			if(element==null) {
				throw new Exception();
			}
		} catch (Exception e) {
			String ExceptionMessage = "elementClick failed: "  + ": " + property
					+ " by : " + type.toString() + " value : " + props.getProperty(property);
			
		}
		return element;
	
	}
	
	private WebElement getElement(WebDriver dr, ElementCondition condition, By by, int time) {
		WebElement element = null;
		try {
//			Wait<AndroidDriver> wait = new FluentWait(dr).withTimeout(time, TimeUnit.SECONDS)
//					.pollingEvery(POLLING_MAX_TIME_IN_MILLISEC, TimeUnit.MILLISECONDS)
//					.ignoring(NoSuchElementException.class);
			WebDriverWait wait = new WebDriverWait(dr, time);
			switch (condition) {
			case isClickable:
				element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(by));
				break;
			case isDisplayed:
				element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
				break;
			case isPresent:
				element = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));
				break;
			default:
				break;

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
private WebElement getElement(WebDriver dr, ElementCondition condition, By by) {
		
		WebElement element = null;
//		Wait<AndroidDriver> wait = new FluentWait(dr).withTimeout(MAX_HIGH_WAIT, TimeUnit.SECONDS)
//				.pollingEvery(POLLING_MAX_TIME_IN_MILLISEC, TimeUnit.MILLISECONDS)
//				.ignoring(NoSuchElementException.class);
		 WebDriverWait wait = new WebDriverWait(dr, 20); 
		try {
			switch (condition) {
			case isClickable:
				
				element = new FluentWait<>(dr).withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(TimeoutException.class, NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(by));
				
				//element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(by));
				break;
			case isDisplayed:
				
				element = new FluentWait<>(dr).withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(TimeoutException.class, NoSuchElementException.class)
				.until(ExpectedConditions.visibilityOfElementLocated(by));
				
			//	element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
				break;
			case isPresent:
				element = new FluentWait<>(dr).withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(TimeoutException.class, NoSuchElementException.class)
				.until(ExpectedConditions.presenceOfElementLocated(by));
			//	element = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));
				break;
			default:
				break;

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return element;
	}

	
	
	public Map<WebElement,String> waitForElementState(WebDriver dr, String property, ElementType type,ElementCondition condition, Properties props) {
		WebElement element = null;
		By by = getBy(property, props, type);
		Map<WebElement, String> map = new HashMap<>();
		element = getElement(dr,condition,by);
		String message = "";
		if (element == null) {
			try {
				throw new Exception();
			} catch (Exception e) {
				message = "State = " + condition.toString() + " failed: ";
			}
		} else {
			message = "State = " + condition.toString() + " Passed: ";

		}
		map.put(element, message);
		return map; 
	}
	
	
	public boolean elementOnClick(WebDriver dr, String property, ElementType type, Properties props,
			 int... assertion) {
		boolean success = false;
		String message = "";
		try {
			dr.findElement(getBy(property, props, type)).click();
			message = "elementClick passed: " + property + " by : " + type.toString() + " value : "
					+ props.getProperty(property);
			success = true;
		} catch (Exception e) {
			message = "elementClick failed: " +  ": " + property
					+ " by : " + type.toString() + " value : " + props.getProperty(property);
			

			success = false;
		}
		
		if (!success) {
			System.out.println("not able to click on element");
		}
		return success;
	}

	
	/*
	
	BadeMethods:
		 delay
		isElementPresent
		isElementEnabled 
		isElementDisplayed 
		elementClick
		elementOnClick
		isElementPresentByLocator
		ElementClickByLocator
		elementIndexClick
		elementIndexGetText
		elementIndexGetAttibute
		elementGetState
		getElementIndex
		elementIndexGetSize
		getElementLst
		enterMessage
		enterMessageWithoutClick 
		enterMessageByIndex
		 Leave Image related methods 
		startApplication
		openApplication
		closeApplication
		deviceHome
		getText
		waitForText
		WaitForElementAttribute 
		WaitForElementText
		WaitforAttibuteValue
		WaitForElement 
		WaitForVisible 
		waitForNotVisible
		WaitForElementNotPresent 
		waitForImage 
		waitForImageText
		waitForImageTextWithThresold
		Swipe
		screenTap
		imageTextLongPress
		elementlongPress 
		elementlongPressByIndex 
		swipe
	*/
}
