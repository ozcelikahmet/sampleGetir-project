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
