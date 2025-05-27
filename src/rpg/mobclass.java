package rpg;

public abstract class mobclass {
    public String nome;
    public int vida;
    public int forca;

    public mobclass(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void mostrar_status(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Forca: " + forca);
    }
    public abstract void atacar();
    public abstract void defender();

}

class Guerreiro extends mobclass
{
    public int escudo;
    public Guerreiro(String nome, int vida, int forca, int escudo) {
        super(nome, vida, forca);
        this.escudo = escudo;

    }

    public void atacar(mobclass enemy) {
        enemy.vida -= forca +5;
        System.out.println("Força aumentada em 5");
    }

    public void defender() {
        System.out.println("\nDefesa com escudo!");
    }
}

class Arqueiro extends mobclass
{
    public int flechas;

    public Arqueiro(String nome, int vida, int forca, int flechas) {
        super(nome, vida, forca);
        this.flechas = flechas;
    }

    public void atacar(mobclass enemy) {
        enemy.vida -= super.forca +3;
    }
}