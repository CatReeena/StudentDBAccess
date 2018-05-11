package com.student.demo.cafedra;

import com.student.demo.faculty.Faculty;
import com.student.demo.speciality.Speciality;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cafedra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "cafedra")
    private Set<Speciality> specialities = new HashSet<>();
    @ManyToOne
    private Faculty faculty;
    private String name;
    private String shifr;


    public void addSpeciality(Speciality speciality) {
        specialities.add(speciality);
        speciality.setCafedra(this);
    }

    public void removeSpeciality(Speciality speciality) {
        specialities.remove(speciality);
        speciality.setCafedra(null);
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }
}
