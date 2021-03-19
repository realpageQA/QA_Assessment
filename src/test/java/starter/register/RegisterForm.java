package starter.register;

import org.openqa.selenium.By;

public class RegisterForm {

    public static By TITLE_RADIOBUTTON = By.id("id_gender2");
    public static By FIRST_NAME_FIELD = By.id("customer_firstname");
    public static By LAST_NAME_FIELD = By.id("customer_lastname");
    public static By PASSWORD_FIELD = By.cssSelector("passwd");
    public static By DAY_LIST = By.xpath("//*[@id='days']//option[10]");
    public static By MONTH_LIST = By.xpath("//*[@id='months']//option[5]");
    public static By YEAR_LIST = By.xpath("//*[@id='years']//option[31]");
    public static By NEWSLETTER_FIELD = By.id("newsletter");
    public static By OFFERS_FIELD = By.id("optin");
    public static By COMPANY_FIELD = By.id("company");
    public static By ADDRESS_FIELD = By.id("address1");
    public static By ADDRESS_LINE_FIELD = By.id("address2");
    public static By CITY_FIELD = By.id("city");
    public static By STATE_LIST = By.xpath("//*[@id='id_state']//option[6]");
    public static By ZIP_FIELD = By.id("postcode");
    public static By INFORMATION_FIELD = By.id("other");
    public static By PHONE_FIELD = By.id("phone");
    public static By PHONE_MOBILE_FIELD = By.id("phone_mobile");
    public static By ALIAS_FIELD = By.id("alias");
    public static By REGISTER_BUTTON = By.id("submitAccount");

}
