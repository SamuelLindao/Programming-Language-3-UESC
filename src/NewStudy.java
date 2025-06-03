public abstract class NewStudy {
    private int value = 0;
    NewStudy(int value) {
        this.value = value;
    }

    //private abstract não é permitido
    //public faz com que a classe possa ser modificado até mesmo em outros pacotes
    //eliminar public transforma em default, acessivel
    abstract void ImprimirTipo();

    int getValue() {
        return value;
    }
}

class Study extends NewStudy {
    Study(int value) {
        super(value);
    }

    public void ImprimirTipo() {
        System.out.println(getValue());
    }
}

