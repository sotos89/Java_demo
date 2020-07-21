package gr.aueb.elearn.ch9.dao;

import gr.aueb.elearn.ch9.model.Training;

public interface ITrainingDAO extends IGenericDAO<Training> {
    Training getTrainingById(Long id);
}
