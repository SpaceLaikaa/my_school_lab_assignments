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

        if(name == null||getSize()<0){
            return -1;
        } else{
            while(getHeadNode().name != null){
                if (name.equals(getHeadNode().name)){
                    return counter;
                } else{
                    setHeadNode(getHeadNode().getNext());
                    counter++;
                }
            }
        }
        return -1;
    }


    // TODO:
    public boolean promote(String name){


        return true;
    }


    // TODO:
    public boolean demote(String name){

        /**
         * IMPLEMENT THIS METHOD
         */

        return true;
    }











}















