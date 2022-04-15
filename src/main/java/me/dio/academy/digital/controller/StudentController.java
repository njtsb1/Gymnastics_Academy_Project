package me.dio.academy.digital.controller;

import me.dio.academy.digital.entity.Student;
import me.dio.academy.digital.entity.PhysicalAssessment;
import me.dio.academy.digital.entity.form.StudentForm;
import me.dio.academy.digital.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {

  @Autowired
  private StudentServiceImpl service;

  @PostMapping
  public Student create(@Valid @RequestBody StudentForm form) {
    return service.create(form);
  }

  @GetMapping("/assessments/{id}")
  public List<PhysicalAssessment> getAllPhysicalAssessmentId(@PathVariable Long id) {
    return service.getAllPhysicalAssessmentId(id);
  }

  @GetMapping
  public List<Student> getAll(@RequestParam(value = "BirthDate", required = false)
                                  String birthdate){
    return service.getAll(birthdate);
  }


}
