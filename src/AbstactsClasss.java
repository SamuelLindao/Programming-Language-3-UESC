import java.util.ArrayList;
import java.util.List;

public abstract class AbstactsClasss {

    List<Integer> ints = new ArrayList<Integer>();

    public abstract void insertData(int Data);
    public abstract void removeData(int Data);
    public void PrintSList()
    {
        for(int i =0 ; i < ints.size() ; i++) System.out.println(ints.get(i));
    }
}

