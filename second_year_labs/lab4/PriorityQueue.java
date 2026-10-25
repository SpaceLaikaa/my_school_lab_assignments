package second_year_labs.lab4;

class Node{
    int priority;
    String name;
    Node next;


    public Node(int priority, String name){
        this.priority = priority;
        this.name = name;
    }

    public Node(int priority, String name, Node next){
        this.priority = priority;
        this.name = name;
        this.next = next;
    }

    // Getters & Setters

    public int getPriority(){
        return this.priority;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

}

public class PriorityQueue {

    Node headNode;
    int size;


    public PriorityQueue(){
        headNode = null;
        size = 0;
    }

    // Getters & Setters

    public Node getHeadNode(){
        return headNode;
    }

    public void setHeadNode(Node newHeadNode){
        headNode = newHeadNode;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int newSize){
        size = newSize;
    }


    public void printQueue(){

        System.out.print("Size of the queue is: " + getSize() + "\n");

        Node cursor = getHeadNode();

        System.out.print("[headNode] ---> ");

        while(cursor != null){
            System.out.print("[" + cursor.getPriority() + ", " + cursor.getName() + "] ---> ");
            cursor = cursor.getNext();
        }

        System.out.print("NULL");
        System.out.println("\n\n");
    }



    public boolean enqueue(int priority, String name){

        if(priority <= 0) {
            System.out.println("Priority cannot be smaller than 1");
            return false;
        }

        Node newNode = new Node(priority, name);

        if(headNode == null){
            headNode = newNode;
            size++;
            return true;
        }

        if(newNode.getPriority() < headNode.getPriority()){
            newNode.setNext(headNode);
            setHeadNode(newNode);
            size++;
            return true;
        }

        Node cursor = headNode;

        while(cursor.getNext()!=null && cursor.getNext().getPriority() <= newNode.getPriority()){
            cursor = cursor.getNext();
        }

        newNode.setNext(cursor.getNext());
        cursor.setNext(newNode);
        size++;

        return true;
    }





    // TODO:
    public int findPlace(String name){
        int counter=0;
        Node cursor = getHeadNode();

        if(name == null){
            return -1;
        } else{
            while(cursor != null){
                if (name.equals(cursor.name)){
                    return counter;
                } else{
                    cursor = cursor.getNext();
                    counter++;
                }
            }
        }
        return -1;
    }


    // TODO:
    public boolean promote(String name){

        if(headNode == null || getSize() < 0 || name == null){
            return false;
        }

        if(headNode.name.equals(name)){
            if(headNode.getPriority() <= 1){
                return false;
            }
            int newPriority = headNode.getPriority() - 1;
            headNode = headNode.getNext();
            size--;
            return enqueue(newPriority, name);
        }

        int placeOfNode = findPlace(name);

        if(placeOfNode == -1) {
            return false;
        }

        Node temp = getHeadNode();
        for (int i = 0; i < placeOfNode; i++) {
            temp = temp.getNext();
        }

        if(temp.getPriority() <= 1){
            return false;
        }

        Node prev = getHeadNode();
        for (int i = 0; i < placeOfNode - 1; i++) {
            prev = prev.getNext();
        }

        int newPriority = temp.getPriority() - 1;

        prev.setNext(temp.getNext());
        size--;

        return enqueue(newPriority, name);
    }


    // TODO:
    public boolean demote(String name){

        /**
         * IMPLEMENT THIS METHOD
         */

        return true;
    }

    static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue(1, "A1");
        priorityQueue.enqueue(2, "B2");
        priorityQueue.enqueue(2, "B1");
        priorityQueue.enqueue(3,  "C1");

        priorityQueue.printQueue();

        priorityQueue.promote("C1");
    }
}
















