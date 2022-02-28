package com.Maven_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;

	// 1.Browser launch()
	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("internet explorer")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir" + "\\Driver\\chromedriver.exe"));
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();

		return driver;

	}

	// 2. Close()
	public static void closeBrowser() {

		driver.close();
	}

	// 3. Quit()
	public static void quiteBrowser() {

		driver.close();
	}

	// 4. Navigate to()
	public static void navigateToUrl(String navigateTourl) {

		driver.navigate().to(navigateTourl);
	}

	// 5. Navigate back()
	public static void navigateBackUrl() {

		driver.navigate().back();
	}

	// 6. Navigate forward ()
	public static void navigateFarwardUrl() {

		driver.navigate().forward();
	}

	// 7. Navigate refresh()
	public static void navigateRefreshUrl() {

		driver.navigate().refresh();
	}

	// 8. Get()
	public static void getURL(String url) {

		driver.get(url);
	}

	// 9. Alert()
	// accept()
	public static void alertAccept() {

		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
	}

	// dismiss()
	public static void alertDismiss() {

		Alert alertdismiss=driver.switchTo().alert();
		alertdismiss.dismiss();

	}

	// sendkeys()
	public static void alertSendkeys(String inputtext) {

		Alert promtalert = driver.switchTo().alert();
		promtalert.sendKeys(inputtext);
	}

	public static void alertGettext(String inputtext) {

		Alert promtalert = driver.switchTo().alert();
		promtalert.sendKeys(inputtext);
		String text = promtalert.getText();
		System.out.println(text);
	}

	// 10. Action(All methods from action class)
	// Action - Click
	public static void actionClick(WebElement element) {

		Actions act = new Actions(driver);
		act.click(element).build().perform();

	}

	// Action - ContextClick
	public static void actionContextClick(WebElement element) {

		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();

	}

	// Action - doubleClick
	public static void actionDoubleClick(WebElement element) {

		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();

	}

	// Action - DragandDrop
	public static void actionDragandDrop(WebElement drag, WebElement drop) {

		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

	}

	// 11. Frames()
	public static void switchToframe(int index) {

		driver.switchTo().frame(index);
	}

	public static void switchToframe(String idorname) {

		driver.switchTo().frame(idorname);
	}

	public static void switchToframe(WebElement element) {

		driver.switchTo().frame(element);
	}

	public static void switchTDefaultContent() {

		driver.switchTo().defaultContent();

	}

	public static void switchToparentFrame() {

		driver.switchTo().parentFrame();

	}

	// 12. Robot()
	public static void keyboardEventDown() throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// 13. Window handles()
	public static void methodWindowHandle() {

		String page = driver.getWindowHandle();
		System.out.println(driver.switchTo().window(page).getTitle());
	}

	public static void methodWindowHandles() {

		Set<String> pages = driver.getWindowHandles();
		for (String tabs : pages) {
			String title = driver.switchTo().window(tabs).getTitle();
			System.out.println(title);

		}

	}

	// 14. Drop down ()
	// Single DD
	public static void singleDropDown(WebElement data,  int index) {

		
		Select s = new Select(data);
		s.selectByIndex(index);
	}

	public static void singleDropDown_value(WebElement data,  String value) {

		
		Select s = new Select(data);
		s.selectByValue(value);
	}

	public static void singleDropDown_visibleText(WebElement data,  String visibletext) {

		
		Select s = new Select(data);
		s.selectByVisibleText(visibletext);
	}

	// 15. Check box()
	public static void methodChechbox(WebElement chkbox) {
		chkbox.click();
	}

	// 16. Is enable()
	public static void methodIsEnable(WebElement element) {

		boolean isenable = element.isEnabled();
		System.out.println(isenable);

	}

	// 17. Is displayed()
	public static void methodIsDisplayed(WebElement element) {

		boolean isdisplayed = element.isDisplayed();
		System.out.println(isdisplayed);

	}

	// 18. Is selected()
	public static void methodIsSelected(WebElement element) {

		boolean isselected = element.isSelected();
		System.out.println(isselected);

	}

	// 19. Get options()
	public static void getAllOptions(WebElement element) {

		Select s=new Select(element);
		List<WebElement> alloptions = s.getOptions();
		for (WebElement options : alloptions) {
			String optiontext = options.getText();
			System.out.println(optiontext);
		}
	}

	// 20. Get title()
	public static void getTitleName() {

		String title = driver.getTitle();
		System.out.println("Title: " + title);
	}

	// 21. Get current url()
	public static void getCurrenturl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);

	}

	// 22. Get text()
	public static void getTextMethod(WebElement element) {

		String text = element.getText();
		System.out.println("Text " + text);

	}

	// 23. Get attribute()
	public static void getAttributeMethod(WebElement element) {

		String attribute = element.getText();
		System.out.println("Text " + attribute);

	}

	// 24. Wait()
	// Implicit Wait
	public static void implicitwait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	// Explicit Wait
	public static void explicitwait(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// 25. Take screenshot()
	public static void methodTakesScreenshot( String location)
			throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(location);

		FileUtils.copyFile(src, dest);

	}

	// 26. Scroll up and down()
	public static void scrollIntoView( WebElement element, String viewpoint) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(viewpoint, element);

	}

	public static void scrollUp( String upvalue) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(upvalue);

	}

	public static void scrollDown( String downvalue) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(downvalue);

	}

	// 27. Sendkeys()
	public static void sendKeysmethod(WebElement element, String inputvalue) {

		element.sendKeys(inputvalue);

	}

	// 28. Get first selected options()
	public static void methodGetfirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String firstselectedtext = firstSelectedOption.getText();
		System.out.println(firstselectedtext);
	}

	// 29. Get all selected options()
	public static void methodGetAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selectedoptions : allSelectedOptions) {
			String selectedtext = selectedoptions.getText();
			System.out.println(selectedtext);
		}	
	}

	// 30. Is multiple()
	public static void methodIsMultiple(WebElement element) {
		Select s = new Select(element);
		boolean ismultiple = s.isMultiple();
		System.out.println("Is Multiple : " + ismultiple);

	}

	// 31. Click()
	public static void clickmethod(WebElement element) {

		element.click();

	}

	// 32.RadioButton()
	public static void radiobuttonmethod(WebElement radiobutton) {

		radiobutton.click();

	}
}
