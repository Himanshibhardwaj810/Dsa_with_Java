package Linked_list;

public class loop_LL {

    public static void main(String[] args) {
        // Creating the linked list
        loop_ll_code list = new loop_ll_code();
        
        // Inserting nodes
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        
        // Display the linked list before creating a loop
        System.out.println("Linked list before loop creation:");
        list.display();
        
        // Creating a loop (connecting the last node to the node at position 3)
        list.createLoop(3);
        
        // Detecting the loop
        if (list.detectloop(list.head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected.");
        }

        // Finding the start of the loop
        loop_ll_code.Node loopStart = list.findloopstart(list.head);
        if (loopStart != null) {
            System.out.println("Loop starts at node with value: " + loopStart.value);
        } else {
            System.out.println("No loop detected.");
        }

        // Removing the loop
        list.removeloop(list.head);
        
        // Display the linked list after removing the loop
        System.out.println("Linked list after removing the loop:");
        list.display();

        // Checking if the loop still exists
        if (list.detectloop(list.head)) {
            System.out.println("Loop still exists in the linked list.");
        } else {
            System.out.println("No loop detected.");
        }
    }
}
