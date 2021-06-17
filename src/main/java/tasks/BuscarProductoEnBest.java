package tasks;

import driver.SeleniumWebDriver;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterFace.BestUserInterFace;
import variablesGlobales.VariablesGlobales;
import java.util.concurrent.TimeUnit;

public class BuscarProductoEnBest implements Task{

   private String producto;

    public BuscarProductoEnBest(String producto) {
        this.producto = producto;
    }
    int segundosAEsperar = 3;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BestUserInterFace.BtnPais),
                Click.on(BestUserInterFace.BtnVentana),
                Enter.theValue(producto).into(BestUserInterFace.TxtBuscadorPage),
                Click.on(BestUserInterFace.BtnBuscadorPage),
                Click.on(BestUserInterFace.BtnProducto.of(producto))

        );
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(segundosAEsperar , TimeUnit.SECONDS);
        VariablesGlobales.nombreProductoAleatorio = BestUserInterFace.LblProducto.of(producto).resolveFor(actor).getText();

    }

    public static BuscarProductoEnBest on(String producto) {
        return Instrumented.instanceOf(BuscarProductoEnBest.class).withProperties(producto);
    }
}