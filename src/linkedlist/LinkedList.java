
package linkedlist;

/**
 *
 * @author OMER
 */
public class LinkedList {

    LinkedListNode head;
    LinkedListNode last;

    /**
     * Mission: insert new node into LinkedList.
     *
     * @param data
     */
    public void insert(int data) {
        if (head == null) {
            head = new LinkedListNode(data);
            last = head;
        } else {
            last.next = new LinkedListNode(data);
            last = last.next;

        }
    }
    
    public void printLinkedList(){
        LinkedListNode temp =head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.getData()+" ");
            temp=temp.next;
        }
    }

    /**
     * Mission: Searching entered data onto Bulk.
     * @param data
     */
    public boolean search(int data) {
        LinkedListNode temp = head;
        boolean isExist = false;

        while (temp != null) {

            if (temp.getData() == data) {
                isExist = true;
                break;
            }
            temp = temp.next;
        }
        if (isExist) {
            System.out.print("\n"+data+ " Found in Bulk ");
            return true;
        }
        
        return false;

    }
    /**
     * Mission: Delete just one node when getData() equal to data
     * @param data 
     */
    public void deleteOneNode(int data) {
        boolean isExist = search(data);
        boolean isDeleted = false;
        
        // when to be deleted node is head, getting next of the head as head is enough
        if (head.getData() == data) {
            LinkedListNode temp = head;
            head = head.next;
            temp = null;
            isDeleted = true;
            return;
        } else {
            LinkedListNode temp = head;
            while (temp != null) {
                if (temp.next.getData() == data) {
                    temp.next = temp.next.next;
                    isDeleted = true;
                    break;
                }
                temp = temp.next;
                if(temp.next == null){
                    break;
                }
            }
        }
        
        if(!isExist){
            System.out.println("\nAlready data is not exist");
        }
        
        if(isExist && isDeleted){
            System.out.println("\n"+data+ " is deleted from the Linked List");
        }
    }

}
