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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Cafedra> getCafedras() {
        return cafedras;
    }

    public void setCafedras(Set<Cafedra> cafedras) {
        this.cafedras = cafedras;
    }
}
