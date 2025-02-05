package com.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        MyQueue queue = new MyQueue();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.peek();  // Output: Front element is: 10

        queue.dequeue();  // Output: 10 removed from the queue.
        
        queue.dequeue();  // Output: 20 removed from the queue.

        queue.isEmpty();  // Output: Queue is empty: false

        queue.size();  // Output: Queue size is: 1

        queue.clear();  // Output: Queue has been cleared.

        queue.isEmpty();  // Output: Queue is empty: true
    }
}
