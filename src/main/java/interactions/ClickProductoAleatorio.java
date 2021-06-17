package interactions;

import driver.SeleniumWebDriver;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import userInterFace.BestUserInterFace;
import variablesGlobales.VariablesGlobales;
import java.util.concurrent.TimeUnit;

import java.util.List;
import java.util.Random;

public class ClickProductoAleatorio implements Interaction {


    int segundosAEsperar = 3;
    @Override
    public <T extends Actor> void performAs(T actor) {

        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(segundosAEsperar , TimeUnit.SECONDS);

        Random random = new Random();
        List<WebElementFacade> listaBotonesProductos = BestUserInterFace.BtnProductoAleatorio.resolveAllFor(actor);
        int numeroAleatorio = random.nextInt(listaBotonesProductos.size());
        VariablesGlobales.nombreProductoAleatorio = listaBotonesProductos.get(numeroAleatorio).getText();
        listaBotonesProductos.get(numeroAleatorio).click();

        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(segundosAEsperar , TimeUnit.SECONDS);
    }

    public static Performable on() {
        return Instrumented.instanceOf(ClickProductoAleatorio.class).withProperties();
    }
}
