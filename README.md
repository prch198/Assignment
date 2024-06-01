Assignment:-

Implemented automation test scripts using Selenium, TestNG & JAVA.
Page object Model (Design pattern) is used for the framework.

src/test/java -> Contains TestScript 

3 Sections:

Pages:- Form, Image
It contains all the webelements and action methods. PageFactory class is used to initialize the elements of page.
Element is located using id, xpath, tagname.

Utility:
BaseTest:- It contains Webdriver initialization, launching, page initialization and closing of browser.
Action:- Contains method to perform action like click, enter text.

Tests: 
It contains Test class the test steps to be performed.

Test class extends BaseTest -> (calls) Page Class -> (calls) Action Class

testng.xml file contains the name of the test class to be executed.










