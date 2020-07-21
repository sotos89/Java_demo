package gr.aueb.elearn.ch9.service.exception;

public class TraineeNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public TraineeNotFoundException(Long id){
        super("Trainee with id " + " does not exist");
    }
}
