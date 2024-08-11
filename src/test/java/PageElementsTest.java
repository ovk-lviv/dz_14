import org.testng.Assert;
import org.testng.annotations.Test;

public class PageElementsTest extends BaseTest{

    PageElements pe = new PageElements();



    @Test
    public void getMessageText() {
        driver.get("https://demoqa.com/elements");
        driver.findElement(pe.getSideNavButtons()).click();
        driver.findElement(pe.getClickMeButton()).click();
        Assert.assertEquals(driver.findElement(pe.getTextUnderButton()).getText(), "You have done a dynamic click");
    }
}
