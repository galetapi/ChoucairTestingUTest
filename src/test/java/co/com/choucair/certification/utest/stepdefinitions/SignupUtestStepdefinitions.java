package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.SignupUtestData;
import co.com.choucair.certification.utest.questions.Answer;
import co.com.choucair.certification.utest.tasks.OpenUrl;
import co.com.choucair.certification.utest.tasks.Set;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SignupUtestStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Que Daniel se encuentra posicionado en el sitio web Utest$")
    public void queDanielSeEncuentraPosicionadoEnElSitioWebUtest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUrl.thePage());
    }

    @Cuando("^Daniel se registra con sus datos$")
    public void danielSeRegistraConSusDatos(List<SignupUtestData> signupUtestData) {

        OnStage.theActorCalled("Daniel").wasAbleTo(Set.in(signupUtestData.get(0).getStrName(), signupUtestData.get(0).getStrLastName(), signupUtestData.get(0).getStrEmail(), signupUtestData.get(0).getStrMont(), signupUtestData.get(0).getStrDay(), signupUtestData.get(0).getStrYear(),signupUtestData.get(0).getStrCity(), signupUtestData.get(0).getStrCodePostal(), signupUtestData.get(0).getStrSystemOperativeCom(),
                signupUtestData.get(0).getStrVersion(), signupUtestData.get(0).getStrLanguage(), signupUtestData.get(0).getStrMobileDevice(), signupUtestData.get(0).getStrModelCel(), signupUtestData.get(0).getStrPassword(), signupUtestData.get(0).getStrPasswordConfirm()));

    }

    @Entonces("^El sistema lo posiciona en la pagina Welcome y valida el mensaje$")
    public void elSistemaLoPosicionaEnLaPaginaWelcomeYValidaElMensaje(List<SignupUtestData> signupUtestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(signupUtestData.get(0).getStrMessageConfirm())));
    }

}
