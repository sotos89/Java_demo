package gr.aueb.elearn.ch9.dao;

import gr.aueb.elearn.ch9.model.Training;

public class TrainingDAOImpl extends AbstractDAO<Training> implements ITrainingDAO{

    public TrainingDAOImpl() {
        this.setPersistentClass(Training.class);
    }

    @Override
    public Training getTrainingById(Long id) {
        for (Training training : getTList()){
            if (training.getTrainingId().equals(id)){
                return training;
            }
        }
        return null;
    }
}
