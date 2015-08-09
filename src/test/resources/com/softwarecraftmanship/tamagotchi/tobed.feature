Feature:
  As a Tamagotchi owner
  I want to put my Tamagotchi to bed
  So that I can refill it's energy

  Scenario: I put to bed a Tamagatchi just born
      Given I have a Tamagotchi with state:
          | happiness  | 50 |
          | fullness   | 50 |
          | hungriness | 50 |
          | tiredness  | 50 |
       When I put it to bed
       Then it's tiredness is decreased to 40

  Scenario: I put to bed a Tamagatchi tired
      Given I have a Tamagotchi with state:
          | happiness  | 50 |
          | fullness   | 50 |
          | hungriness | 50 |
          | tiredness  | 80 |
       When I put it to bed
       Then it's tiredness is decreased to 70

  Scenario: I put to bed a Tamagatchi tired
      Given I have a Tamagotchi with state:
          | happiness  | 50 |
          | fullness   | 50 |
          | hungriness | 50 |
          | tiredness  | 0  |
       When I put it to bed
       Then it's tiredness remains 0