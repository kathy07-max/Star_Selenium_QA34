import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestStart {
    WebDriver wd;

    @Test
    public void start(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.quit();//clous all tabs
    }

    @Test
    public void firstTest(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

         WebElement loginTab=wd.findElement(By.cssSelector("[href='/login']"));
         loginTab.click();

         WebElement emailTextBox=wd.findElement(By.cssSelector("[placeholder='Email']"));
         emailTextBox.click();
         emailTextBox.clear();
         emailTextBox.sendKeys("shevchenko@mail.ru");

         WebElement passwordTextBox=wd.findElement(By.cssSelector("[placeholder='Password']"));
         passwordTextBox.click();
         passwordTextBox.clear();
         passwordTextBox.sendKeys("020985$Max");

         WebElement loginButton=wd.findElement(By.cssSelector("button"));
         loginButton.click();
    }
}
