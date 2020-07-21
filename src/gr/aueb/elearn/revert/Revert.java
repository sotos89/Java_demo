package gr.aueb.elearn.revert;

import java.util.Arrays;

public class Revert {
    public static void main(String[] args) {
        String[] names = {"John", "Daniel", "Alex", "Nick"};
        String[] revertNames = new String[names.length];
        int index = 0;

        for (int i = names.length-1; i >= 0; i--){
            revertNames[index] = names[i];
            index++;
        }
        System.out.println(Arrays.toString(revertNames));
    }
}
