import java.time.LocalDateTime;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataRetirada = LocalDateTime.now();
        this.dataDevolucao = null; // ainda não devolvido
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getDataRetirada() {
        return dataRetirada;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void registrarDevolucao() {
        this.dataDevolucao = LocalDateTime.now();
        livro.setDisponivel(true);
    }
}
