@sampleGetir
Feature: Validate functionalities for Sample Getir app

  Background:
    Given user taps on "SKIP"
    Then user validates "GetirSample" is displayed

  @testCart
  Scenario: Validate to add and remove product from basket
    And user taps on "WATER"
    And user taps on first product
    And user saves product details
    And user taps on "ADD TO CART"
    And user goes back
    And user taps on cart icon
    And user validates product details and price
    And user taps on "Remove"
    And user goes back
    And user taps on cart icon
    Then user validates "Your Cart is empty !" is displayed

  @testBabyCare
  Scenario: Validate Baby Care Category
    And user taps on menu button
    And user taps on "Baby Care"
    And user taps on third product
    And user validates product price is "$1,98"
    And user goes back
    Then user validates "BABY CARE" is displayed

  @RandomSelect
  Scenario: Random select Category and Product
    And user taps on random category
    And user taps on random product



