package com.student.demo.person;

import com.student.demo.student.Student;
import com.student.demo.teachplan.TeachPlan;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surname;
    private String name;
    private LocalDate birthDate;
    private byte sex;
    private String birth_place;
    private String address;
    @OneToMany(mappedBy = "person")
    private Set<Student> students = new HashSet<>();
    @OneToMany
    private Set<TeachPlan> plans = new HashSet<>();

    protected Person() {
    }

    public Person(Long id, String surname, String name, LocalDate localDate, byte sex, String birth_place, String address) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
        this.birth_place = birth_place;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setPerson(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.setPerson(null);
    }

    public void addPlan(TeachPlan plan) {
        plans.add(plan);
        plan.setPerson(this);
    }

    public void removePlan(TeachPlan plan) {
        plans.remove(plan);
        plan.setPerson(null);
    }

}
