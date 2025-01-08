Feature: Test Samsung Phones on Amazon

@Test1
  Scenario Outline: List all the Samsung phones with below specifications
    Given I am on the Amazon UK Mobile Phones page
    When I filter by price  "<price £>"
    And filter model "<model>"
    And model Year "<year>"
    And camera resolution "<Camera resolution MP>"
    Then verify Result page contains Samsung phones

    Examples:
      | Camera resolution MP | model   | price £ | year |
      | MORE_20              | SAMSUNG | 50_100  | 2021 |

@Test2
  Scenario Outline: List the Samsung phones with below specifications
    Given I am on the Amazon UK Mobile Phones page
    When I filter by price  "<price £>"
    And filter model "<model>"
    And model Year "<year>"
    And camera resolution "<Camera resolution MP>"
    Then check model "<search result>" is present on the Result page

    Examples:
      | Camera resolution MP | model   | price £ | year | search result       |
      | MORE_20              | SAMSUNG | 50_100  | 2023 | Samsung Galaxy A05s |
      | MORE_20              | SAMSUNG | 50_100  | 2022 | Samsung Galaxy A04s |