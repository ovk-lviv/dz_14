import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageElements {

    private By sideNavButtons = By.id("item-4");
    private By clickMeButton = By.xpath("//div/button[text()='Click Me']");
    private By textUnderButton = By.id("dynamicClickMessage");


    public By getSideNavButtons() {
        return sideNavButtons;
    }

    public By getClickMeButton() {
        return clickMeButton;
    }

    public By getTextUnderButton() {
        return textUnderButton;
    }
}
