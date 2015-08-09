Feature: My feature
  As a Tamagotchi owner
  I want to feed my Tamagotchi
  So that I can satiate it's hunger

  Scenario: I feed a Tamagatchi just born
      Given I have a Tamagotchi with state:
          | happiness  | 50 |
          | fullness   | 50 |
          | hungriness | 50 |
          | tiredness  | 50 |
       When I feed it
       Then it's hungriness is decreased to 40
        And it's fullness is increased to 60

  Scenario: I feed a Tamagotchi already full
      Given I have a Tamagotchi with state:
          | happiness  | 50  |
          | fullness   | 100 |
          | hungriness | 0   |
          | tiredness  | 50  |
       When I feed it
       Then it's hungriness remains 0
        And it's fullness remains 100