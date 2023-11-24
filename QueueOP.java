import java.util.LinkedList;

public class QueueOP {
    private LinkedList<Integer> queue;

    public QueueOP() 
    {
        queue = new LinkedList<>();
    }

    
    public void enqueue(int element) 
    {
        queue.addLast(element);
    }

    
    public int dequeue() 
    {
        if (isEmpty()) 
        {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    
    public boolean isEmpty() 
    {
        return queue.isEmpty();
    }

    
    public int size() 
    {
        return queue.size();
    }

    public static void main(String[] args) 
    {
        QueueOP queue = new QueueOP();

        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        
        int dequeuedElement = queue.dequeue();
        System.out.println("Removed element: " + dequeuedElement);

        
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);


        int queueSize = queue.size();
        System.out.println("Queue size = " + queueSize);
    }
}
