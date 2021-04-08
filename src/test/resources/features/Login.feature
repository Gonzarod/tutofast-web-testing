Feature: User can Login into application

  Scenario Outline: User student successfully login with username and password
    Given navigate to login page
    When enter "<username>" and "<password>"
    Then user is redirected to dashboard page
    Examples:
      | username      | password |
      | jesus.student | password |
      | maria.student | password |

