package starter.screenplay.authentication;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;

class LoginForm {
    static final Target USERNAME_FIELD = InputField.withPlaceholder("Username");
    static final Target PASSWORD_FIELD = InputField.withPlaceholder("Password");
    static final Target LOGIN_BUTTON = Button.called("Login");
}
