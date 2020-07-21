package gr.aueb.elearn.ch9.service;

import gr.aueb.elearn.ch9.dao.ITraineeDAO;
import gr.aueb.elearn.ch9.dao.ITrainingDAO;
import gr.aueb.elearn.ch9.dto.TraineeDTO;
import gr.aueb.elearn.ch9.dto.TrainingDTO;
import gr.aueb.elearn.ch9.model.Trainee;
import gr.aueb.elearn.ch9.model.Training;
import gr.aueb.elearn.ch9.service.exception.TraineeNotFoundException;
import gr.aueb.elearn.ch9.service.exception.TrainingFullyBookedException;
import gr.aueb.elearn.ch9.service.exception.TrainingUnavailableException;

public class AddParticipantToTrainingServicesImpl implements IAddParticipantToTrainingService {

    private final ITraineeDAO traineeDAO;
    private final ITrainingDAO trainingDAO;

    public AddParticipantToTrainingServicesImpl(ITraineeDAO traineeDAO, ITrainingDAO trainingDAO){
        this.traineeDAO = traineeDAO;
        this.trainingDAO = trainingDAO;
    }

    @Override
    public void addParticipantToTraining(TraineeDTO traineeDTO, TrainingDTO trainingDTO) throws TrainingFullyBookedException {
//        Training training, newTraining;
//        Trainee trainee, newTrainee;

        try {
            Trainee trainee = extractTrainee(traineeDTO);
            Trainee newTrainee = new Trainee(trainee);

            Training training = extractTraining(trainingDTO);
            Training newTraining = new Training(training);

            if (training.getTrainees().size() < 25){
                newTraining.addTrainee(trainee);
                newTrainee.setTraining(newTraining);
                trainingDAO.update(training, newTraining);
                System.out.println("update");
                traineeDAO.update(trainee, newTrainee);
            }else {
                throw new TrainingFullyBookedException(training);
            }

        } catch (TraineeNotFoundException | TrainingUnavailableException e) {
            e.printStackTrace();
        }
    }

    private Trainee extractTrainee (TraineeDTO traineeDTO) throws TraineeNotFoundException{
        Trainee trainee = traineeDAO.getTraineeById(traineeDTO.getId());
        if (trainee != null) return trainee;
        else throw new TraineeNotFoundException(traineeDTO.getId());
    }

    private Training extractTraining (TrainingDTO trainingDTO) throws TrainingUnavailableException {
        Training training = trainingDAO.getTrainingById(trainingDTO.getTrainingId());
        if (training != null) return training;
        else throw new TrainingUnavailableException(trainingDTO.getTrainingId());
    }
}
