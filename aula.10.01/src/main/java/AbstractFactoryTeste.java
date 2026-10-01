package main.java;

import main.java.factory.DarkThemeFactory;
import main.java.factory.LightThemeFactory;

public class AbstractFactoryTeste {

    public static void main(String[] args){
        var factory = new LightThemeFactory();
        var app = new Application(factory);
        app.render();
    }

}
