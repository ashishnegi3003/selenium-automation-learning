# Selenium Automation Learning (Beginner Project)

My journey into Selenium automation with Java. This repo has small practice programs covering cross-browser automation, locator strategies, and a basic login flow.

Course: [Master Selenium WebDriver with Java for Beginners](https://www.udemy.com/course/selenium-for-beginners/) by Dmitry Shyshkin

---

## What this project contains

### Program 1: Cross-browser title check (`SeleniumLearning1`)

The first one — just getting the setup working. Launches Chrome and Firefox, visits two sites, grabs the page title from each, and prints them.

**What it does**
- Launches Chrome, visits [`https://www.amazon.in/](https://www.amazon.in/`), captures the page title, and quits
- Launches Firefox, visits [`https://www.flipkart.in/](https://www.flipkart.in/`), captures the page title, and quits
- Prints both titles to the console

**Key methods**
- `chromeTest(url)` → `ChromeDriver` → `getTitle()` → `quit()`
- `firefoxTest(url)` → `FirefoxDriver` → `getTitle()` → `quit()`

---

### Program 2: Locators practice (`SeleniumLearning2`)

Went through all 8 locator strategies across two practice pages — a login form and an exceptions page.

**Method 1** — `findLoginPageElements(driver)`
- Opens [`https://practicetestautomation.com/practice-test-login/`](https://practicetestautomation.com/practice-test-login/)
- Finds elements using:
    - `id`, `name`, `className`
    - `xpath`, `cssSelector`
    - `linkText`, `partialLinkText`
    - `Relative Locators` (`below`, `toRightOf`)
- Uses `findElements()` to collect all `input` fields

**Method 2** — `findExceptionPageElements(driver)`
- Opens [`https://practicetestautomation.com/practice-test-exceptions/`](https://practicetestautomation.com/practice-test-exceptions/)
- Finds elements using:
    - `linkText`, `partialLinkText`
    - `tagName`, `className`, `cssSelector`, `xpath`
    - `id`, `name`, `cssSelector`, `xpath`
- Uses `findElements()` to collect all `button` and `input` fields

**Locator Key Notes**
- Always prefer `id` for performance
- Choose `cssSelector` for simplicity if no IDs
- Use `xpath` with caution - complex and can slow down tests
- Avoid `linkText`, `partialLinkText`, `tagName` unless nothing else works
- Keep locators simple and specific

**Verify Locators in the Browser Dev Console before using them in code**
```
$x("//button[@id='submit']") -> XPath
$$("input[type='password']") -> CSS Selector
```

---

### Program 3: Login Automation (`SeleniumLearning3`)

First complete end-to-end flow. Opens a login page, fills in credentials, clicks submit, and watches it actually work.

**Method** — `LoginPracticePage(driver)`
- Opens [`https://practicetestautomation.com/practice-test-login/`](https://practicetestautomation.com/practice-test-login/)
- Enters username `student` and password `Password123`
- Clicks the Submit button and waits 3 seconds to observe the result
- Quits the browser

**Some useful IntelliJ shortcuts I picked up**

```
a. Ctrl+J - Get all instances of a word
b. Ctrl+D - Duplicate a line
c. Ctrl+K - Commit code
d. Ctrl+Shift+K - Push code
e. Ctrl+Alt+L - Reformat selected code
f. Ctrl+Alt+Shift+L - Reformat entire File
```
---

## Tech stack

- Java
- Selenium WebDriver 4.x
- ChromeDriver + GeckoDriver (Firefox)
- Maven

---

## Prerequisites

- Java JDK 11+
- Google Chrome + Mozilla Firefox installed
- Maven
- Selenium dependency in `pom.xml` (handled via Maven)

> Selenium 4+ includes built-in driver management — no manual ChromeDriver/GeckoDriver path setup needed.
