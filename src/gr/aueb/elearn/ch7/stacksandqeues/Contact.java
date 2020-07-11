package gr.aueb.elearn.ch7.stacksandqeues;

public class Contact {
    private String name;
    public Contact(){}

    public Contact(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                '}';
    }
}
