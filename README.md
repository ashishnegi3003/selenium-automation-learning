# SeleniumDemo (Beginner Selenium Project)

My journey into Selenium automation with Java.
This repo contains small practice programs for cross-browser navigation and locator exploration, printing page titles and validating elements along the way.


## What this project contains

### Program 1: Cross-browser title check (`SeleniumLearning1`)
- Launches **Chrome**, visits `https://www.amazon.in/`, gets the page title, then quits
- Launches **Firefox**, visits `https://www.flipkart.in/`, gets the page title, then quits
- Prints both titles to the console

### Program 2: Locators practice (`SeleniumLearning2`)
This second learning program opens a practice login page and finds elements using different Selenium locators.
- Launches **Chrome** and opens `https://practicetestautomation.com/practice-test-login/`
- Finds elements using:
    - `id`, `name`, `className`
    - `xpath`, `cssSelector`
    - `linkText`, `partialLinkText`
    - `Relative Locators` (`below`, `toRightOf`)
- Uses `findElements()` to collect all `input` fields
- Quits the browser

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

