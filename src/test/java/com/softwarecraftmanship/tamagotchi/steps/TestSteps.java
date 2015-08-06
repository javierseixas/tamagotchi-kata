package com.softwarecraftmanship.tamagotchi.steps;

import com.softwarecraftmanship.tamagotchi.Tamagotchi;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestSteps {

    Tamagotchi tamagotchi;

    @Given("^I have a Tamagotchi$")
    public void i_have_a_Tamagotchi() throws Throwable {
        this.tamagotchi = new Tamagotchi();
        assertThat(tamagotchi, isA(Tamagotchi.class));
    }

    @When("^I feed it$")
    public void i_feed_it() throws Throwable {
        this.tamagotchi.feed();
    }

    @Then("^it's hungriness is decreased$")
    public void it_s_hungriness_is_decreased() throws Throwable {
        assertThat(tamagotchi.hungriness(), is(40));
    }

    @Then("^it's fullness is increased$")
    public void it_s_fullness_is_increased() throws Throwable {
        assertThat(tamagotchi.fullness(), is(60));
    }

    @When("^I put it to bed$")
    public void i_put_it_to_bed() throws Throwable {
        tamagotchi.iPutItToBed();
    }

    @Then("^it's tiredness is decreased$")
    public void it_s_tiredness_is_decreased() throws Throwable {
        assertThat(tamagotchi.tiredness(), is(40));
    }

    @When("^time passes$")
    public void time_passes() throws Throwable {
        tamagotchi.timePasses();
    }

    @Then("^it's tiredness is increased$")
    public void it_s_tiredness_is_increased() throws Throwable {
        assertThat(tamagotchi.tiredness(), is(60));
    }

    @Then("^it's hungriness is increased$")
    public void it_s_hungriness_is_increased() throws Throwable {
        assertThat(tamagotchi.hungriness(), is(60));
    }

    @Then("^it's happiness is decreased$")
    public void it_s_happiness_is_decreased() throws Throwable {
        assertThat(tamagotchi.happiness(), is(40));
    }

    @Given("^I have a Tamagotchi with state:$")
    public void i_have_a_Tamagotchi_with_state(DataTable tamagotchi) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

}
