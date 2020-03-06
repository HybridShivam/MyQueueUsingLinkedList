/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 19-Feb-20
 *  Time: 2:38 AM
 */
package myqueue;

import node.Node;

public class MyQueue {
    // a field to refer rear end of queue
    private Node rear;
    //
    private Node front;
    private int size;// total number of elements in the queue

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    public void enqueue(int element) {
        Node node = new Node(element);
        if (front == null) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    public Node dequeue() {
        Node response = null;
        if (front != null) {
            if (front.getNext() != null) {
                response = new Node(front.getData());
                front = front.getNext();
                size--;
            } else {
                response = new Node(front.getData());
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }

    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = new Node(front.getData());
        }
        return response;
    }

    public int getSize() {
        return size;
    }
}
