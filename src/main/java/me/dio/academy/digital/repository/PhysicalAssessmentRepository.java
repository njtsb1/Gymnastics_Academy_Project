package me.dio.academy.digital.repository;

import me.dio.academy.digital.entity.PhysicalAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalAssessmentRepository extends JpaRepository<PhysicalAssessment, Long> {

}
