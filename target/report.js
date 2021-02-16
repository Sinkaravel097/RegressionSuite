$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login/loggin.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature"
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
  "name": "user has to launch the chrome browser and hit the url of facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "Facebook.user_has_to_launch_the_chrome_browser_and_hit_the_url_of_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user has to enter the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "vishal@gmail.com",
        "vishalgmail"
      ]
    },
    {
      "cells": [
        "sinkaravel@gmail.com",
        "sinkaravelmail"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Facebook.user_has_to_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "user has to launch the chrome browser and hit the url of facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "Facebook.user_has_to_launch_the_chrome_browser_and_hit_the_url_of_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the create new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "click create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "Facebookkk.click_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has enter the first name and last name",
  "keyword": "And "
});
formatter.match({
  "location": "Facebookkk.user_has_enter_the_first_name_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the mobile num or password",
  "keyword": "And "
});
formatter.match({
  "location": "Facebookkk.user_has_to_enter_the_mobile_num_or_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the new password",
  "keyword": "And "
});
formatter.match({
  "location": "Facebookkk.user_has_to_enter_the_new_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to select date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "Facebookkk.user_has_to_select_date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click gender",
  "keyword": "And "
});
formatter.match({
  "location": "Facebookkk.user_has_to_click_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});