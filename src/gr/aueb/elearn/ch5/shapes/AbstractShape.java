package gr.aueb.elearn.ch5.shapes;

public abstract class AbstractShape implements Ishape{

    private String type;

    AbstractShape(){
        type = "";
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printShape() {
        System.out.println(this);
        /*if (this instanceof TowDimensional){
            System.out.println("Area: %.2f%n", ((TowDimensional) this).area);
        }*/
    }

    @Override
    public abstract String toString();
}
