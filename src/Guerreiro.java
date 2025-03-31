public abstract class Guerreiro {

    protected String nome;
    protected int nivel_poder = 1000;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel_poder() {
        return nivel_poder;
    }

    public void setNivel_poder(int nivel_poder) {
        this.nivel_poder = nivel_poder;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", nivel_poder=" + nivel_poder + "]";
    }

    void treinar() {
    };

    void aumentarPoder() {
    };

    void enfurecer() {
    };
}
