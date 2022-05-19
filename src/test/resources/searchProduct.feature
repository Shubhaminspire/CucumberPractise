Feature: Search the Product
  Scenario: User will be able to search for the Product
    Given User is on the Greenkart Landing Page
    When User Search with shortname "tom" and extract the actual name of product
    Then User search with same shortname "tom" in offers page
    And Validate if the product exists