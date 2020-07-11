package gr.aueb.elearn.ch1;

public class Triliza {

    private int [][] grid = new int[3][3];

    private Triliza(){}

    public static Triliza createTriliza() {
        return new Triliza();
    }

    public void printGrid() {
        for (int[] row : grid) {
            for (int element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public void setValue(int x, int y, int value) throws ValueOutOfBoundsException {
        if((x < 0 || x > 2 || y < 0 || y > 2) || (value != 1 && value !=2)) {
            throw new ValueOutOfBoundsException();
        }
        grid[x][y] = value;
    }

    public boolean chechForTriliza() {
        return ((grid[0][0] == grid[1][1]) && (grid[1][1] == grid[2][2]) ||
                    (grid[0][2] == grid[1][1]) && (grid[1][1] == grid[2][0]) &&
                            (grid[1][1] != 0));
    }

}
