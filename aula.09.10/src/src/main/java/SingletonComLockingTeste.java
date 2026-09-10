package src.main.java;

import src.main.java.modelos.GameConfigComLocking;

public class SingletonComLockingTeste {
    public static void main(String[] args) {
        Runnable task = () ->  {
            var instance =  GameConfigComLocking.getInstance();
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
