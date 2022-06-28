package Day14;

import java.util.LinkedList;
 
public class Queue {
	public static void main(String[] args)
    {
	        LinkedList<String> queue = new LinkedList<String>();
 
        queue.add("56");     
        queue.add("30");    
        queue.add("70");     
             
 
        
        System.out.println("The front element is " + queue.peek());
 
        queue.remove();   
        queue.remove();
        queue.remove();
 
        
        System.out.println("The front element is " + queue.peek());
 
        
        System.out.println("The queue size is " + queue.size());
 
        
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }

}
