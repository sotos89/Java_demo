package gr.aueb.elearn.ch9.service;

import gr.aueb.elearn.ch9.dto.TraineeDTO;
import gr.aueb.elearn.ch9.dto.TrainingDTO;
import gr.aueb.elearn.ch9.service.exception.TrainingFullyBookedException;

public interface IAddParticipantToTrainingService {

    void addParticipantToTraining(TraineeDTO traineeDTO, TrainingDTO trainingDTO) throws TrainingFullyBookedException;
}
