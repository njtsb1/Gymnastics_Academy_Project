package me.dio.academy.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentForm {

  @NotEmpty(message = "Please fill in the field correctly.")
  @Size(min = 3, max =50, message = "'${validatedValue}' must be between {min} and {max} characters.")
  private String name;

  @NotEmpty(message = "Please fill in the field correctly.")
  //@CPF(message = "'${validatedValue}' is invalid!")
  private String cpf;

  @NotEmpty(message = "Please fill in the field correctly.")
  @Size(min = 3, max =50, message = "'${validatedValue}' must be between {min} and {max} characters.")
  private String district;

  @NotNull(message = "Please fill in the field correctly.")
  @Past(message = "Data '${validatedValue}' is invalid.")
  private LocalDate BirthDate;
}
