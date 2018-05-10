package com.student.demo.speciality;

import com.student.demo.cafedra.Cafedra;

import javax.persistence.*;

@Entity
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cafedra cafedra;
    private String name;
    private String shifr;

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }
}
