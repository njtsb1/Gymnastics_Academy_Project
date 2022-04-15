package me.dio.academy.digital.repository;

import me.dio.academy.digital.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  /**
   *
   * @param birthdate: Students' birthdate
   * @return lists all Students with the date of birth passed as a parameter to the function
   */
  List<Student> findBybirthdate(LocalDate birthdate);

}
