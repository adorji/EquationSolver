package com.adorji.equationsolver.service;

import com.adorji.equationsolver.exception.DiscriminantException;
import com.adorji.equationsolver.model.Equation;
import com.adorji.equationsolver.repository.EquationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EquationService {

    @Autowired
    private EquationRepository equationRepository;

    @Transactional
    public Equation calculate(Equation equation) throws DiscriminantException {
        int a = equation.getA();
        int b = equation.getB();
        int c = equation.getC();

        int D = b * b - 4 * a * c;
        if (D < 0) {
            throw new DiscriminantException("Уравнение не имеет действительных корней");
        }
        Double root1 = (-b + Math.sqrt(D)) / (2 * a);
        Double root2 = (-b - Math.sqrt(D)) / (2 * a);

        equation.setRoot1(root1);
        equation.setRoot2(root2);
        return equationRepository.save(equation);
    }

}
