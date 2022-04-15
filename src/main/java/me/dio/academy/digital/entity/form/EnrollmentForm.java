package me.dio.academy.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentForm {

  @NotNull(message = "Please fill in the field correctly.")
  @Positive(message = "Student ID must be positive.")
  private Long studentId;
}
