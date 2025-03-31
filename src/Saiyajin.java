public class Saiyajin extends Guerreiro {
    private String classe;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Saiyajin [nome=" + nome + ", classe=" + classe + ", nivel_poder=" + nivel_poder + "]";
    }

    void transformar(String estado_guerreiro) {
        nivel_poder = nivel_poder * 50;
        estado_guerreiro = "Super Saiyajin";
        System.out.println("Você atingiu a transformação de " + estado_guerreiro
                + " e seu nível de poder aumentou para " + nivel_poder);
    }

    void zenkai() {
        aumentarPoder();
        nivel_poder = nivel_poder * 2;
    }

    @Override
    void aumentarPoder() {
        enfurecer();
        nivel_poder = nivel_poder * 2;
    }

    @Override
    void enfurecer() {
        nivel_poder = nivel_poder * 5;
    }

    @Override
    void treinar() {
        nivel_poder = nivel_poder * 2;
    }
}
