import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;


public class Main {

   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get("https://trash.devshell.site/email.php");
        WebElement inputApi = driver.findElement(By.xpath("//input[@name='apikey']"));
        WebElement btnGenerate = driver.findElement(By.xpath("//*[@id='submit']"));
        inputApi.sendKeys("43673432");
       btnGenerate.click();
       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement mailWait = (new WebDriverWait(driver, Duration.ofSeconds(5))
               .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='1']"))));
        String loginMail = mailWait.getAttribute("value");

       ArrayList<String> loginData = new ArrayList(Collections.singleton(loginMail));

       driver.switchTo().newWindow(WindowType.TAB).get("https://trash.devshell.site/email.php");
       WebElement inputApi2 = driver.findElement(By.xpath("//input[@name='apikey']"));
       WebElement btnGenerate2 = driver.findElement(By.xpath("//*[@id='submit']"));
       inputApi2.sendKeys("43673432");
       btnGenerate2.click();
       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
       WebElement mailWait2 = (new WebDriverWait(driver, Duration.ofSeconds(5))
               .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='1']"))));
       String loginMail2 = mailWait2.getAttribute("value");
       loginData.add(loginMail2);


       driver.switchTo().newWindow(WindowType.TAB).get("https://trash.devshell.site/roundcube/");
       WebElement loginField = driver.findElement(By.xpath("//input[@id='rcmloginuser']"));
       loginField.sendKeys(loginData.get(0));
       WebElement passField = driver.findElement(By.xpath("//input[@id='rcmloginpwd']"));
       passField.sendKeys("p@ssw0rd777");
       WebElement loginBtn = driver.findElement(By.xpath("//button[@id='rcmloginsubmit']"));
       loginBtn.click();
       WebElement sendMail = driver.findElement(By.xpath("//a[@id='rcmbtn100']"));
       sendMail.click();
       WebElement sendTo = driver.findElement(By.xpath("//input[@type='text']"));
       sendTo.sendKeys(loginData.get(1));
       WebElement mailSubject = driver.findElement(By.xpath("//input[@id='compose-subject']"));
       mailSubject.sendKeys("test");
       WebElement textArea = driver.findElement(By.xpath("//textarea[@id='composebody']"));
       textArea.sendKeys("test test test");
       WebElement sendBtn = driver.findElement(By.xpath("//button[@id='rcmbtn110']"));
       sendBtn.click();

       Thread.sleep(5000);

       WebElement logOut = driver.findElement(By.xpath("//a[@id='rcmbtn105']"));
       logOut.click();



      driver.switchTo().newWindow(WindowType.TAB).get("https://trash.devshell.site/roundcube/");
      WebElement loginField2 = driver.findElement(By.xpath("//input[@id='rcmloginuser']"));
     loginField2.sendKeys(loginData.get(1));
      WebElement passField2 = driver.findElement(By.xpath("//input[@id='rcmloginpwd']"));
      passField2.sendKeys("p@ssw0rd777");
       WebElement loginBtn2 = driver.findElement(By.xpath("//button[@id='rcmloginsubmit']"));
       loginBtn2.click();











//       driver.switchTo().newWindow(WindowType.TAB).get("https://trash.devshell.site/roundcube/");
//       WebElement loginField2 = driver.findElement(By.xpath("//input[@id='rcmloginuser']"));
//       loginField2.sendKeys(loginData.get(1));
//       WebElement passField2 = driver.findElement(By.xpath("//input[@id='rcmloginpwd']"));
//       passField2.sendKeys("p@ssw0rd777");
//       WebElement loginBtn2 = driver.findElement(By.xpath("//button[@id='rcmloginsubmit']"));
//       loginBtn2.click();
//
//       ArrayList<String> newTab = new ArrayList (driver.getWindowHandles());
//       driver.switchTo().window(newTab.get(1));
















    }


}
