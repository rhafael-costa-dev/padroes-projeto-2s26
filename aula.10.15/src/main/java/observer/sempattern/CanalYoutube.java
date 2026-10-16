package main.java.observer.sempattern;

public class CanalYoutube {

    PushService pushService = new PushService();
    EmailService emailService = new EmailService();

    public void novoVideo() {
        pushService.enviar();
        emailService .enviar();
    }

}
