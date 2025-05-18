public class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.insertData(100);
        child.PrintSList();
        child.insertData(102);
        child.PrintSList();
        child.insertData(101);
        child.PrintSList();
        child.removeData(100);
        child.PrintSList();
        System.out.println("Bit Printer");
        child.printBits(32);

        System.out.println("\n\nInterface");
        ContractedClass contracted = new ContractedClass();
        contracted.printNew();
        contracted.makePrint();

        System.out.println("\nNew Contracted");

        NotImplementedClass notImplemented = new NotImplementedClass();
        notImplemented.printNew();
        notImplemented.makePrint();
    }
}