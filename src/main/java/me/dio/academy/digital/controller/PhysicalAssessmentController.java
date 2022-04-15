package me.dio.academy.digital.controller;

import me.dio.academy.digital.entity.PhysicalAssessment;
import me.dio.academy.digital.entity.form.PhysicalAssessmentForm;
import me.dio.academy.digital.service.impl.PhysicalAssessmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assessments")
public class PhysicalAssessmentController {

  @Autowired
  private PhysicalAssessmentServiceImpl service;

  @PostMapping
  public PhysicalAssessment create(@RequestBody PhysicalAssessmentForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<PhysicalAssessment> getAll(){
    return service.getAll();
  }

}
