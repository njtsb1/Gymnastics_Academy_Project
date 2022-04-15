package me.dio.academy.digital.service.impl;

import me.dio.academy.digital.entity.Student;
import me.dio.academy.digital.entity.Enrollment;
import me.dio.academy.digital.entity.form.EnrollmentForm;
import me.dio.academy.digital.repository.StudentRepository;
import me.dio.academy.digital.repository.EnrollmentRepository;
import me.dio.academy.digital.service.IEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements IEnrollmentService {

  @Autowired
  private EnrollmentRepository enrollmentRepository;

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Enrollment create(EnrollmentForm form) {
    Enrollment enrollment = new Enrollment();
    Student student = studentRepository.findById(form.getStudentId()).get();

    Enrollment.setStudent(student);

    return enrollmentRepository.save(enrollment);
  }

  @Override
  public Enrollment get(Long id) {
    return enrollmentRepository.findById(id).get();
  }

  @Override
  public List<Enrollment> getAll(String district) {

    if(district == null){
      return enrollmentRepository.findAll();
    }else{
      return enrollmentRepository.findStudentsEnrolledNeighborhood(district);
    }

  }

  @Override
  public void delete(Long id) {}



}
