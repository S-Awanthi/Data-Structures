
public class linkedList_Implementation {
     	
    //Class variables for the linked list
    private static Node head;
    private static int numNodes;
    
    class Node{
        //Declare class variables
        private Node next;
        private int data;
        
        public Node(int d){
            data = d;
        }
        
        public int getData(){
            return data;
        }
    }
    
    public linkedList_Imp(int dat){
        head = new Node(dat);
    }
    
    public void addFirst(int dat){
        Node temp = head;
        head = new Node(dat);
        head.next = temp;
        numNodes++;
        
        System.out.println(dat+ " is added to the first");
    }
    
    public void addLast(int dat){
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(dat);
        numNodes++;    
        
        System.out.println(dat+ " is added to the last");
    }
    
    public void addIndex(int index, int dat){
        Node temp = head;
        Node holder;
        
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        
        holder = temp.next;
        temp.next = new Node(dat);
        temp.next.next = holder;
        numNodes++;
        
        System.out.println(dat+ " is added to the index " +index);
    }
    
     public void deleteIndex(int index){
        Node temp = head;
        
         for (int i = 0; i < index-1 && temp.next != null; i++) {
             temp = temp.next;
         }
         
         temp.next = temp.next.next;
         numNodes--;
         
         System.out.println("Index " +index+ " is deleted from the list");
    }
     
    public static Node find(int index){
        Node temp = head;
        
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    
    public static void printList(){
        Node temp = head;
        
        System.out.println("\nElements in the Linked list are : ");
        while(temp != null){
            System.out.print(" " +temp.data);
            temp = temp.next;
        }
        System.out.println("");
    }
    
    public static int getSize(){
        return numNodes;
    }   

    
    
    public static void main(String[] args) {
        
        linkedList_Imp  obj = new linkedList_Imp(10);
        
        obj.addFirst(54);
        obj.addFirst(79);
        obj.addFirst(68);
        obj.addLast(56);
        obj.addLast(97);
        obj.addIndex(3, 65);
        obj.addIndex(3, 82);
        obj.deleteIndex(3);
        
        linkedList_Imp.printList();
    }
}
