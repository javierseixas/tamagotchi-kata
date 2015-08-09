Feature: Tamagotchi can poop
  As a Tamagotchi owner
  I want to make my Tamagotchi poop
  So that it is more comfortable

  Scenario: Tamagotchi just born poops
      Given I have a Tamagotchi with state:
          | happiness  | 50 |
          | fullness   | 50 |
          | hungriness | 50 |
          | tiredness  | 50 |
       When I make it poop
       Then it's fullness is decreased to 40



  Scenario: Tamagotchi just born poops
      Given I have a Tamagotchi with state:
          | happiness  | 50 |
          | fullness   | 0 |
          | hungriness | 50 |
          | tiredness  | 50 |
       When I make it poop
       Then it's fullness remains 0