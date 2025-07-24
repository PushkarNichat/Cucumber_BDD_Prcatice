Feature: BookMyShow movie Booking
Scenario: Search a movie and select a show

Given  User is on the HomePage of BookMyShow
When  User selects city as "Pune"
And  User searches for movie "Saiyaara"
And  User selects the movie from the list
Then  User should see the show timings