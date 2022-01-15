package co.com.choucair.certification.utest.questions;


import co.com.choucair.certification.utest.userinterface.SignupUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String MessageConfirm = Text.of(SignupUtestPage.MESSAGE_CONFIRM).viewedBy(actor).asString();

        if (question.equals(MessageConfirm)) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
        return result;
    }
}
