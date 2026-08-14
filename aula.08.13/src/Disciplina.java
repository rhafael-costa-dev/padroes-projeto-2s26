public class Disciplina {

    private Long id;
    private String nome;
    private Status status;

    public Disciplina(Long id, String nome, Status status) {
        this.id = id;
        this.nome = nome;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Status getStatus() {
        return status;
    }

}
