Feature: To Validate Login Functionality in Facebook Application

Scenario: To validate login functionality by using username and password
Given user facebook login page
When user enter invalid username and password
| username | password     |
| syed     | 876897687    |
| hashim   | 87689768976  |
| max      | 896890790    |
| remo     | 98yyo8987987 |

And user have click login button
Then user should be in invalid credential page
  
