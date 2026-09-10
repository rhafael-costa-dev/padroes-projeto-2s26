package src.main.java;

import src.main.java.modelos.GameConfig;

public class SingletonTeste {

    public static void main(String[] args) {
        Runnable task = () ->  {
            var instance =  GameConfig.getInstance();
            System.out.println(
                    Thread.currentThread().getName() +
                    " => " +  System.identityHashCode(instance)
            );
        };
        for (int i = 0; i < 50; i++) {
            new Thread(task).start();
        }
    }

}
