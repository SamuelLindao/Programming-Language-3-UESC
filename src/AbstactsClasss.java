import java.util.ArrayList;
import java.util.List;

public abstract class AbstactsClasss {
    String value;
    List<Integer> ints = new ArrayList<Integer>();

    public abstract void insertData(int Data);
    public abstract void removeData(int Data);
    public void PrintSList()
    {
        System.out.println("\nPrinting List");
        for(int i =0 ; i < ints.size() ; i++)
            System.out.print(" | " +ints.get(i));
    }
    public abstract void printBits(int Number);
}
class ChildClass extends  AbstactsClasss
{

    @Override
    public void insertData(int Data) {
        ints.add(Data);
    }

    @Override
    public void removeData(int Data) {
        ints.remove(Integer.valueOf(Data));
    }

    @Override
    public void printBits(int Number) {
        String bit = "";
        for(int i = 30; i > -1; i--)
            bit += ((Number & (int)Math.pow(2, i)) == Number) ? "1" : "0";
        System.out.println(bit);
    }
}

