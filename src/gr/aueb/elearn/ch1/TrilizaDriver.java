package gr.aueb.elearn.ch1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrilizaDriver {
    public static void main(String[] args) {

        Triliza triliza = Triliza.createTriliza();
        Scanner in = new Scanner(System.in);

        int i = 1;
        int x, y;
        boolean done = false;
        int time = 0;


        do {
            System.out.println("παίζει ο παίκτης " + i);
            System.out.println("Δώστε θέση x, y");
            try{
                if(++time == 10) break;
                x = in.nextInt();
                y = in.nextInt();

                triliza.setValue(x, y, i);

                triliza.printGrid();

                done = triliza.chechForTriliza();

                i = (done) ? i : (i % 2 == 0) ? 1 : 2;

            }catch (InputMismatchException e1 ){
                System.out.println("Παρακαλώ δώστε αριθμούς");
                in.nextLine();
            }catch (ValueOutOfBoundsException e2){
                System.out.println("Δώστε αριθμό εντώς ορίων");
            }

        }while (!done);
        System.out.println("Έγινε Τρίλιζα!! Κέρδισε ο παικτης " + i);
    }
}
