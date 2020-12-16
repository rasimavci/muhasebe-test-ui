package utils;

import java.util.Random;

public class Values {
////////////register//////////////////////////////////////////
    static Random random = new Random();
    static int random_id = random.nextInt(5);
    static String randomid1 = String.valueOf(random_id);
    static String fullname = "rasim1234";
    static String VKN = randomid1;
    static String defterID = "7840266351";
    static String company = "Ronwell";
    static String phone = "05624521245";
    static String address = "Edirne";
    static String email = "rasim3@gmail.com";
    static String password = "1234";
///////login////////////////////////////////////////////////
    static String loginURL = "https://muhasebe-deploy.herokuapp.com/login";
    static String usernameXpath = "//*[@formcontrolname='username']";
    static String passwordXpath = "//*[@formcontrolname='password']";
    static String loginButtonXpath = "//*[@class='btn btn-primary my-4']";
    static String menuButtonXpath = "//*[@class='media align-items-center']";
    static String logoutButtonXpath = "//span[text() = 'Çıkış Yap']";
    static String validUsername = "7840266351";
    static String validPassword = "1234";
    static String invalidUsername = "1111111";
    static String invalidPassword = "12345";
    static String chromeDriver = "webdriver.chrome.driver";
    static String chromeDriverPath = "chromeDriver/chromedriver.exe";
    static String urlEndsWithLoginMessage = "\nUrl ends with 'login'.\n";
    static String urlDoesNotEndsWithLoginMessage = "Url does not ends with 'login'!";
    static String successfulLoginMessage = "Login successful.";
    static String loginErrorMessage = "Login error!";
    static String changePassXpath = "//*[text()='Şifre Değiştir']";

    public static String getChangePassXpath() {
        return changePassXpath;
    }

    public static void setChangePassXpath(String changePassXpath) {
        Values.changePassXpath = changePassXpath;
    }

    static String eDefterXpath = "(//*[@type='file'])[1]";
    static String eFaturaXpath = "(//*[@type='file'])[2]";

    public static String geteDefterXpath() {
        return eDefterXpath;
    }

    public static void seteDefterXpath(String eDefterXpath) {
        Values.eDefterXpath = eDefterXpath;
    }

    public static String geteFaturaXpath() {
        return eFaturaXpath;
    }

    public static void seteFaturaXpath(String eFaturaXpath) {
        Values.eFaturaXpath = eFaturaXpath;
    }

    public static void setMytoken(String mytoken) {
        mytoken = mytoken;
    }

    public static String getLoginURL() {
        return loginURL;
    }

    public static void setLoginURL(String loginURL) {
        Values.loginURL = loginURL;
    }

    public static String getUsernameXpath() {
        return usernameXpath;
    }

    public static void setUsernameXpath(String usernameXpath) {
        Values.usernameXpath = usernameXpath;
    }

    public static String getPasswordXpath() {
        return passwordXpath;
    }

    public static void setPasswordXpath(String passwordXpath) {
        Values.passwordXpath = passwordXpath;
    }

    public static String getLoginButtonXpath() {
        return loginButtonXpath;
    }

    public static void setLoginButtonXpath(String loginButtonXpath) {
        Values.loginButtonXpath = loginButtonXpath;
    }

    public static String getMenuButtonXpath() {
        return menuButtonXpath;
    }

    public static void setMenuButtonXpath(String menuButtonXpath) {
        Values.menuButtonXpath = menuButtonXpath;
    }

    public static String getLogoutButtonXpath() {
        return logoutButtonXpath;
    }

    public static void setLogoutButtonXpath(String logoutButtonXpath) {
        Values.logoutButtonXpath = logoutButtonXpath;
    }

    public static String getValidUsername() {
        return validUsername;
    }

    public static void setValidUsername(String validUsername) {
        Values.validUsername = validUsername;
    }

    public static String getValidPassword() {
        return validPassword;
    }

    public static void setValidPassword(String validPassword) {
        Values.validPassword = validPassword;
    }

    public static String getInvalidUsername() {
        return invalidUsername;
    }

    public static void setInvalidUsername(String invalidUsername) {
        Values.invalidUsername = invalidUsername;
    }

    public static String getInvalidPassword() {
        return invalidPassword;
    }

    public static void setInvalidPassword(String invalidPassword) {
        Values.invalidPassword = invalidPassword;
    }

    public static String getChromeDriver() {
        return chromeDriver;
    }

    public static void setChromeDriver(String chromeDriver) {
        Values.chromeDriver = chromeDriver;
    }

    public static String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public static void setChromeDriverPath(String chromeDriverPath) {
        Values.chromeDriverPath = chromeDriverPath;
    }

    public static String getUrlEndsWithLoginMessage() {
        return urlEndsWithLoginMessage;
    }

    public static void setUrlEndsWithLoginMessage(String urlEndsWithLoginMessage) {
        Values.urlEndsWithLoginMessage = urlEndsWithLoginMessage;
    }

    public static String getUrlDoesNotEndsWithLoginMessage() {
        return urlDoesNotEndsWithLoginMessage;
    }

    public static void setUrlDoesNotEndsWithLoginMessage(String urlDoesNotEndsWithLoginMessage) {
        Values.urlDoesNotEndsWithLoginMessage = urlDoesNotEndsWithLoginMessage;
    }

    public static String getSuccessfulLoginMessage() {
        return successfulLoginMessage;
    }

    public static void setSuccessfulLoginMessage(String successfulLoginMessage) {
        Values.successfulLoginMessage = successfulLoginMessage;
    }

    public static String getLoginErrorMessage() {
        return loginErrorMessage;
    }

    public static void setLoginErrorMessage(String loginErrorMessage) {
        Values.loginErrorMessage = loginErrorMessage;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        Values.random = random;
    }

    public static int getRandom_id() {
        return random_id;
    }

    public static void setRandom_id(int random_id) {
        Values.random_id = random_id;
    }

    public static String getRandomid1() {
        return randomid1;
    }

    public static void setRandomid1(String randomid1) {
        Values.randomid1 = randomid1;
    }

    public static String getFullname() {
        return fullname;
    }

    public static void setFullname(String fullname) {
        Values.fullname = fullname;
    }

    public static String getVKN() {
        return VKN;
    }

    public static void setVKN(String VKN) {
        Values.VKN = VKN;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Values.company = company;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        Values.phone = phone;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Values.address = address;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Values.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Values.password = password;
    }


}
