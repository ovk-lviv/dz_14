import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PageWebtables {

    private By addButton = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By userEmail = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submit = By.id("submit");
    private By records = By.xpath("//div[@role='rowgroup']/div");

    public By getEditRecord() {
        return editRecord;
    }

    private By editRecord = By.className("action-buttons");

    public By getRecords() {
        return records;
    }

    public By getAddButton() {
        return addButton;
    }

    public By getFirstName() {
        return firstName;
    }

    public By getLastName() {
        return lastName;
    }

    public By getUserEmail() {
        return userEmail;
    }

    public By getAge() {
        return age;
    }

    public By getSalary() {
        return salary;
    }

    public By getDepartment() {
        return department;
    }

    public By getSubmit() {
        return submit;
    }

   }
