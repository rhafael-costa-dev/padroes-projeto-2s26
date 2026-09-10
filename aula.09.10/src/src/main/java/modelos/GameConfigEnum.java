package src.main.java.modelos;

public enum GameConfigEnum {
    INSTANCE;

    private Double pontos;

    private Integer volume;

    GameConfigEnum() {
        this.pontos = 0.0;
        this.volume = 30;
    }

    public Double getPontos() {
        return pontos;
    }

    public Integer getVolume() {
        return volume;
    }

}
