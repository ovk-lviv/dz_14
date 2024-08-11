import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PageWebtablesTest extends BaseTest {

    PageWebtables pwt = new PageWebtables();


    @Test
    public void fillInForm() {
        driver.get("https://demoqa.com/webtables");
        driver.findElement(pwt.getAddButton()).click();
        driver.findElement(pwt.getFirstName()).sendKeys("John");
        driver.findElement(pwt.getLastName()).sendKeys("Doe");
        driver.findElement(pwt.getUserEmail()).sendKeys("j.doe@domain.com");
        driver.findElement(pwt.getAge()).sendKeys("35");
        driver.findElement(pwt.getSalary()).sendKeys("35000");
        driver.findElement(pwt.getDepartment()).sendKeys("Sales");
        driver.findElement((pwt.getSubmit())).click();

        List<WebElement> records = driver.findElements(pwt.getRecords());

        int rowCount = records.size();

        WebElement lastRow = driver.findElement(By.xpath("//div[@role='rowgroup']" + "[" + rowCount + "]" + "/div/div"));
        Assert.assertEquals(lastRow.getText(), "John");

    }

    @Test
    public void editRecord() {
        driver.get("https://demoqa.com/webtables");
        driver.findElement(pwt.getAddButton()).click();
        driver.findElement(pwt.getFirstName()).sendKeys("John");
        driver.findElement(pwt.getLastName()).sendKeys("Doe");
        driver.findElement(pwt.getUserEmail()).sendKeys("j.doe@domain.com");
        driver.findElement(pwt.getAge()).sendKeys("35");
        driver.findElement(pwt.getSalary()).sendKeys("35000");
        driver.findElement(pwt.getDepartment()).sendKeys("Sales");
        driver.findElement((pwt.getSubmit())).click();

        List <WebElement> actionButtons = driver.findElements(pwt.getEditRecord());
        int rowCount = actionButtons.size();

        WebElement editButton = driver.findElement(By.id("edit-record-"+rowCount));
        editButton.click();
        driver.findElement(pwt.getUserEmail()).clear();
        driver.findElement(pwt.getUserEmail()).sendKeys("updatedmail@domain.com");
        driver.findElement((pwt.getSubmit())).click();

        WebElement lastRowMail = driver.findElement(By.xpath("//div[@role='rowgroup']" + "[" + rowCount + "]" + "/div/div[4]"));

        Assert.assertEquals(lastRowMail.getText(), "updatedmail@domain.com");




    }
}
