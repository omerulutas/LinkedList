/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        
        
        LinkedList linkedList = linkedLCreator();
        
        
        
        
        
        linkedList.printLinkedList();
        
        
        linkedList.search(200);
        linkedList.deleteOneNode(50);
        
        linkedList.printLinkedList();
        
        
    }
    
    
    
    public static LinkedList linkedLCreator() {
        LinkedList linkedList = new LinkedList();
        try {
            FileReader fileReader = new FileReader("data/input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String item;
            while ((item = bufferedReader.readLine()) != null) {
                int data = Integer.parseInt(item);
                linkedList.insert(data);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return linkedList;
    }
    
}
