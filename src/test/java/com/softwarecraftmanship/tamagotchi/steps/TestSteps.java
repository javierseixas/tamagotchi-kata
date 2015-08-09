package com.softwarecraftmanship.tamagotchi.steps;

import com.softwarecraftmanship.tamagotchi.Tamagotchi;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestSteps {

    Tamagotchi tamagotchi;

    @Given("^I have a Tamagotchi$")
    public void i_have_a_Tamagotchi() throws Throwable {
        this.tamagotchi = new Tamagotchi();
        assertThat(tamagotchi, isA(Tamagotchi.class));
    }

    @Given("^I have a Tamagotchi with state:$")
    public void i_have_a_Tamagotchi_with_state(DataTable tamagotchi) throws Throwable {
        Map<String, Integer> state = tamagotchi.asMap(String.class, Integer.class);
        this.tamagotchi = new Tamagotchi(
                state.get("happiness"),
                state.get("hungriness"),
                state.get("tiredness"),
                state.get("fullness")
        );
    }

    @When("^I feed it$")
    public void i_feed_it() throws Throwable {
        this.tamagotchi.getsFeeded();
    }

    @When("^time passes$")
    public void time_passes() throws Throwable {
        tamagotchi.timePasses();
    }

    @When("^I put it to bed$")
    public void i_put_it_to_bed() throws Throwable {
        tamagotchi.goesToBed();
    }

    @Then("^it's ([a-z]+) is decreased to (\\d+)$")
    public void it_s_feeling_is_decreased_to(String feeling, int value) throws Throwable {
        a_feeling_has_changed(feeling, value);
    }

    @Then("^it's ([a-z]+) is increased to (\\d+)$")
    public void it_s_feeling_is_increased_to(String feeling, int value) throws Throwable {
        a_feeling_has_changed(feeling, value);
    }

    @Then("^it's ([a-z]+) remains (\\d+)$")
    public void it_s_feeling_remains(String feeling, int value) throws Throwable {
        a_feeling_has_changed(feeling, value);
    }

    private void a_feeling_has_changed(String feeling, int value) throws Throwable {
        try {
            Method method = tamagotchi.getClass().getMethod(feeling);
            try {
                assertThat(method.invoke(tamagotchi), is(value));
            } catch (IllegalArgumentException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {

            }
        } catch (SecurityException e) {
            // ...
        } catch (NoSuchMethodException e) {
            // ...
        }
    }

    @When("^I play with it$")
    public void I_play_with_it() throws Throwable {
        this.tamagotchi.plays();
    }

    @When("^I make it poop$")
    public void I_make_it_poop() throws Throwable {
        tamagotchi.poops();
    }
}
