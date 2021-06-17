package stepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoAleatorioBest;
import userInterFace.BestUserInterFace;
import variablesGlobales.VariablesGlobales;

import java.io.IOException;

public class BestBuscadorAleatorioStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^Busca un prodcuto aleatorio en la pagina$")
    public void buscaUnProdcutoAleatorioEnLaPagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAleatorioBest.on());
    }


    @Then("^Podre ver el producto seleccionado en pantalla$")
    public void podreVerElProductoSeleccionadoEnPantalla() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(BestUserInterFace.LblProducto.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));
    }
}
