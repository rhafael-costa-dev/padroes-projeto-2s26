package main.java.factory;

import main.java.modelo.Button;
import main.java.modelo.Checkbox;
import main.java.modelo.Input;
import main.java.modelo.impl.LightButton;
import main.java.modelo.impl.LightCheckbox;
import main.java.modelo.impl.LightInput;

public class LightThemeFactory implements UIFactory {

    public Button createButton() {
        return new LightButton();
    }

    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }

    @Override
    public Input createInput() {
        return new LightInput();
    }
}
