package com.student.demo.teachplan;

import com.student.demo.group.GroupOfStudents;
import com.student.demo.person.Person;
import com.student.demo.semestr.Semestr;
import com.student.demo.subject.Subject;
import com.student.demo.testkind.TestKind;

import javax.persistence.*;


@Entity
public class TeachPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private TestKind testKind;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Semestr semestr;
    @ManyToOne 
    private GroupOfStudents groupOfStudents;
    @ManyToOne
    private Person person;


    public void setGroupOfStudents(GroupOfStudents groupOfStudents) {
        this.groupOfStudents = groupOfStudents;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public TestKind getTestKind() {
        return testKind;
    }

    public void setTestKind(TestKind testKind) {
        this.testKind = testKind;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Semestr getSemestr() {
        return semestr;
    }

    public void setSemestr(Semestr semestr) {
        this.semestr = semestr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GroupOfStudents getGroupOfStudents() {
        return groupOfStudents;
    }

    public Person getPerson() {
        return person;
    }
}
