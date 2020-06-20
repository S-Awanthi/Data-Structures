/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityQueue;

/**
 *
 * @author SA Com
 */
public class priority_queue {
    int maxSize; //capacity of the queue
    int nElements;  //number of elements in the queue
    int queArray[];
    
    public priority_queue(int size){
        maxSize = size;
        queArray = new int[maxSize];
        nElements = 0;
    }
    public boolean isQueueEmpty() {
        return (nElements == 0);
    }
    public boolean isQueueFull() {
        return (nElements == maxSize);
    }
    public int front(){
        return queArray[nElements - 1];
    }   
    public void enqueue(int element){
        int i;
        if(nElements == 0){
            queArray[nElements++] = element; //Insert the element at the 0th position
        }
        else{
            for (i = nElements - 1 ; i >= 0; i--) { //Start at the ending position
                if(element > queArray[i]){       //If the new item is greater
                    queArray[i+1] = queArray[i]; 
                }
                else{
                    break;
                }
            }
        queArray[i+1] = element; //Insert the element
        nElements++;
        } 
    }
    public int dequeue() {
        return queArray[--nElements];
    }
    
    public static void main(String[] args) {
        priority_queue pq = new priority_queue(6);
               
        pq.enqueue(30);
        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(40);
        pq.enqueue(125);
        pq.enqueue(25);
        
        System.out.println("\nItems in the priority queue");
        while(!pq.isQueueEmpty()){
            int element = pq.dequeue();
            System.out.println(element);
        }
        System.out.println("");
    }  
}
