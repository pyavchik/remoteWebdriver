# RemoteWebDriver using, the example project

**Description** You are viewing the README for using the RemoteWebDriver with TrueAutomation.
This is the detailed instructions how to run tests, using different WebDrivers within the example project.

To use the project, you must have your own [registered TrueAutomation account](https://app.trueautomation.io/auth/signup) and the installed TrueAutomation client.
If you have not yet installed client, please checkout the installation process - https://trueautomation.io/docs/#/install-client

## Setup

At first, clone the project and initialize it from the project's root folder:

```bash 
git clone https://github.com/pyavchik/remoteWebdriver.git
```
Go to the project's root folder and run command: ```trueautomation init```, follow the instructions.

## Run tests instruction

### ChromeDriver

To run a test, first you need to start a remote ChromeDriver, use a separate console window to do this.
You can use ChromeDriver installed on your machine or the ChromeDriver downloaded with the project.

To use the downloaded ChromeDriver, just run it from the project's root folder:

```bash
environment/chromedriver
```

Then, you can run the default test:

```bash
mvn clean test -Dwebdriver=chrome
```

### Geckodriver

To run a test, first you need to start a remote Geckodriver, use a separate console window to do this.
You can use Geckodriver installed on your machine or the Geckodriver downloaded with the project.

To use the downloaded Geckodriver, just run it from the project's root folder:

```bash
environment/geckodriver
```

Then, you can run the default test:

```bash
mvn clean test -Dwebdriver=gecko
```

### SafariDriver

SafariDriver is used only with Mac OS.
To run a test, you need to enable Remote Automation in the Safari Develop menu and then start a remote SafariDriver,
using a separate console window:

```bash
safaridriver
```

After that, you can run the default test:

```bash
mvn clean test -Dwebdriver=safari
```

### MicrosoftWebDriver

MicrosoftWebDriver is used only with Windows 10 OS.
To run a test, first you need to start a remote MicrosoftWebDriver, use a separate console window to do this.
You can use MicrosoftWebDriver installed on your machine or the MicrosoftWebDriver downloaded with the project.

To use the downloaded MicrosoftWebDriver, just run it from the project's root folder:

```bash
environment/MicrosoftWebDriver.exe
```

Then, you can run the default test:

```bash
mvn clean test -Dwebdriver=edge
```
### Appium iOS

To run a test on iOS devices, you must have the [installed Appium framework](https://appium.io/).

You can use a real iOS device or [the iOS devices emulator](https://developer.apple.com/xcode/). In each of the cases,
you need to get the 'UDID' of a using device and insert it in the test, you can get 'UDID' with a command: 'xcrun simctl list devices | grep 'Booted''.

Also, do not forget to enable the usb debugging, if you use a real iOS device.

Now, start Appium on the default port:

```bash
appium &
```
Run the default test:

```bash
mvn clean test -Dwebdriver=ios
```

### Appium Android

To run a test on Android devices, you must have the [installed Appium framework](https://appium.io/).

You can use a real Android device or [the Android devices emulator](https://developer.android.com/studio/). In each of the cases,
you need to get the 'UDID' of a using device and insert it in the test, you can get 'UDID' with a command: 'adb devices'.

Also, do not forget to enable the usb debugging, if you use a real Android device.

Now, start Appium on the default port:

```bash
appium &
```

Run the default test:

```bash
mvn clean test -Dwebdriver=android
```