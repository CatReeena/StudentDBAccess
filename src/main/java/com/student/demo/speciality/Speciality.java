package com.student.demo.speciality;

import com.student.demo.cafedra.Cafedra;
import com.student.demo.group.GroupOfStudents;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String shifr;
    @ManyToOne
    private Cafedra cafedra;
    @OneToMany(mappedBy = "speciality")
    private Set<GroupOfStudents> groupOfStudents = new HashSet<>();

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }

    public void addGroup(GroupOfStudents groupOfStudents)
    {
        this.groupOfStudents.add(groupOfStudents);
        groupOfStudents.setSpeciality(this);
    }

    public void removeGroup(GroupOfStudents groupOfStudents)
    {
        this.groupOfStudents.remove(groupOfStudents);
        groupOfStudents.setSpeciality(null);
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

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }

    public Set<GroupOfStudents> getGroupOfStudents() {
        return groupOfStudents;
    }

    public void setGroupOfStudents(Set<GroupOfStudents> groupOfStudents) {
        this.groupOfStudents = groupOfStudents;
    }
}
