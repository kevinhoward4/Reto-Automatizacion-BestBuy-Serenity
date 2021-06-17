package stepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import models.Productos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnBest;
import userInterFace.BestUserInterFace;
import variablesGlobales.VariablesGlobales;


import java.io.IOException;
import java.util.List;

public class BestFallidoExitosoStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El usuario ingresa en el sitio Web$")
    public void el_usuario_ingresa_en_el_sitio_Web() {
        OnStage.theActorCalled("Kevin").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on("https://www.bestbuy.com/")));

    }

    @When("^Se busca en el sitio Web el articulo$")
    public void se_busca_en_el_sitio_Web_el_articulo(List<Productos> productos) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnBest.on(productos.get(0).getNombreProducto()));
    }

    @Then("^Se valida la prueba$")
    public void se_valida_la_prueba() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(BestUserInterFace.LblProducto.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
    }


}
