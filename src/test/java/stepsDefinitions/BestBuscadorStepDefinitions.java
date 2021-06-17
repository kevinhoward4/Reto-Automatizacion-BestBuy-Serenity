package stepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnBest;
import userInterFace.BestUserInterFace;

import java.io.IOException;

public class BestBuscadorStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario se encuentra en la pagina de BestBuy con la url (.*)$")
    public void elUsuarioSeEncuentraEnLaPaginaDeBestBuyConLaUrl(String url) {
        OnStage.theActorCalled("Kevin").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on("https://www.bestbuy.com/")));
     }

    @When("^Ingresa en la barra de busqueda el (.*) y da click en el boton de buscar$")
    public void ingresaEnLaBarraDeBusquedaElYDaClickEnElBotonDeBuscar(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnBest.on(producto));
    }

    @Then("^Se debe redirigir a la pantalla donde salen los resultados del (.*) en pantalla$")
    public void seDebeRedirigirALaPantallaDondeSalenLosResultadosDelEnPantalla(String producto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(BestUserInterFace.LblProducto.of(producto)), WebElementStateMatchers.containsText(producto)));
    }

}
