package me.dio.academy.digital.service;

import me.dio.academy.digital.entity.PhysicalAssessment;
import me.dio.academy.digital.entity.form.PhysicalAssessmentForm;
import me.dio.academy.digital.entity.form.PhysicalAssessmentUpdateForm;

import java.util.List;

public interface IPhysicalAssessmentService {
/**
   * Creates a Physical Assessment and saves it to the database.
   * @param form - form referring to the data for creating the Physical Assessment in the database.
   * @return - Newly created Physical Assessment.
   */
  PhysicalAssessment create(PhysicalAssessmentForm form);

  /**
   * Returns a Physical Assessment that is in the database according to its Id.
   * @param id - id of the Physical Assessment that will be displayed.
   * @return - Physical Assessment according to the given Id.
   */
  PhysicalAssessment get(Long id);

  /**
   * Returns all Physical Assessments that are in the database.
   * @return - A list of all the Physical Assessments that are saved in the DB.
   */
  List<PhysicalAssessment> getAll();

  /**
   * Updates the physical assessment.
   * @param id - id of the Physical Assessment that will be updated.
   * @param formUpdate - form referring to the data needed to update the Assessment
   * Physics in the database.
   * @return - Newly updated Physical Assessment.
   */
  PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate);

  /**
   * Deletes a specific Physical Assessment.
   * @param id - id of the Physical Assessment that will be removed.
   */
  void delete(Long id);
}
