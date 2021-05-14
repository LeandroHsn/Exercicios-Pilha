import java.util.Objects;

public class Livro {

    private String nome;
    private int isbn;
    private String data;
    private String autor;

    public Livro() {}

    public Livro(String nome, int isbn, String data, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.data = data;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return isbn == livro.isbn && Objects.equals(nome, livro.nome) && Objects.equals(data, livro.data) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, isbn, data, autor);
    }

    @Override
    public String toString() {
        return "Livros {" +
                "Nome='" + nome + '\'' +
                ", Isbn=" + isbn +
                ", Data='" + data + '\'' +
                ", Autor='" + autor + '\'' +
                '}'+ "\n";
    }
}
