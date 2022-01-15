package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.SignupUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUrl implements Task {

    private SignupUtestPage signupUtestUserinterface;

    public static OpenUrl thePage() {
        return Tasks.instrumented(OpenUrl.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(signupUtestUserinterface)
        );
    }
}
