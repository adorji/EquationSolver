package com.adorji.equationsolver.util;

import com.adorji.equationsolver.model.Equation;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class EquationValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Equation.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Equation equation = (Equation) o;
        if (equation.getA() == 0) {
            errors.rejectValue("a", "", "Коэффициент А не может быть равен нулю");
        }
    }
}
