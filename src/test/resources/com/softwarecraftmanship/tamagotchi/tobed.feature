Feature:
  As a Tamagotchi owner
  I want to put my Tamagotchi to bed
  So that I can refill it's energy

  Scenario: I put to bed a Tamagatchi just born
     Given I have a Tamagotchi
      When I put it to bed
      Then it's tiredness is decreased