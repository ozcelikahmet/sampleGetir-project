$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/sampleGetir.feature");
formatter.feature({
  "name": "Validate functionalities for Sample Getir app",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sampleGetir"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user taps on \"SKIP\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SampleGetirStepDefs.userTapsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"GetirSample\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleGetirStepDefs.userValidatesIsDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate to add and remove product from basket",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sampleGetir"
    },
    {
      "name": "@testCart"
    }
  ]
});
formatter.step({
  "name": "user taps on \"WATER\"",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userTapsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user taps on first product",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userTapsOnFirstProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user saves product details",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userSavesProductDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user taps on \"ADD TO CART\"",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userTapsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes back",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userGoesBack()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user taps on cart icon",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userTapsOnCartIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates product details and price",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userValidatesProductDetailsAndPrice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user taps on \"Remove\"",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userTapsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes back",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userGoesBack()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user taps on cart icon",
  "keyword": "And "
});
formatter.match({
  "location": "SampleGetirStepDefs.userTapsOnCartIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"Your Cart is empty !\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleGetirStepDefs.userValidatesIsDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});