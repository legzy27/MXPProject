$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 3,
  "name": "This is new upgraded Mazda Europe Homepage",
  "description": "As a user i want to find a dealer and test drive a car",
  "id": "this-is-new-upgraded-mazda-europe-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Findadealer"
    },
    {
      "line": 2,
      "name": "@slow"
    }
  ]
});
formatter.before({
  "duration": 2248359734,
  "status": "passed"
});
formatter.before({
  "duration": 9969667077,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "I want to drive a mazda car",
  "description": "",
  "id": "this-is-new-upgraded-mazda-europe-homepage;i-want-to-drive-a-mazda-car",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "I want to test drive a car",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I click Book a Test Drive",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I see collection of vehicles",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I select one vehicle",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I select a dealer",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I select a date and time",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I enter contact details",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I request a Test Drive",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I will see Thank You!",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.i_want_to_test_drive_a_car()"
});
formatter.result({
  "duration": 1314421431,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_click_Book_a_Test_Drive()"
});
formatter.result({
  "duration": 1977284164,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_see_collection_of_vehicles()"
});
formatter.result({
  "duration": 139287170,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_select_one_vehicle()"
});
formatter.result({
  "duration": 86248959,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_select_a_dealer()"
});
formatter.result({
  "duration": 1639200070,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_select_a_date_and_time()"
});
formatter.result({
  "duration": 60560401128,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[1]/div[1]/fieldset/div/div/div[1]/div/div/div[1]/table/tbody/tr[3]/td[9]\"}\nCommand duration or timeout: 60.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027SYZYGY-1151\u0027, ip: \u0027192.168.3.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d43.0.1, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: c89ffee5-8fba-437f-99f1-8702f18891bf\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[1]/div[1]/fieldset/div/div/div[1]/div/div/div[1]/table/tbody/tr[3]/td[9]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat com.mazda.MXPProject.Step_Definition.i_select_a_date_and_time(Step_Definition.java:347)\r\n\tat ✽.Then I select a date and time(Homepage.feature:31)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[1]/div[3]/div/div/div/section/div/ul/li[3]/ul/li/form/div[1]/div[1]/fieldset/div/div/div[1]/div/div/div[1]/table/tbody/tr[3]/td[9]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027SYZYGY-1151\u0027, ip: \u0027192.168.3.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/aoyedele/AppData/Local/Temp/anonymous3477647189411157619webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/aoyedele/AppData/Local/Temp/anonymous3477647189411157619webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:625)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Step_Definition.i_enter_contact_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definition.i_request_a_Test_Drive()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definition.i_will_see_Thank_You()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step_Definition.i_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is about:blank\u0026utm_content\u003dfirstrun");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 394026644,
  "status": "passed"
});
formatter.after({
  "duration": 10256281,
  "status": "passed"
});
});