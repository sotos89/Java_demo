package gr.aueb.elearn.ch6.generics;

public class NodeGenericDemo2 {
    public static void main(String[] args) {
        NodeGeneric2<Integer, String> node = new NodeGeneric2<>();

        node.setItem1(1);
        node.setItem2("AUEB");
    }
}
