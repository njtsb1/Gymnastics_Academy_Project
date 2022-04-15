package me.dio.academy.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentForm {

  //@Positive(message = "Student ID must be positive.")
  private Long studentId;

  //@NotNull(message = "Please fill in the field correctly.")
  //@Positive(message = "${validatedValue}' must be positive.")
  private double weight;

  //@NotNull(message = "Please fill in the field correctly.")
  //@Positive(message = "${validatedValue}' must be positive.")
  //@DecimalMin(value = "150", message = "'${validatedValue}' must be at least {value}.")
  private double height;
}
