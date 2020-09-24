package Interface;

public abstract class Abstrata implements Interface{

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //estaciamos nossa interface
    @Override
    public String sobreNome() {
        return null;
    }


}
