$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/shareit/Eclipse/ClassicBDD/src/main/java/Features/sample.feature");
formatter.feature({
  "line": 1,
  "name": "Sample test",
  "description": "",
  "id": "sample-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "To testing the sample testcases",
  "description": "",
  "id": "sample-test;to-testing-the-sample-testcases",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User should enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User should get login successfull message",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleStepDefinition.Enter_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleStepDefinition.User_should_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleStepDefinition.User_should_get_login_successfull_message()"
});
formatter.result({
  "status": "skipped"
});
});