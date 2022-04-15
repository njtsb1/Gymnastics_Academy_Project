package me.dio.academy.digital.service.impl;

import me.dio.academy.digital.entity.Student;
import me.dio.academy.digital.entity.PhysicalAssessment;
import me.dio.academy.digital.entity.form.StudentForm;
import me.dio.academy.digital.entity.form.StudentUpdateForm;
import me.dio.academy.digital.infra.utils.JavaTimeUtils;
import me.dio.academy.digital.repository.StudentRepository;
import me.dio.academy.digital.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

  @Autowired
  private StudentRepository repository;

  @Override
  public Student create(StudentForm form) {
    Student student = new Student();
    Student.setName(form.getName());
    Student.setCpf(form.getCpf());
    Student.setDistrict(form.getNeighborhood());
    Student.setBirthDate(form.getDateOfBirth());

    return repository.save(student);
  }

  @Override
  public Student get(Long id) {
    return null;
  }

  @Override
  public List<Student> getAll(String BirthDate) {

    if(BirthDate == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(BirthDate, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByDateOfBirth(localDate);
    }

  }

  @Override
  public Student update(Long id, StudentUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {
  }

  @Override
  public List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id) {

    Student student = repository.findById(id).get();

    return student.getAssessments();

  }

}
