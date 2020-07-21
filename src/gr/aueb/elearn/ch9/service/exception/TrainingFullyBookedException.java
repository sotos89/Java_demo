package gr.aueb.elearn.ch9.service.exception;

import gr.aueb.elearn.ch9.model.Training;

public class TrainingFullyBookedException extends Exception{
    private static final long serialVersionUID = 1L;

    public TrainingFullyBookedException(Training training){
        super("Training with id " + training.getTrainingId() + "is already booked");
    }
}
