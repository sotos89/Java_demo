package gr.aueb.elearn.ch7.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Traverse {

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Alice"));
        contacts.add(new Contact("Bob"));
        contacts.add(new Contact("David"));
        contacts.add(new Contact("Chris"));

//        for (int i = 0; i < contacts.size(); i++){
//            System.out.println(contacts.get(i));
//        }
//
//        Iterator<Contact> iterator = contacts.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        Iterator<Contact> iterator1 = contacts.iterator();
//        while (iterator1.hasNext()){
//            Contact contact =iterator1.next();
//            if (contact.getName().equals("Alice")){
//                iterator1.remove();
//            }
//        }
//
//        Iterator<Contact> iterator2 = contacts.iterator();
//        while (iterator2.hasNext()){
//            System.out.println(iterator2.next());
//        }

//        for (Contact contact : contacts){
//            System.out.println(contact);
//        }

        contacts.forEach((Contact contact) -> System.out.println(contact));

        contacts.forEach(System.out::println);


    }
}
