package main.java.factory;

import main.java.modelo.Button;
import main.java.modelo.Checkbox;
import main.java.modelo.Input;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();

    Input createInput();
}
