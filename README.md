Install TrueAutomation Client     
    https://trueautomation.io/docs/#/install-client 


Run command to initialize your project
    trueautomation init

TO LAUNCH chromedriver
    environment/chromedriver

TO LAUNCH geckodriver
    environment/geckodriver

TO LAUNCH edgedriver
    environment/MicrosoftWebDriver.exe


TO RUN TEST with chromedriver
    mvn clean test -Dwebdriver=chrome

TO RUN TEST with geckodriver
    mvn clean test -Dwebdriver=gecko

TO RUN TEST with safaridriver
    mvn clean test -Dwebdriver=safari

TO RUN TEST with MicrosoftWebDriver (Windows 10 needed)
    mvn clean test -Dwebdriver=edge

TO RUN TEST with appium IOS (appium should be installed and started)
    mvn clean test -Dwebdriver=ios

TO RUN TEST with appium Android (appium should be installed and started)
    mvn clean test -Dwebdriver=android