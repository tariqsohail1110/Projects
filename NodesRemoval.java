/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package removingnodes;

public class NodesRemoval {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    //deletefirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list does not exist");
            return;
        }
        
        head = head.next;
    }
    //deletelast
    public void deleteLast(){
        if(head == null){
            System.out.println("The list does not exist");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        
        Node secondlastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlastNode = secondlastNode.next;
        }
        secondlastNode.next = null;
    }
    
    //delete at any point
    public void deleteAny(int pos){
        if(head == null){
            System.out.println("The list does not exist");
            return;
        }
        if(pos == 0){
            head = head.next;
            return;
        }
        
        Node currentNode = head;
        int i = 0;
        while(i < pos - 1){
            if(currentNode == null || currentNode.next == null){
                System.out.println("The position is out of range");
                return;
            }
            i++;
            currentNode = currentNode.next;
        }
        if(currentNode.next == null){
            System.out.println("The position is out of range");
            return;
        }
        currentNode.next = currentNode.next.next;
    }    
}
