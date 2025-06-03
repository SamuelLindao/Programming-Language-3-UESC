package rpg;

public class main {
    public static void main(String[] args) {
        Batalha batalha = new Batalha();
        Ladino ladino = new Ladino("Samuel", 10, 10, false);
        batalha.adicionar_aliado(ladino);
    }
}
