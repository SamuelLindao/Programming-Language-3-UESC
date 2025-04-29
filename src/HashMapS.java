import java.util.HashMap;
public class HashMapS {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("cachorro", 3);

        System.out.println(hashMap.get("a"));

        //System.out.println("Hello, World!");
    }
}