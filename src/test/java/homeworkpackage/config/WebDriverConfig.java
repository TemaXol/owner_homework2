package homeworkpackage.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("FIREFOX")
    Browser getBrowser();

    @Key("remoteUrl")
    @DefaultValue("https://localhost:4444")
    URL getRemoteUrl();
}
