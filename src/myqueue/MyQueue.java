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
    // a field to refer front end of queue
    private Node front;
    private int size;// total number of elements in the queue

    // constructor
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // a method to check whether queue is empty
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }


    // a method to add a new element in queue
    public void enqueue(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    // a method to remove element of queue from front
//    public Node dequeue() {
//        Node response = null;
//        if (!isEmpty()) {
//            if (front.getNext() != null) {
//                response = new Node(front.getData());
//                front = front.getNext();
//                size--;
//            } else {
//                response = new Node(front.getData());
//                front = null;
//                rear = null;
//                size--;
//            }
//        }
//        return response;
//    }

    public Node dequeue(){
        Node res = null;
        if(!isEmpty()) {
            if(front.getNext()!=null) {
                res = front;
                front = front.getNext();
                res.setNext(null);
                size--;
            }
            else {
                res=front;
                //res.getNext(null);//redundant
                front=null;
                rear=null;
                size--;
            }
        }
        else {
            System.out.println("Queue UnderFlow");
        }
        return res;

    }

    // a method to get front element without removing it
    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = new Node(front.getData());
        }
        return response;
    }

    // a method to get size of queue
    public int getSize() {
        return size;
    }

    public Node rear(){
        return rear;
    }
}
