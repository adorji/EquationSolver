package com.adorji.equationsolver.repository;

import com.adorji.equationsolver.model.Equation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquationRepository extends JpaRepository<Equation, Long> {
}
