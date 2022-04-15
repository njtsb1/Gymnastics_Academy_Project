package me.dio.academy.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_students")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(unique = true)
  private String cpf;

  private String district;

  private LocalDate BirthDate;

  @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
  @JsonIgnore
  private List<PhysicalAssessment> assessments = new ArrayList<>();

}
