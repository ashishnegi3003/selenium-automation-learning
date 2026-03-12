# SeleniumDemo (Beginner Selenium Project)

My journey into Selenium automation with Java.
This repo contains small practice programs for cross-browser navigation and locator exploration, printing page titles, and validating elements along the way.


## What this project contains

### Program 1: Cross-browser title check (`SeleniumLearning1`)
**What it does**
- Launches **Chrome**, visits `https://www.amazon.in/`, waits ~3 seconds, captures the page title, and quits
- Launches **Firefox**, visits `https://www.flipkart.in/`, waits ~3 seconds, captures the page title, and quits
- Prints both titles to the console

**Key methods**
- `chromeTest(url)` → `ChromeDriver` → `getTitle()` → `quit()`
- `firefoxTest(url)` → `FirefoxDriver` → `getTitle()` → `quit()`

### Program 2: Locators practice (`SeleniumLearning2`)
This second learning program opens a practice login page and finds elements using different Selenium locators.
- **Method 1**: findLoginPageElements(driver)
  - Finds elements using Opens `https://practicetestautomation.com/practice-test-login/` and finds elements using:
    - `id`, `name`, `className`
    - `xpath`, `cssSelector`
    - `linkText`, `partialLinkText`
    - `Relative Locators` (`below`, `toRightOf`)
  - Uses `findElements()` to collect all `input` fields
- **Method 2**: findExceptionPageElements(driver)
  - Finds elements using Opens `https://practicetestautomation.com/practice-test-exceptions/` and finds elements using:
    - `linkText`, `partialLinkText`
    - `tagName`, `className`, `cssSelector`, `xpath`
    - `id`, `name`, `cssSelector`, `xpath`
  - Uses `findElements()` to collect all `input` fields
- `main()` calls both findLoginPageElements(driver) and findExceptionPageElements(driver) functions
- Uses `main()` to collect all `input`

### Program 3: Login Automation (`SeleniumLearning3`)

**Method**: LoginPracticePage(driver)
- Launches Chrome and opens url `https://practicetestautomation.com/practice-test-login/` and finds elements using:
- Enters username **student** and password **Password123**
- Clicks the **Submit** button and waits ~3 seconds so you can observe the result
- Quits the browser
- Additional comments for some useful commands

## Course followed:
Udemy - [Master Selenium WebDriver with Java for Beginners | Complete Guide to Automation Testing](https://www.udemy.com/course/selenium-for-beginners/) by Dmitry Shyshkin

## Tech stack
- Java
- Selenium WebDriver
- ChromeDriver + GeckoDriver (Firefox)

## Prerequisites
- Java JDK
- Google Chrome + Mozilla Firefox installed
- Maven setup
- Selenium dependency added to your project in `pom.xml`
- Driver setup
