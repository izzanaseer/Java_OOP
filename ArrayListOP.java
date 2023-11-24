import java.util.ArrayList;

public class ArrayListOP {
    public static void main(String[] args) 
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        System.out.println("ArrayList: " + arrayList);


        int remove = 1;
        if (remove >= 0 && remove < arrayList.size()) {
            String removedElement = arrayList.remove(remove);
            System.out.println("Removed element at index " + remove + ": " + removedElement);
        } else {
            System.out.println("Invalid index for removal.");
        }


        String checkPresent = "Cherry";
        boolean exists = arrayList.contains(checkPresent);
        if (exists) 
        {
            System.out.println(checkPresent + " exists in the ArrayList.");
        } 
        else 
        {
            System.out.println(checkPresent + " does not exist in the ArrayList.");
        }


        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);


        System.out.println("Elements in the ArrayList:");
        for (String element : arrayList) 
        {
            System.out.println(element);
        }
    }
}