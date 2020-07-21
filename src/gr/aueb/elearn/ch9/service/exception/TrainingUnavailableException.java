package gr.aueb.elearn.ch9.service.exception;

public class TrainingUnavailableException extends Exception {
    private static final long serialVersionUID = 1L;

    public TrainingUnavailableException(Long trainingId){
        super("Training with id " + trainingId + " does not exist");
    }
}
