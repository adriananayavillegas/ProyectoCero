package co.com.example.stepdefinitions;

import co.com.example.navigation.OpenBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ExampleSteps {

    @Given("^que el usuario (.*) accede hasta la pagina principal$")//primera tarea
    public void accessToApp(String name) {
        theActorCalled(name).
                wasAbleTo(
                        OpenBrowser.inPage()

                );
    }

    @When("^el agrega item (.*) al carrito$")
    public void addItems() {
    }

    @Then("^el puede realizar la compra de los articulos$")
    public void payItems() {
    }

}
