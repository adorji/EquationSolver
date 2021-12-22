package com.adorji.equationsolver.controller;

import com.adorji.equationsolver.exception.DiscriminantException;
import com.adorji.equationsolver.model.Equation;
import com.adorji.equationsolver.service.EquationService;
import com.adorji.equationsolver.util.EquationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SolverController {

    @Autowired
    private EquationService equationService;

    @Autowired
    private EquationValidator equationValidator;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        return new ModelAndView("index", "command", new Equation());
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public String solve(@ModelAttribute @Validated Equation equation,
                        BindingResult result, Model model) throws DiscriminantException {
        equationValidator.validate(equation, result);
        if (result.hasErrors()) {
            return "index";
        }
        model.addAttribute("equation", equationService.calculate(equation));
        return "result";
    }

    @ModelAttribute("equation")
    public Equation createEquationModel() {
        return new Equation();
    }

    @ExceptionHandler(DiscriminantException.class)
    public ModelAndView handleDiscriminantExceptionException (DiscriminantException ex) {
        ModelAndView modelAndView =  new ModelAndView("error");
        modelAndView.addObject("exceptionMsg", ex.getMessage());
        return modelAndView;
    }

}
