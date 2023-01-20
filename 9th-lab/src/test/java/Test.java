import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Test {

    private static String basicURL="https://clans.by/";
    @org.testng.annotations.Test
    public void WishListTest() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(basicURL);
        Thread.sleep(3000);
        WebElement search=driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div[1]"));
        search.click();
        WebElement searchinput = driver.findElement(By.xpath("//input[@name='search']"));
        searchinput.sendKeys("Джинсы"+"\n");


    }
}
