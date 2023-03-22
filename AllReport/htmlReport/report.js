$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/Login.feature");
formatter.feature({
  "name": "To Validate Login Functionality in Facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate login functionality by using username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter invalid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "syed",
        "876897687"
      ]
    },
    {
      "cells": [
        "hashim",
        "87689768976"
      ]
    },
    {
      "cells": [
        "max",
        "896890790"
      ]
    },
    {
      "cells": [
        "remo",
        "98yyo8987987"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_invalid_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_have_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
});