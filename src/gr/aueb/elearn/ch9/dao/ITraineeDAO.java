package gr.aueb.elearn.ch9.dao;

import gr.aueb.elearn.ch9.model.Trainee;

public interface ITraineeDAO extends IGenericDAO<Trainee> {
    Trainee getTraineeById(Long id);
}
