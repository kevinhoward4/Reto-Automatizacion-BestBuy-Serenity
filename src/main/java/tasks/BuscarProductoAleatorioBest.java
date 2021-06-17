package tasks;

import interactions.ClickProductoAleatorio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterFace.BestUserInterFace;

public class BuscarProductoAleatorioBest implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BestUserInterFace.BtnPais),
                Click.on(BestUserInterFace.BtnVentana),
                Click.on(BestUserInterFace.BtnCategoria),
                Click.on(BestUserInterFace.BtnCategoria2),
                ClickProductoAleatorio.on()

        );
    }

    public static BuscarProductoAleatorioBest on() {
        return Instrumented.instanceOf(BuscarProductoAleatorioBest.class).withProperties();
    }
}
