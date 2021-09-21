package Authorize;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    protected WebDriverWait wait;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора меню пользователя
     */
    @FindBy(xpath = "//div[@class='sidebar__client-name']")
    private WebElement userName;
    /**
     * определение локатора кнопки выхода из аккаунта
     */
    @FindBy(xpath = "/html/body/app-root/mdm-logged/main/div/mdm-dashboard/div/aside/nav/ul/li[6]/a")
    private WebElement logoutBtn;

    /**
     * метод для получения имени пользователя из меню пользователя
     */
    public String getUserName() {
        wait.until(ExpectedConditions.visibilityOf(userName));
        return this.userName.getText();

    }
    /**
     * метод для нажатия кнопки меню пользователя
     */
    //public void entryMenu() {
    //  userMenu.click(); }

    /**
     * метод для нажатия кнопки выхода из аккаунта
     */
    public void userLogout() {
        logoutBtn.click();
    }
}