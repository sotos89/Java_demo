package gr.aueb.elearn.ch9.app;

import gr.aueb.elearn.ch9.dao.ITraineeDAO;
import gr.aueb.elearn.ch9.dao.ITrainingDAO;
import gr.aueb.elearn.ch9.dao.TraineeDAOImpl;
import gr.aueb.elearn.ch9.dao.TrainingDAOImpl;
import gr.aueb.elearn.ch9.dto.TraineeDTO;
import gr.aueb.elearn.ch9.dto.TrainingDTO;
import gr.aueb.elearn.ch9.model.Trainee;
import gr.aueb.elearn.ch9.model.Training;
import gr.aueb.elearn.ch9.service.AddParticipantToTrainingServicesImpl;
import gr.aueb.elearn.ch9.service.IAddParticipantToTrainingService;
import gr.aueb.elearn.ch9.service.exception.TrainingFullyBookedException;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ITraineeDAO traineeDAO = new TraineeDAOImpl();
        ITrainingDAO trainingDAO = new TrainingDAOImpl();

        IAddParticipantToTrainingService addParticipantToTrainingService = new AddParticipantToTrainingServicesImpl(traineeDAO, trainingDAO);


        Trainee alice = traineeDAO.getInstanceOf(Trainee.class);
        alice.setId(1L);
        alice.setFirstName("Alice");
        alice.setLastName("AliceLast");

        Trainee bob = traineeDAO.getInstanceOf(Trainee.class);
        bob.setId(1L);
        alice.setFirstName("bob");
        bob.setLastName("bobLast");

        Trainee chris = traineeDAO.getInstanceOf(Trainee.class);
        chris.setId(1L);
        chris.setFirstName("chris");
        chris.setLastName("chrisLast");

        traineeDAO.save(alice);
        traineeDAO.save(bob);
        traineeDAO.save(chris);

        chris = traineeDAO.delete(chris);


        Training javaEntry = trainingDAO.getInstanceOf(Training.class);
        javaEntry.setTrainingId(1L);
        javaEntry.setDescription("Java Entry");
        javaEntry.setTitle("java entry");

        trainingDAO.save(javaEntry);

        traineeDAO.showList();
        trainingDAO.showList();


        TraineeDTO traineeDTO = new TraineeDTO();
        traineeDTO.setId(1L);
        TrainingDTO trainingDTO = new TrainingDTO();
        trainingDTO.setTrainingId(1L);

        try {
            addParticipantToTrainingService.addParticipantToTraining(traineeDTO, trainingDTO);
        }catch (TrainingFullyBookedException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        traineeDAO.showList();

        traineeDTO.setId(1L);
        trainingDTO.setTrainingId(2L);

        try {
            addParticipantToTrainingService.addParticipantToTraining(traineeDTO, trainingDTO);
        }catch (TrainingFullyBookedException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        traineeDAO.showList();
    }
}
