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
}
