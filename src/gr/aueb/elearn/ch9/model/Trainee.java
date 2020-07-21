package gr.aueb.elearn.ch9.model;

public class Trainee {
    private Long id;
    private String firstName;
    private String lastName;
    private Training training;

    public Trainee() {
    }

    //copy constructor
    public Trainee(Trainee trainee) {
        this.id = trainee.getId();
        this.firstName = trainee.getFirstName();
        this.lastName = trainee.getLastName();
        this.training = trainee.getTraining();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", training=" + training +
                '}';
    }
}
