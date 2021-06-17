package stepsDefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Productos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProductoEnBest;
import userInterFace.BestUserInterFace;
import variablesGlobales.VariablesGlobales;

import java.io.IOException;
import java.util.List;

public class BestBuscadorBackStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^Ingresa en la barra de busqueda un producto y da click en el boton de buscar$")
    public void ingresaEnLaBarraDeBusquedaUnProductoYDaClickEnElBotonDeBuscar(List<Productos> productos) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnBest.on(productos.get(0).getNombreProducto()));

    }


    @Then("^Se redirige a la pantalla donde salen los resultados del producto en pantalla$")
    public void seRedirigeALaPantallaDondeSalenLosResultadosDelProductoEnPantalla() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(BestUserInterFace.LblProducto.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));


    }


}
