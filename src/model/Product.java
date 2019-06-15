package model;

public class Product {

    private String nome;
    private Integer id;
    private String descricao;
    private float valor;
    private String email;

    public Product(String nome, Integer id, String descricao, float valor, String email) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.email = email;
    }

    public Product() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", email='" + email + '\'' +
                '}';
    }
}
