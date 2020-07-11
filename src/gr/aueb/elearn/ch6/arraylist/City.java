package gr.aueb.elearn.ch6.arraylist;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String description;
    private List<Trainee> trainees = new ArrayList<>();

    public boolean insert(Trainee trainee){
        return trainees.add(trainee);
    }

    public boolean delete(Trainee trainee){
        return trainees.remove(trainee);
    }

    public Trainee replace(Trainee oldTrainee, Trainee newTrainee){
//        int index = trainees.indexOf(oldTrainee);
        return trainees.set(findPosition(oldTrainee), newTrainee);
    }

    public int findPosition(Trainee trainee){
        return trainees.indexOf(trainee);
    }

    public List<Trainee> getTrainees() {
        return trainees;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }
}
