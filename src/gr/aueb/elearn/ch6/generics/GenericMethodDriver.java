package gr.aueb.elearn.ch6.generics;

public class GenericMethodDriver {

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4};
        String[] strArray = {"Athens", "University"};
        GenericMethodClass.printArray(array);
        GenericMethodClass.printArray(strArray);
    }
}
