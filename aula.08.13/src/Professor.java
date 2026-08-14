import java.util.*;

public class Professor {

    private Long codigo;
    private String nome;
    private Status status;
    private List<Disciplina> disciplinas;

    public Professor() {
        setCodigo((new Random()).nextLong());
        setStatus(Status.ATIVO);
        disciplinas = new ArrayList<>();
    }

    private Professor(String nome) {
       setCodigo((new Random()).nextLong());
       setStatus(Status.ATIVO);
       setNome(nome);
       disciplinas = new ArrayList<>();
    }

    public static Professor create(String nome){
        return new Professor(nome);
    }

    public void atualizarDados(Professor p) {
        this.setNome(p.getNome());
    }

    public void adicionaDisciplina(Disciplina d) {
        this.disciplinas.add(d);
    }

    public void desativar() {
        if (this.status.equals(Status.ATIVO)) {
            this.setStatus(Status.INATIVO);
        }
        throw new IllegalArgumentException();

    }

    /***********************
     * GETTERS
     */

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Status getStatus() {
        return status;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    /***********************
     * SETTERS
     */

    private void setCodigo(Long codigo) {
        Objects.requireNonNull(codigo);
        this.codigo = codigo;
    }

    private void setNome(String nome) {
        Objects.requireNonNull(nome);
        if (nome.length() < 5) {
            throw new IllegalArgumentException("Nome precisa de 5 caracteres");
        }
        this.nome = nome;
    }

    private void setStatus(Status status) {
        Objects.requireNonNull(status);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
