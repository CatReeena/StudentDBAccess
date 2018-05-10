package com.student.demo.teachplan;

import com.student.demo.group.Group;
import com.student.demo.person.Person;

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
    private Group group;
    @ManyToOne
    private Person person;


    public void setGroup(Group group) {
        this.group = group;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
