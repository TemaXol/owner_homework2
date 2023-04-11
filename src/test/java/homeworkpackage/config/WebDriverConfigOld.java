package homeworkpackage.config;

public class WebDriverConfigOld {

    public String getBaseUrl() {
        String baseUrl = System.getProperty("baseUrl");
        return baseUrl;
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        return Browser.valueOf(browser);
    }
}
