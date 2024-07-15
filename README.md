## **AmazonUK BDD Tests (Cucumber - Selenide):**
Why Selenide.

Selenide is a wrapper built around Selenium WebDriver but it simplifies a lot of the WebDriver's complexities. 
It requires less boilerplate code and thereby can keep test cases shorter and more readable.

*Also has automatic Browser Management: With Selenide you don't need to manually manage browser instances. It automatically opens and closes browsers for you.*<br> 
*Automatic Waits: Selenide has built-in implicit and explicit waits, which handle many synchronization issues out-of-the-box. This saves testers from having to manually write waits.*<br>
*And  at the same time has Automatic Screenshots: Whenever tests fail in Selenide, it automatically takes a screenshot and saves the HTML of the page. This can be incredibly helpful for debugging.*<br>

## **Running Test:**

Open the command prompt and navigate to the folder in which pom.xml file is present.
Run the below Maven command.

    mvn clean test


Once the execution completes report & log will be generated in below folder.

**Report:** 		*target/cucumber.html*<br>
**Screenshots:** 		*test-result/report*<br>
(can be set to defauld folder build/reports/tests
![CucumberReport](https://github.com/NadyaKozachuk/AmazonUK/assets/71333994/5ca507ef-5d67-4d88-a8da-ab3572e8e5d1)

**Logs:** 	*The SLF4J implements a simple console logger that logs messages at the INFO level.

## ** Integration with BrowserStack:**
Running tests using Selenide on BrowserStack’s Selenium Grid of 3000+ real devices and desktop browsers.
![BrowserStackIntegrationDashboard](https://github.com/user-attachments/assets/e8f70b4f-79cb-49a6-9d1c-e301dfd542b6)

Link to Dashboard:https://automate.browserstack.com/builds/9c3d69a5027f35a21a63d88338ffd5c81a699b1c/sessions/e6cc20f3e3286e8b687f79a0abaa010350a6ed57?auth_token=6fd3f87b84a378d7be147c73e17ac6924ffcfbc1f364b2d27e687fd26be5da04<br>

*Set access credentials*<br>

Set userName and accessKey properties in the browserstack.yml file,available in the root directory, to authenticate your tests on BrowserStack.<br>
Docs: https://www.browserstack.com/docs/automate-turboscale/integrate/selenium/java/selenide#IntelliJ_IDEA
