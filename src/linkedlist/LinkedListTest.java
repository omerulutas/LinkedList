/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author OMER
 */
public class LinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        LinkedList linkedList = new LinkedList();
        
        
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        
        
        linkedList.printLinkedList();
        
        
        linkedList.search(200);
        linkedList.deleteOneNode(50);
        
        linkedList.printLinkedList();
        
        
    }
    
}
