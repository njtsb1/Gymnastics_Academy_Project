package me.dio.academy.digital.repository;

import me.dio.academy.digital.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

  /**
   *
   * @param district district reference for the filter
   * @return list of Enrollmentdos students residing in the district passed as a parameter
   */
  @Query(value = "SELECT * FROM tb_Enrollments m " +
      "INNER JOIN tb_students a ON m.student_id = a.id " +
      "WHERE a.district = :district", nativeQuery = true)
  //@Query("FROM Enrollment m WHERE m.student.district = :district ")
  List<Enrollment> findStudentsEnrollmentbyDistrict(String district);

  //List<Enrollment> findByStudentdistrict(String district);


}
