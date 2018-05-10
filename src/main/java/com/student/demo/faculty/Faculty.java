package com.student.demo.faculty;

import com.student.demo.cafedra.Cafedra;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "faculty")
    private Set<Cafedra> cafedras = new HashSet<>();


    public void addCafedra(Cafedra cafedra)
    {
        cafedras.add(cafedra);
        cafedra.setFaculty(this);
    }

    public void removeCafedra(Cafedra cafedra)
    {
        cafedras.remove(cafedra);
        cafedra.setFaculty(null);
    }

}
