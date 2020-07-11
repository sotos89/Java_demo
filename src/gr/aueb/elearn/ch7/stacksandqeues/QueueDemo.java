package gr.aueb.elearn.ch7.stacksandqeues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        Deque<Contact> stack = new ArrayDeque<>( );

        int head = 1;
        do {
            stack.addLast(new Contact(String.format("%s", head++)));
        } while (head != 10);

        head = 1;
        do {
            Contact contact = stack.poll();
            System.out.println(contact);
            head++;
        } while (head != 10);
    }

}
