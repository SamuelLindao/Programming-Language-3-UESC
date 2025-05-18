public interface InterfaceClass {
    default void makePrint()
    {
        System.out.println("Class not implemented");
    }

    void printNew();
}

class ContractedClass implements InterfaceClass
{
    @Override
    public void makePrint()
    {
        System.out.println("Class implemented");
    }
    @Override
    public void printNew() {
        System.out.println("Hello");
    }
}
