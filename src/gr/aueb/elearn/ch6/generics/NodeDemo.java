package gr.aueb.elearn.ch6.generics;

public class NodeDemo {

    public static void main(String[] args) {
        Node node = new Node();
        node.setItem("TEST");
        int data = (int) node.getItem();

    }
}
