Feature: Tamagotchi can play
  As a Tamagotchi owner
  I want to play with my Tamagotchi
  So that I can make it happier

  Scenario: A Tamagotchi just born plays
      Given I have a Tamagotchi with state:
          | happiness  | 50 |
          | fullness   | 50 |
          | hungriness | 50 |
          | tiredness  | 50 |
       When I play with it
       Then it's happiness is increased to 60
        And it's tiredness is increased to 60

  Scenario: A Tamagotchi tired cannot play anymore
      Given I have a Tamagotchi with state:
          | happiness  | 50  |
          | fullness   | 50  |
          | hungriness | 50  |
          | tiredness  | 100 |
       When I play with it
       Then it's happiness remains 50
        And it's tiredness remains 100
