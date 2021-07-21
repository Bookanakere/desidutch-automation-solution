Feature: Download File
  User should be able to download file

  @download
  Scenario: Download file
    Given I am on the file download page of the automation demo site
    When I download the file
    Then A file should be downloaded to my downloads folder