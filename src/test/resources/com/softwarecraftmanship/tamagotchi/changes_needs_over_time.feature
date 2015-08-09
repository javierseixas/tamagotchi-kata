Feature: Tamagotchi's state varies with time passing
  As a Tamagotchi owner
  I want my Tamagotchi's needs to change over time
  So that I have to look after it carefully

  Scenario: A Tamagotchi just born changes its needs
      Given I have a Tamagotchi with state:
          | happiness  | 50 |
          | fullness   | 50 |
          | hungriness | 50 |
          | tiredness  | 50 |
       When time passes
       Then it's tiredness is increased to 60
        And it's hungriness is increased to 60
        And it's happiness is decreased to 40

  Scenario: A Tamagotchi
      Given I have a Tamagotchi
       When time passes
        And time passes
        And time passes
       Then it's tiredness is increased to 80
        And it's hungriness is increased to 80
        And it's happiness is decreased to 20
