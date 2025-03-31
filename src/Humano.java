public class Humano extends Guerreiro {
    private String estiloMarcial;

    public String getEstiloMarcial() {
        return estiloMarcial;
    }

    public void setEstiloMarcial(String estiloMarcial) {
        this.estiloMarcial = estiloMarcial;
    }

    @Override
    public String toString() {
        return "Humano [nome=" + nome + ", estiloMarcial=" + estiloMarcial + ", nivel_poder="
                + nivel_poder + "]";
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
