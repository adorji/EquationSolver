package com.adorji.equationsolver.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "equation")
public class Equation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "Поле обязательно для заполнения")
    @Digits(integer=10, fraction=0, message = "Не более 10 цифр")
    private int a;

    @Column(nullable = false)
    @Digits(integer=3, fraction=0, message = "Не более 10 цифр")
    private int b;

    @Column(nullable = false)
    @Digits(integer=3, fraction=0, message = "Не более 3-х цифр")
    private int c;

    private Double root1;

    private Double root2;

    public Long getId() {
        return id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Double getRoot1() {
        return root1;
    }

    public void setRoot1(Double root1) {
        this.root1 = root1;
    }

    public Double getRoot2() {
        return root2;
    }

    public void setRoot2(Double root2) {
        this.root2 = root2;
    }
}
