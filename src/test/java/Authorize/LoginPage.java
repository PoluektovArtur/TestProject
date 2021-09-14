package Authorize;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "/html/body/app-root/mdm-login/div/div[2]/form/div[1]/div/text-form-input[1]/div/div/div/input")
    private WebElement loginField;

    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "/html/body/app-root/mdm-login/div/div[2]/form/div[1]/div/text-form-input[2]/div/div/div/input")
    private WebElement passwordField;

    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "/html/body/app-root/mdm-login/div/div[2]/form/div[2]/button[1]")
    private WebElement loginBtn;

    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
        passwordField.sendKeys(passwd); }

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        loginBtn.click(); }
}
