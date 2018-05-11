package com.student.demo.student;


import com.student.demo.contract.Contract;
import com.student.demo.group.GroupOfStudents;
import com.student.demo.person.Person;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookNumber;
    @ManyToOne
    private Person person;
    @ManyToMany
    private Set<GroupOfStudents> groupOfStudents = new HashSet<>();
    @OneToMany(mappedBy = "student")
    private Set<Contract> contracts = new HashSet<>();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Long bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void addGroup(GroupOfStudents groupOfStudents) {
        this.groupOfStudents.add(groupOfStudents);
    }

    public void removeGroup(GroupOfStudents groupOfStudents) {
        this.groupOfStudents.remove(groupOfStudents);
    }

    public Set<GroupOfStudents> getGroupOfStudents() {
        return groupOfStudents;
    }

    public void setGroupOfStudents(Set<GroupOfStudents> groupOfStudents) {
        this.groupOfStudents = groupOfStudents;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
