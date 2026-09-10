package src.main.java.modelos;

public final class GameConfigComLocking {

    private static volatile GameConfigComLocking instance;

    private Double pontos;

    private Integer volume;

    private GameConfigComLocking() {
        this.pontos = 0.0;
        this.volume = 30;
    }

    public static GameConfigComLocking getInstance() {
        if (instance == null) {
            synchronized (GameConfigComLocking.class) {
                if (instance == null) {
                    instance =  new GameConfigComLocking();
                }
            }
        }
        return instance;
    }
    public Double getPontos() {
        return pontos;
    }

    public Integer getVolume() {
        return volume;
    }

}
