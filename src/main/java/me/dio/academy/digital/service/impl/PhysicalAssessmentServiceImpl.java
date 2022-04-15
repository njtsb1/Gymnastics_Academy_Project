package me.dio.academy.digital.service.impl;

import me.dio.academy.digital.entity.Student;
import me.dio.academy.digital.entity.PhysicalAssessment;
import me.dio.academy.digital.entity.form.PhysicalAssessmentForm;
import me.dio.academy.digital.entity.form.PhysicalAssessmentUpdateForm;
import me.dio.academy.digital.repository.StudentRepository;
import me.dio.academy.digital.repository.PhysicalAssessmentRepository;
import me.dio.academy.digital.service.IPhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessmentService {

  @Autowired
  private PhysicalAssessmentRepository physicalAssessmentRepository;

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public PhysicalAssessment create(PhysicalAssessmentForm form) {
    PhysicalAssessment physicalAssessment = new PhysicalAssessment();
    Student student = studentRepository.findById(form.getStudentId()).get();

    PhysicalAssessment.setStudent(student);
    PhysicalAssessment.setWeight(form.getWeight());
    PhysicalAssessment.setHeight(form.getHeight());

    return physicalAssessmentRepository.save(physicalAssessment);
  }

  @Override
  public PhysicalAssessment get(Long id) {
    return null;
  }

  @Override
  public List<PhysicalAssessment> getAll() {

    return physicalAssessmentRepository.findAll();
  }

  @Override
  public PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
