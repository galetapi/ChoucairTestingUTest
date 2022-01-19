package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.util.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;


import static co.com.choucair.certification.utest.userinterface.SignupUtestPage.*;

public class Set implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMont;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strCodePostal;
    private String strSystemOperativeCom;
    private String strVersion;
    private String strLanguage;
    private String strMobileDevice;
    private String strModelCel;
    private String strPassword;
    private String strPasswordConfirm;

    public Set(
            String strName, String strLastName, String strEmail, String strMont, String strDay, String strYear , String strCity, String strCodePostal,
            String strSystemOperativeCom, String strVersion, String strLanguage, String strMobileDevice, String strModelCel,
            String strPassword, String strPasswordConfirm
    ) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMont = strMont;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strCodePostal = strCodePostal;
        this.strSystemOperativeCom = strSystemOperativeCom;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModelCel = strModelCel;
        this.strPassword = strPassword;
        this.strPasswordConfirm = strPasswordConfirm;
    }

    public static Set in(String strName, String strLastName, String strEmail,String strMont,String strDay,String strYear, String strCity, String strCodePostal,
                         String strSystemOperativeCom, String strVersion, String strLanguage, String strMobileDevice, String strModelCel,
                         String strPassword, String strPasswordConfirm) {
        return Tasks.instrumented(Set.class, strName, strLastName, strEmail,strMont,strDay,strYear, strCity, strCodePostal, strSystemOperativeCom,
                strVersion, strLanguage, strMobileDevice, strModelCel, strPassword, strPasswordConfirm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_JOIN_TODAY),
                Enter.theValue(strName).into(INPUT_NAME),
                Enter.theValue(strLastName).into(INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMont).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(INPUT_YEAR),
                Scroll.to(BUTTON_NEXT_LOCATION),
                Click.on(BUTTON_NEXT_LOCATION),
                Esperar.esperarEnSegundos(1000),
                Enter.theValue(strCity).into(INPUT_CITY),
                Hit.the(Keys.DOWN).into(INPUT_CITY),
                Hit.the(Keys.TAB).into(INPUT_CITY),
                Click.on(INPUT_POSTAL_CODE),
                Enter.theValue(strCodePostal).into(INPUT_POSTAL_CODE),
                Scroll.to(BUTTON_NEXT_DEVICES),
                Click.on(BUTTON_NEXT_DEVICES),
                Click.on(INPUT_SYSTEM_OPERATIVE_COM),
                Enter.theValue(strSystemOperativeCom).into(OPTIONS_WINDOWS),
                Hit.the(Keys.TAB).into(OPTIONS_WINDOWS),
                Click.on(INPUT_VERSION),
                Enter.theValue(strVersion).into(OPTIONS_VERSION),
                Hit.the(Keys.TAB).into(OPTIONS_VERSION),
                Click.on(INPUT_LANGUAGE),
                Enter.theValue(strLanguage).into(OPTIONS_LANGUAGE),
                Hit.the(Keys.TAB).into(OPTIONS_LANGUAGE),
                Click.on(INPUT_MOBILE_DEVICE),
                Enter.theValue(strMobileDevice).into(OPTION_MOBILE_DEVICE),
                Hit.the(Keys.TAB).into(OPTION_MOBILE_DEVICE),
                Click.on(INPUT_MODEL_CEL),
                Enter.theValue(strModelCel).into(OPTION_MODEL_CEL),
                Hit.the(Keys.TAB).into(OPTION_MODEL_CEL),
                Click.on(INPUT_SYSTEM_OPERATIVE_CEL),
                Click.on(OPTION_VERSION_SYSTEM_OPERATIVE_CEL),
                Scroll.to(BUTTON_NEXT_LAST_STEP),
                Click.on(BUTTON_NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(INPUT_PASSWORD),
                Enter.theValue(strPasswordConfirm).into(INPUT_PASSWORD_CONFIRM),
                Click.on(CHECKLIST_1),
                Click.on(CHECKLIST_2),
                Click.on(CHECKLIST_3),
                Scroll.to(BUTTON_COMPLETE_SETUP),
                Click.on(BUTTON_COMPLETE_SETUP),
                Esperar.esperarEnSegundos(3000)
        );
    }
}
