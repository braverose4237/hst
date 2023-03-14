
Feature: Finden Ansprechpartner

  Scenario: Ansprechpartner plz 63263
    When user is on the hst Page
    And user deny to Cookies
    And user write the Plz and Enter
    And user click Facebook Link
    Then check user on the facebook WebSite


