#Author: Jhon Sebastián Molina Arias
@stories
Feature: User registration
  As a user, I want to register on the Utest page
  Scenario Outline: User registration in Utest
    Given the user wants to register on Utest
    When the user clicks button Join Today
    And the user completes form 1 with the following data:
      | strFirstName    | strLastName   | strEmail   | strMonth   | strDay   | strYear   |
      | <strFirstName>  | <strLastName> | <strEmail> | <strMonth> | <strDay> | <strYear> |
    And the user completes form 2 with the following data:
      | strCity    | strZip   | strCountry   |
      | <strCity>  | <strZip> | <strCountry> |
    And the user completes form 3 with the following data:
      | strComputer   | strVersion   | strLanguage   | strCellPhone    | strModel    | strSystem   |
      | <strComputer> | <strVersion> | <strLanguage> | <strCellPhone>  | <strModel>  | <strSystem> |
    And the user completes form final with the following data:
      | strPassword    | strConfirmPassword  |
      | <strPassword> | <strConfirmPassword> |
    Then the user should see the text "Welcome to the world's largest community of freelance software testers!"

    Examples:
      | strFirstName | strLastName | strEmail         | strMonth  | strDay  | strYear | strCity | strZip | strCountry | strComputer | strVersion | strLanguage | strCellPhone | strModel    | strSystem         | strPassword   | strConfirmPassword |
      | Sebastian    | Molina      | jsebas@gmail.com | January   | 24      | 1995    | Itagüí  | 055412 | Colombia   | Windows     | 10         | Spanish     | Nokia        | E51         | Windows Phone 8.1 | Cc1234567890* | Cc1234567890*      |