$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/CreationCompte.feature");
formatter.feature({
  "name": "Verify that user can creat an account on Jumia",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TALAC-806"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Check account creation is donne succesfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_TALAC-805"
    },
    {
      "name": "@CreationCompte"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "name": "user enter his email \u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user confirms his password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his prenom \u003cprenom\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his nom \u003cnom\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his ndefamille \u003cndefamille\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his telephone\u003ctelephone\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user selects genre",
  "keyword": "And "
});
formatter.step({
  "name": "user enters date de naissance\u003cdatenaissance\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters codepin\u003ccodepin\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user account is created",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "password",
        "prenom",
        "nom",
        "ndefamille",
        "telephone",
        "datenaissance",
        "c1",
        "c2",
        "c3",
        "c4",
        "c5",
        "c6"
      ]
    },
    {
      "cells": [
        "ines.maaasmz@gmail.com",
        "aze222",
        "aze222",
        "ines",
        "maaz",
        "mass",
        "55555555",
        "671991",
        "1",
        "2",
        "3",
        "4",
        "5",
        "6"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check account creation is donne succesfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TALAC-806"
    },
    {
      "name": "@TEST_TALAC-805"
    },
    {
      "name": "@CreationCompte"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter his email ines.maaasmz@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_enter_his_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his password aze222",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_enters_his_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confirms his password aze222",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_confirms_his_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his prenom ines",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_enters_his_prenom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his nom maaz",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_enters_his_nom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his ndefamille mass",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_enters_his_ndefamille(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his telephone55555555",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_enters_his_telephone(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects genre",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_selects_genre()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters date de naissance671991",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_enters_date_de_naissance(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters codepin\u003ccodepin\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_enterss_codepin(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user account is created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDef.CreatAccountsteps.user_account_is_created()"
});
formatter.result({
  "status": "passed"
});
});