public class Main {
    public static void main(String[] args) {
        Humano guerreiro1 = new Humano();
        guerreiro1.setNome("Henrique");
        guerreiro1.setEstiloMarcial("Kung Fu");
        guerreiro1.treinar();
        System.out.println(guerreiro1);

        Saiyajin guerreiro2 = new Saiyajin();
        guerreiro2.setNome("Vegetables");
        guerreiro2.setClasse("Guerreira");
        guerreiro2.zenkai();
        guerreiro2.zenkai();
        guerreiro2.zenkai();
        guerreiro2.transformar("Super Saiyajin");
        System.out.println(guerreiro2);
    }
}
