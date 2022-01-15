package co.com.choucair.certification.utest.tasks;

<<<<<<< HEAD
=======

>>>>>>> 3c88124 (segunda version)
import co.com.choucair.certification.utest.util.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
<<<<<<< HEAD
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
=======
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

>>>>>>> 3c88124 (segunda version)

import static co.com.choucair.certification.utest.userinterface.SignupUtestPage.*;

public class Set implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
<<<<<<< HEAD
    private String strCity;
    private String strCodePostal;
    private String strSystemOperativeCom;
=======
    private String strMont;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strCodePostal;
    /*private String strSystemOperativeCom;
>>>>>>> 3c88124 (segunda version)
    private String strVersion;
    private String strLanguage;
    private String strMobileDevice;
    private String strModelCel;
<<<<<<< HEAD
    private String strSystemOperativeCel;
=======
    private String strSystemOperativeCel;*/
>>>>>>> 3c88124 (segunda version)
    private String strPassword;
    private String strPasswordConfirm;

    public Set(
<<<<<<< HEAD
            String strName, String strLastName, String strEmail, String strCity, String strCodePostal,
            String strSystemOperativeCom, String strVersion, String strLanguage, String strMobileDevice, String strModelCel,
            String strSystemOperativeCel, String strPassword, String strPasswordConfirm
=======
            String strName, String strLastName, String strEmail, String strMont, String strDay, String strYear , String strCity, String strCodePostal,
            /*String strSystemOperativeCom, String strVersion, String strLanguage, String strMobileDevice, String strModelCel,
            String strSystemOperativeCel,*/ String strPassword, String strPasswordConfirm
>>>>>>> 3c88124 (segunda version)
    ) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
<<<<<<< HEAD
        this.strCity = strCity;
        this.strCodePostal = strCodePostal;
        this.strSystemOperativeCom = strSystemOperativeCom;
=======
        this.strMont = strMont;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strCodePostal = strCodePostal;
        /*this.strSystemOperativeCom = strSystemOperativeCom;
>>>>>>> 3c88124 (segunda version)
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModelCel = strModelCel;
<<<<<<< HEAD
        this.strSystemOperativeCel = strSystemOperativeCel;
=======
        this.strSystemOperativeCel = strSystemOperativeCel;*/
>>>>>>> 3c88124 (segunda version)
        this.strPassword = strPassword;
        this.strPasswordConfirm = strPasswordConfirm;
    }

<<<<<<< HEAD
    public static Set in(String strName, String strLastName, String strEmail, String strCity, String strCodePostal,
                         String strSystemOperativeCom, String strVersion, String strLanguage, String strMobileDevice, String strModelCel,
                         String strSystemOperativeCel, String strPassword, String strPasswordConfirm) {
        return Tasks.instrumented(Set.class, strName, strLastName, strEmail, strCity, strCodePostal, strSystemOperativeCom,
                strVersion, strLanguage, strMobileDevice, strModelCel, strSystemOperativeCel, strPassword, strPasswordConfirm);
=======
    public static Set in(String strName, String strLastName, String strEmail,String strMont,String strDay,String strYear, String strCity, String strCodePostal,
                         /*String strSystemOperativeCom, String strVersion, String strLanguage, String strMobileDevice, String strModelCel,
                         String strSystemOperativeCel,*/ String strPassword, String strPasswordConfirm) {
        return Tasks.instrumented(Set.class, strName, strLastName, strEmail,strMont,strDay,strYear, strCity, strCodePostal, /*strSystemOperativeCom,
                strVersion, strLanguage, strMobileDevice, strModelCel, strSystemOperativeCel,*/ strPassword, strPasswordConfirm);
>>>>>>> 3c88124 (segunda version)
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_JOIN_TODAY),
                Enter.theValue(strName).into(INPUT_NAME),
                Enter.theValue(strLastName).into(INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(INPUT_EMAIL),
<<<<<<< HEAD
                SelectFromOptions.byVisibleText("July").from(INPUT_MONTH),
                SelectFromOptions.byVisibleText("30").from(INPUT_DAY),
                SelectFromOptions.byVisibleText("1994").from(INPUT_YEAR),
                Click.on(BUTTON_NEXT_LOCATION),
                //Enter.theValue(strCity).into(INPUT_CITY),
                Click.on(INPUT_POSTAL_CODE),
                Enter.theValue(strCodePostal).into(INPUT_POSTAL_CODE),
=======
                SelectFromOptions.byVisibleText(strMont).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(INPUT_YEAR),
                Scroll.to(BUTTON_NEXT_LOCATION),
                Click.on(BUTTON_NEXT_LOCATION),
                Esperar.esperarEnSegundos(2000),
                Enter.theValue(strCity).into(INPUT_CITY),
                Hit.the(Keys.DOWN).into(INPUT_CITY),
                Hit.the(Keys.TAB).into(INPUT_CITY),
                Click.on(INPUT_POSTAL_CODE),
                Enter.theValue(strCodePostal).into(INPUT_POSTAL_CODE),
                Scroll.to(BUTTON_NEXT_DEVICES),
>>>>>>> 3c88124 (segunda version)
                Click.on(BUTTON_NEXT_DEVICES),
                Click.on(INPUT_SYSTEM_OPERATIVE_COM),
                Click.on(OPTIONS_WINDOWS),
                Click.on(INPUT_VERSION),
                Click.on(OPTIONS_VERSION),
                Click.on(INPUT_LANGUAGE),
                Click.on(OPTIONS_LANGUAGE),
                Click.on(INPUT_MOBILE_DEVICE),
                Click.on(OPTION_MOBILE_DEVICE),
                Click.on(INPUT_MODEL_CEL),
                Click.on(OPTION_MODEL_CEL),
                Click.on(INPUT_SYSTEM_OPERATIVE_CEL),
                Click.on(OPTION_VERSION_SYSTEM_OPERATIVE_CEL),
<<<<<<< HEAD
=======
                Scroll.to(BUTTON_NEXT_LAST_STEP),
>>>>>>> 3c88124 (segunda version)
                Click.on(BUTTON_NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(INPUT_PASSWORD),
                Enter.theValue(strPasswordConfirm).into(INPUT_PASSWORD_CONFIRM),
                Click.on(CHECKLIST_1),
                Click.on(CHECKLIST_2),
                Click.on(CHECKLIST_3),
<<<<<<< HEAD
                Click.on(BUTTON_COMPLETE_SETUP),

=======
                Scroll.to(BUTTON_COMPLETE_SETUP),
                //Click.on(BUTTON_COMPLETE_SETUP),
>>>>>>> 3c88124 (segunda version)
                Esperar.esperarEnSegundos(3000)
        );
    }
}
