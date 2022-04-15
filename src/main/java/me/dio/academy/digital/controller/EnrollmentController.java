package me.dio.academy.digital.controller;

import me.dio.academy.digital.entity.Enrollment;
import me.dio.academy.digital.entity.form.EnrollmentForm;
import me.dio.academy.digital.service.impl.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Enrollments")
public class EnrollmentController {

  @Autowired
  private EnrollmentServiceImpl service;

  @PostMapping
  public Enrollment create(@Valid @RequestBody EnrollmentForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Enrollment> getAll(@RequestParam(value = "district", required = false) String district) {
    return service.getAll(district);
  }

}

