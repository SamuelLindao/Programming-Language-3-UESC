package rpg;
import java.util.ArrayList;
import java.util.List;

interface HabilidadeEspecial {
    public void usar_habilidade_especial();

}
public abstract class mobclass implements HabilidadeEspecial {
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

    public void atacar() {
        System.out.println("Ataque feito com dano de " + super.forca + 5);
    }

    public void defender() {
        System.out.println("\nDefesa com escudo!");
    }
    public void usar_habilidade_especial() {
        escudo -= escudo;

        System.out.println("Usando Habilidade Especial: " + escudo + "; " + forca*2 );
    }
}

class Mago extends mobclass
{
    public int mana;
    public Mago(String nome, int vida, int forca, int mana) {
        super(nome, vida, forca);
        this.mana = mana;
    }
    public void atacar() {
        if(mana < 10)
        {
            System.out.println("Sem mana");
            return;

        }
        mana -= 10;
        System.out.println("Ataque causado com dano de " + super.forca * 2);
    }
    public void defender() {
        System.out.println("Como que defende!");
    }
    public void usar_habilidade_especial() {
        mana += 20;
        System.out.println("Usando Habilidade Especial: " + mana);
    }
}
class Arqueiro extends mobclass
{
    public int flechas;

    public Arqueiro(String nome, int vida, int forca, int flechas) {
        super(nome, vida, forca);
        this.flechas = flechas;
    }

    public void atacar() {
        if(flechas == 0) {
            System.out.println("\nSem flecha!");
            return;
        }
        flechas--;
        System.out.println("Ataque feito com dano de " + super.forca + 3);
    }
    public void defender() {
        System.out.println("\nNão defende sem escudo, morreu pai!");
    }
    public void usar_habilidade_especial() {
        flechas -=3;
        System.out.println("Atacou todos inimigos");
        System.out.println("Usando Habilidade Especial: " + flechas);
    }
}

class Cerigo extends mobclass
{
    public int fe;
    public Cerigo(String nome, int vida, int forca, int fe) {
        super(nome, vida, forca);
        this.fe = fe;
    }
    public void atacar() {
        System.out.println("Deus matará meus inimigos!");
    }
    public void defender() {
        System.out.println("Deus me defenderá");
    }
    public void usar_habilidade_especial() {
        if(fe < 30)
        {
            System.out.println("Sem fé suficiente");
            return;
        }
        fe-=30;
        System.out.println("Curou aliados e reviveu personagens");
    }

}

class Ladino extends mobclass
{
    public boolean stealth;
    public Ladino(String nome, int vida, int forca, boolean stealth) {
        super(nome, vida, forca);
        this.stealth = stealth;
    }
    public void atacar() {
        if(stealth)
        {
            System.out.println("Ataque em Stealth, dano: " + forca * 3);
            stealth = false;
        }
        System.out.println("Ataque normal: " + stealth);
    }
    public void defender() {
        System.out.println("Ladino defende?");
    }
    public void usar_habilidade_especial() {
        stealth = true;
        System.out.println("Entrou modo stealth");
    }
}

class Batalha
{
    List<mobclass> allies = new ArrayList<mobclass>();
    List<mobclass> enemys = new ArrayList<mobclass>();

    public void adicionar_aliado(mobclass person)
    {

    }
}