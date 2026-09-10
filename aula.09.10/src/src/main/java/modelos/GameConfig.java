package src.main.java.modelos;

public final class GameConfig {
    private static GameConfig instance;

    private Double pontos;

    private Integer volume;

    private GameConfig() {
        this.pontos = 0.0;
        this.volume = 30;
    }

    public static GameConfig getInstance() {
        if (instance == null) {
            instance =  new GameConfig();
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
