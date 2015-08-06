Feature:
  As a Tamagotchi owner
  I want my Tamagotchi's needs to change over time
  So that I have to look after it carefully

  Scenario: A Tamagotchi just born changes its needs
      Given I have a Tamagotchi
       When time passes
       Then it's tiredness is increased
        And it's hungriness is increased
        And it's happiness is decreased

  Scenario: A Tamagotchi
      Given I have a Tamagotchi with state:
            | happiness | tiredness | hungriness | fullness |
            | 50        | 60        | 70         | 80       |
       When time passes
       Then it's tiredness is increased
        And it's hungriness is increased
        And it's happiness is decreased
