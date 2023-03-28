package driver;

import org.openqa.selenium.chrome.ChromeOptions;

public class DriverOptions {
    ChromeOptions options = new ChromeOptions();
    public ChromeOptions setOptions() {
        options.addArguments("--remote-allow-origins=*");

        return options;
    }
}
