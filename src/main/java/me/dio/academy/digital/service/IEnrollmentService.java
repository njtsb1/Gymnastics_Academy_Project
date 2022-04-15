package me.dio.academy.digital.service;

import me.dio.academy.digital.entity.Enrollment;
import me.dio.academy.digital.entity.form.EnrollmentForm;

import java.util.List;

public interface IEnrollmentService {
/**
   * Creates an Enrollment and saves it in the database.
   * @param form - form referring to the data for creating the Registration in the database.
   * @return - Newly created registration.
   */
  Enrollment create(EnrollmentForm form);

  /**
   * Returns a Registration that is in the database according to its Id.
   * @param id - id of the Registration that will be displayed.
   * @return - Registration according to the Id provided.
   */
  Enrollment get(Long id);

  /**
   * Returns all Enrollments that are in the database.
   * @return - a list with all the Registrations that are saved in the DB.
   */
  List<Enrollment> getAll(String district);

  /**
   * Deletes a specific Enrollment.
   * @param id - id of the Registration that will be removed.
   */
  void delete(Long id);

}
