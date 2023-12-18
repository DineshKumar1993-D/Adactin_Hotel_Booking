$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactins.feature");
formatter.feature({
  "line": 1,
  "name": "Test The Adactin Hotel Booking Application",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Username\"\u003cusername\u003e\" In The Inputbox",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Password \"\u003cpassword\u003e\"In The Inputbox",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Clicks The Loginbutton and Its Navigates The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;1"
    },
    {
      "cells": [
        "sivaguru",
        "36567456"
      ],
      "line": 14,
      "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;2"
    },
    {
      "cells": [
        "selva",
        "347674"
      ],
      "line": 15,
      "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;3"
    },
    {
      "cells": [
        "baalji",
        "47867457"
      ],
      "line": 16,
      "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Username\"sivaguru\" In The Inputbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Password \"36567456\"In The Inputbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Clicks The Loginbutton and Its Navigates The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Stedef.launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 4702821900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sivaguru",
      "offset": 25
    }
  ],
  "location": "Adactin_Stedef.user_Enters_The_Username_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 149816300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "36567456",
      "offset": 26
    }
  ],
  "location": "Adactin_Stedef.user_Enters_The_Password_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 110498700,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Stedef.user_Clicks_The_Loginbutton_and_Its_Navigates_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 450834500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Username\"selva\" In The Inputbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Password \"347674\"In The Inputbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Clicks The Loginbutton and Its Navigates The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Stedef.launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 398874700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selva",
      "offset": 25
    }
  ],
  "location": "Adactin_Stedef.user_Enters_The_Username_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 85586900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "347674",
      "offset": 26
    }
  ],
  "location": "Adactin_Stedef.user_Enters_The_Password_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 87138100,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Stedef.user_Clicks_The_Loginbutton_and_Its_Navigates_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 435784000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Username\"baalji\" In The Inputbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Password \"47867457\"In The Inputbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Clicks The Loginbutton and Its Navigates The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Stedef.launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 407878700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "baalji",
      "offset": 25
    }
  ],
  "location": "Adactin_Stedef.user_Enters_The_Username_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 111715200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "47867457",
      "offset": 26
    }
  ],
  "location": "Adactin_Stedef.user_Enters_The_Password_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 90075600,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Stedef.user_Clicks_The_Loginbutton_and_Its_Navigates_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 338973800,
  "status": "passed"
});
});