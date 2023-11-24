import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackOP {
    private ArrayList<Integer> stack;

    public StackOP() 
    {
        stack = new ArrayList<>();
    }

    
    public void push(int value) 
    {
        stack.add(value);
    }


    public int size() {
        return stack.size();
    }


    public boolean isEmpty() 
    {
        return stack.isEmpty();
    }

    
    public int pop() 
    {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        int poppedValue = stack.get(lastIndex);
        stack.remove(lastIndex);
        return poppedValue;
    }


    public int peek() 
    {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        return stack.get(lastIndex);
    }


    public void display() 
    {
        System.out.print("Stack Elements: ");
        for (int i = stack.size() - 1 ;i >= 0; i--) 
        {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        StackOP stack = new StackOP();

        stack.push(10);

        stack.push(20);
        stack.push(30);

        
        stack.display();

        
        int top = stack.peek();
        System.out.println("Top element: " + top);

        
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
