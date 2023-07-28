#Author: Rajivjena
#Change the User name and passwword and make sure the account doenot have 2factory authentication
#enabled in it due to privacy reasons i have replaced it after testing from my end
@LoginFeature
Feature: Login Feature of the AmazonPrime

  @tag1
  Scenario Outline: Login Feature of the AmazonPrime
    Given The User is on the amazonprime page in the browser
    When The User Clicks on the Signin button
    Then The User should be able to redirect to the login page
    #Then The User Enters "<UserName>" and "<Password>" and click on the login button
    #Then The User should be redirected to the amazon prime home page
    #Then The user searched the "<movie>" in the search box
    #Then The user clicks on the movie
    #Then The user validated that the movie is been played
    #Then The user closes the video
    #Then The user clicks signout
    Then The user closes the browser

    Examples: 
      | UserName            | Password    | movie                    |
      | Rajivjena4@gmail.com | Rajivjena4@| The Diana Investigations |
	