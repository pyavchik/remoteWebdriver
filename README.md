Checkout project
```git clone https://github.com/shapovalovei/trueautomation-testng.git```

Install TrueAutomation Client     
    https://trueautomation.io/docs/#/install-client 

Run command to initialize your project
    ```bash
    trueautomation init
    ```

TO LAUNCH chromedriver
    ```bash
    environment/chromedriver
    ```

TO LAUNCH geckodriver
    ```bash
    environment/geckodriver
    ```

TO LAUNCH edgedriver
   ```bash
   environment/MicrosoftWebDriver.exe
   ```


TO RUN TEST with chromedriver
    ```bash
    mvn clean test -Dwebdriver=chrome
    ```

TO RUN TEST with geckodriver
   ```bash
   mvn clean test -Dwebdriver=gecko
   ```

TO RUN TEST with safaridriver
    ```bash
    mvn clean test -Dwebdriver=safari
    ```

TO RUN TEST with MicrosoftWebDriver (Windows 10 needed)
    ```bash
    mvn clean test -Dwebdriver=edge
    ```

TO RUN TEST with appium IOS (appium should be installed and started)
    ```bash
    mvn clean test -Dwebdriver=ios
    ```

TO RUN TEST with appium Android (appium should be installed and started)
    ```bash
    mvn clean test -Dwebdriver=android
    ```
