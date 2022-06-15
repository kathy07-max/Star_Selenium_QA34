import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartCss {
    WebDriver wd;

    @Test
    public void startCssLocators(){

        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement el1 =wd.findElement(By.id("root"));
        WebElement el2  =wd.findElement(By.tagName("a"));


    }

    @Test
    public void h_workCss(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement loginTab=wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        WebElement emailTextBox=wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("shevchenk@mail.ru");

        WebElement passwordTextBox=wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("020985$Max");

        WebElement registrationButton=wd.findElement(By.cssSelector("div.login_login__3EHKB :last-child"));
        registrationButton.click();

    }
}
