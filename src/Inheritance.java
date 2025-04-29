public class Inheritance {
    public static void main(String[] args) {
        Booldog dog = new Booldog("Fido");
        dog.bark();
    }
}

class Dog
{
    String name;
    Dog(String name)
    {
        this.name = name;
    }

    void bark()
    {
        System.out.println("Generic Dog Bark");
    }
}

class Booldog extends Dog
{
    Booldog(String name)
    {
        super(name);
    }

    @Override
    void bark()
    {
        System.out.println("Woof");
    }
}
