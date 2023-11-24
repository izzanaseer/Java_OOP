import java.util.ArrayList;
import java.util.Collections;

public class sortOP {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        
        Collections.sort(numbers);

        
        System.out.println("Sorted ArrayList in ascending order:");
        for (int number : numbers) 
        {
            System.out.println(number);
        }
    }
}
