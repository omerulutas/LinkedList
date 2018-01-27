
package linkedlist;

/**
 *
 * @author OMER
 */
    public class LinkedListNode {

        private int data ;
        LinkedListNode next;
        
        /**
         * Mission: Creating linked list node with passing data argument
         * @param data 
         */
        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public void setItem(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }
