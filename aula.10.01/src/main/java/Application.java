package main.java;

import main.java.factory.UIFactory;
import main.java.modelo.Button;
import main.java.modelo.Checkbox;
import main.java.modelo.Input;

public class Application {

    private Button button;
    private Checkbox checkbox;
    private Input input;

    Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        input = factory.createInput();
    }

    public void render() {
        button.render();
        checkbox.render();
        input.render();
    }

}
