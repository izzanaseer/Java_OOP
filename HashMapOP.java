import java.util.HashMap;
import java.util.Map;

public class HashMapOP {
    public static void findValue(Map<String, Integer> hashMap, String Find)
    {
        if (hashMap.containsKey(Find)) 
        {
            int value = hashMap.get(Find);
            System.out.println("Value for key '" + Find + "': " + value);
        } 
        else 
        {
            System.out.println("Key '" + Find + "' not found in the HashMap.");
        }
    }

    public static void checkKey(Map<String, Integer> hashMap, String Check)
    {
        boolean exists = hashMap.containsKey(Check);
        if (exists) 
        {
            System.out.println("Key '" + Check + "' exists in the HashMap.");
        } 
        else 
        {
            System.out.println("Key '" + Check + "' does not exist in the HashMap.");
        }
    }

    public static void display(Map<String, Integer> hashMap)
    {
        System.out.println("Key-Value pairs in the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) 
        {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Saad", 17);
        hashMap.put("Izza", 21);
        hashMap.put("Fazal", 15);
        hashMap.put("Feroze", 7);

        
        System.out.println("HashMap: " + hashMap);


        findValue(hashMap, "Izza");
        

        checkKey(hashMap, "Naseer");


        display(hashMap);
    }
}
