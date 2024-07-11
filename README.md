## **AmazonUK BDD Tests (Cucumber - Selenide):**
Why Selenide.

Selenide is a wrapper built around Selenium WebDriver but it simplifies a lot of the WebDriver's complexities. 
It requires less boilerplate code and thereby can keep test cases shorter and more readable.

Also has automatic Browser Management: With Selenide you don't need to manually manage browser instances. It automatically opens and closes browsers for you. 
Automatic Waits: Selenide has built-in implicit and explicit waits, which handle many synchronization issues out-of-the-box. This saves testers from having to manually write waits.
And  at the same time has Automatic Screenshots: Whenever tests fail in Selenide, it automatically takes a screenshot and saves the HTML of the page. This can be incredibly helpful for debugging.

## **Running Test:**

Open the command prompt and navigate to the folder in which pom.xml file is present.
Run the below Maven command.

    mvn clean test


Once the execution completes report & log will be generated in below folder.

**Report:** 		*target/cucumber.html*<br>
**Screenshots:** 		*test-result/report*<br>
(can be set to defauld folder build/reports/tests
![CucumberReport](https://github.com/NadyaKozachuk/AmazonUK/assets/71333994/5ca507ef-5d67-4d88-a8da-ab3572e8e5d1)


