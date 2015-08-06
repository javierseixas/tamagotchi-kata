Feature: My feature
  As a Tamagotchi owner
  I want to feed my Tamagotchi
  So that I can satiate it's hunger

  Scenario: I feed a Tamagatchi just born
      Given I have a Tamagotchi
       When I feed it
       Then it's hungriness is decreased
        And it's fullness is increased


  Scenario: I feed a Tamagatchi when have passed 2 times
      Given I have a Tamagotchi
       When I feed it
       Then it's hungriness is decreased
        And it's fullness is increased