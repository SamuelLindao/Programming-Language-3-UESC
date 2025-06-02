public abstract class Veiculos {
    String Tipo;
    public Veiculos(String Tipo)
    {
        this.Tipo = Tipo;
    }
    public void ImprimirTipo()
    {
        System.out.println(returnType());
    }
    public abstract String returnType();
}

class Carro extends Veiculos {
    public int NumeroDePortas;
    public Carro(String Tipo, int NumeroDePortas)
    {
        super(Tipo);
        this.NumeroDePortas = NumeroDePortas;
    }
    @Override
    public String returnType()
    {
        return "Carro";
    }
}
class man {
    public static void main(String[] args) {
        Carro carro = new Carro("Carro", 5);
        carro.ImprimirTipo();
    }
}
