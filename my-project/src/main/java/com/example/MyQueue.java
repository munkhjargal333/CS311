package com.example;


import java.util.LinkedList;
import java.util.Queue;

class MyQueue {
    private Queue<Integer> queue;

    // Constructor
    public MyQueue() {
        queue = new LinkedList<>();
    }

    // 1. Enqueue (Add an element to the queue)
    public void enqueue(int element) {
        queue.add(element);
        System.out.println(element + " added to the queue.");
    }

    // 2. Dequeue (Remove an element from the front of the queue)
    public int dequeue() {
        if (!queue.isEmpty()) {
            int removedElement = queue.poll();  // Removes and returns the front element
            System.out.println(removedElement + " removed from the queue.");
            return removedElement;
        } else {
            System.out.println("Queue is empty!");
            return -1;  // Return a default value if the queue is empty
        }
    }

    // 3. Peek (View the front element without removing it)
    public int peek() {
        if (!queue.isEmpty()) {
            int frontElement = queue.peek();  // Returns but does not remove the front element
            System.out.println("Front element is: " + frontElement);
            return frontElement;
        } else {
            System.out.println("Queue is empty!");
            return -1;  // Return a default value if the queue is empty
        }
    }

    // 4. Check if the queue is empty
    public boolean isEmpty() {
        boolean empty = queue.isEmpty();
        System.out.println("Queue is empty: " + empty);
        return empty;
    }

    // 5. Get the size of the queue
    public int size() {
        int size = queue.size();
        System.out.println("Queue size is: " + size);
        return size;
    }

    // 6. Clear the queue
    public void clear() {
        queue.clear();
        System.out.println("Queue has been cleared.");
    }
}

