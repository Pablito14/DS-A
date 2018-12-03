package util;

public class LinkedList {

    //instance variables
    public Node head;

    //constructor
    public LinkedList(){
        this.head = null;
    }

    /*instance methods*/
    public void insert(int valueToInsert){
        Node latestNode = new Node(valueToInsert);
        latestNode.nextNode = head;
    }

    public boolean includes(int searchValue){
        /**returns true or false if value exists within List
         * 1. check the head too see if its empty
         * 2. if the LL isn't empty set temp tp the head
         * 3. look for the next node
         * 4. loop while != null
        **/
        if(this.head != null){
            Node temp = this.head;

            while (temp != null){
            if(temp.valueStored == searchValue){
                return true;
            }
            else {
                temp = temp.nextNode;
            }

            }
        }
        return false;
    }

    public void print(){
        //prints all node values

    }

}