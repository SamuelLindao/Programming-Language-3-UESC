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

}
