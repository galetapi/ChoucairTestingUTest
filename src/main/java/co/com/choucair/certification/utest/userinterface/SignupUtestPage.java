package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class SignupUtestPage extends PageObject {

    public static final Target BUTTON_JOIN_TODAY = Target.the("Este boton nos dirige al formulario de registro").located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_NAME = Target.the("Input para ingresar el nombre").located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Input para ingresar el apellido").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Input para ingresar el correo electronico").located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("Input para ingresar el mes").located(By.id("birthMonth"));

    public static final Target INPUT_DAY = Target.the("Input para ingresar el dia").located(By.id("birthDay"));

    public static final Target INPUT_YEAR = Target.the("Input para ingresar el año").located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("Este boton nos dirige a la siguinte pagina").located(By.cssSelector(".btn.btn-blue"));

    public static final Target INPUT_CITY = Target.the("Input para ingresar la ciudad").located(By.name("city"));

    public static final Target INPUT_POSTAL_CODE = Target.the("Input para ingresar el codigo postal").located(By.id("zip"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("Este boton nos dirige a la siguinte pagina").located(By.cssSelector(".btn.btn-blue"));

    public static final Target INPUT_SYSTEM_OPERATIVE_COM = Target.the("Input para ingresar el sistema operativo de tu computador").located(By.name("osId"));

    public static final Target OPTIONS_WINDOWS = Target.the("Esta es una opcion para seleccionar sistema operativo windows").located(By.xpath("//input[@placeholder='Select OS']"));

    public static final Target INPUT_VERSION = Target.the("Input para ingresar la version del sistema operativo del pc").located(By.name("osVersionId"));

    public static final Target OPTIONS_VERSION = Target.the("Esta es una opcion para seleccionar la version de sistema operativo").located(By.xpath("//input[@placeholder='Select a Version']"));

    public static final Target INPUT_LANGUAGE = Target.the("Input para ingresar el lenguaje del sistema operativo").located(By.name("osLanguageId"));

    public static final Target OPTIONS_LANGUAGE = Target.the("Esta es una opcion para seleccionar el lenguaje del pc").located(By.xpath("//input[@placeholder='Select OS language']"));

    public static final Target INPUT_MOBILE_DEVICE = Target.the("Input para ingresar el dispositivo movil").located(By.name("handsetMakerId"));

    public static final Target OPTION_MOBILE_DEVICE = Target.the("Esta es opcion para seleccionar el dispositivo movil").located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target INPUT_MODEL_CEL = Target.the("Input para ingresar el modelo del dispositivo movil").located(By.name("handsetModelId"));

    public static final Target OPTION_MODEL_CEL = Target.the("Esta es una opcion para seleccionar el modelo del dispositivo movil").located(By.xpath("//input[@placeholder='Select a Model']"));

    public static final Target INPUT_SYSTEM_OPERATIVE_CEL = Target.the("Input para ingresar el sistema operativo del dispositivo movil").located(By.name("handsetOSId"));

    public static final Target OPTION_VERSION_SYSTEM_OPERATIVE_CEL = Target.the("Esta es una opcion para seleccionar el modelo del dispositivo movil").located(By.className("ui-select-choices-row-inner"));

    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("Este boton nos dirige a la siguinte pagina").located(By.cssSelector(".btn.btn-blue"));

    public static final Target INPUT_PASSWORD = Target.the("Input para ingresar la clave").located(By.id("password"));

    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("Input para ingresar la confirmacion de la clave").located(By.id("confirmPassword"));

    public static final Target CHECKLIST_1 = Target.the("Este checklist es para confirmar el registro").located(By.name("newsletterOptIn"));

    public static final Target CHECKLIST_2 = Target.the("Este checklist es para confirmar el registro").located(By.name("termOfUse"));

    public static final Target CHECKLIST_3 = Target.the("Este checklist es para confirmar el registro").located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Este boton es para confirmar el registro").located(By.id("laddaBtn"));

    public static final Target MESSAGE_CONFIRM = Target.the("Este es el mensaje de confirmacion de registro exitoso").located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));


}
