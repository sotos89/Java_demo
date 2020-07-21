package gr.aueb.elearn.ch9.dao;

import gr.aueb.elearn.ch9.model.Trainee;

public class TraineeDAOImpl extends AbstractDAO<Trainee> implements ITraineeDAO{

    public TraineeDAOImpl() {
        this.setPersistentClass(Trainee.class);
    }

    @Override
    public Trainee getTraineeById(Long id) {
        for (Trainee trainee : getTList()){
            if (trainee.getId().equals(id)){
                return trainee;
            }
        }
        return null;
    }
}
