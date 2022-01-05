Feature: add ingredient to the database
  AS A customer
  I WANT TO add an ingredient to the database
  SO THAT I have it for later use

  Scenario: Successfully add ingredient
    Given the ingredient doesnt exist
    And a ingredient name is given
    When I try to add the ingredient
    Then the ingredient shall appear in the database

  Scenario: unsuccessfully add ingredient
    Given the ingredient already exists
    When I try to add the ingredient
    Then the ingredient shall appear in the database

  Scenario: unsuccessfully add ingredient
    Given the ingredient doesnt exist
    And no ingredient name is given
    When I try to add the ingredient
    Then the ingredient shall not appear in the database