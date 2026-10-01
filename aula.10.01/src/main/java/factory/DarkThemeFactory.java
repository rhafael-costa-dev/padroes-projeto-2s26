package main.java.factory;

import main.java.modelo.Button;
import main.java.modelo.Checkbox;
import main.java.modelo.Input;
import main.java.modelo.impl.DarkButton;
import main.java.modelo.impl.DarkCheckbox;
import main.java.modelo.impl.DarkInput;

public class DarkThemeFactory implements UIFactory {

    public Button createButton() {
        return new DarkButton();
    }

    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }

    @Override
    public Input createInput() {
        return new DarkInput();
    }

}
