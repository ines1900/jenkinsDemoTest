@TALAC-806
Feature: Verify that user can creat an account on Jumia

  @TEST_TALAC-805 @CreationCompte
  Scenario Outline: Check account creation is donne succesfully
    Given browser is open
    When user is on login page
    And user enter his email <email>
    And user enters his password <password>
    And user confirms his password <password>
    And user enters his prenom <prenom>
    And user enters his nom <nom>
    And user enters his ndefamille <ndefamille>
    And user enters his telephone<telephone>
    And user selects genre
    And user enters date de naissance<datenaissance>
    And user enters codepin<codepin>
    Then user account is created

    Examples: 
      | email               | password | password | prenom | nom  | ndefamille | telephone | datenaissance | c1 | c2 | c3 | c4 | c5 | c6 |
      | ines.maaasmz@gmail.com | aze222   | aze222   | ines   | maaz | mass       |  55555555 |        671991 |  1 |  2 |  3 |  4 |  5 |  6 |
