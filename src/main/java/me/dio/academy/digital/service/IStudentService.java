package me.dio.academy.digital.service;

import me.dio.academy.digital.entity.Student;
import me.dio.academy.digital.entity.PhysicalAssessment;
import me.dio.academy.digital.entity.form.StudentForm;
import me.dio.academy.digital.entity.form.StudentUpdateForm;

import java.time.LocalDate;
import java.util.List;

public interface IStudentService {
  /**
   * Creates a Student and saves it to the database.
   * @param form form referring to the data for creating a Student in the database.
   * @return Newly created student.
   */
  Student create(StudentForm form);

  /**
   * Returns a Student that is in the database according to its Id.
   * @param id id of the Student to be displayed.
   * @return Student according to the Id provided.
   */
  Student get(Long id);

  /**
   * Returns the Students that are in the database.
   * @return A list of Students that are saved in the DB.
   */
  List<Student> getAll(String birthdate);

  /**
   * Updates the Student.
   * @param id id of the Student to be updated.
   * @param formUpdate form referring to the data needed to update the Student
   * in the database.
   * @return Newly upgraded student.
   */
  Student update(Long id, StudentUpdateForm formUpdate);

  /**
   * Deletes a specific Student.
   * @param id id of the Student to be removed.
   */
  void delete(Long id);

  /**
   *
   * @param id id of the student to retrieve the list of assessments
   * @return a list of all student assessments by ID
   */
  List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id);


}
