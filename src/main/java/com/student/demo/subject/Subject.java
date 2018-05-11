package com.student.demo.subject;

import com.student.demo.teachplan.TeachPlan;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String shifr;

    @OneToMany(mappedBy = "subject")
    private Set<TeachPlan> teachPlans = new HashSet<>();

    public void addPlan(TeachPlan teachPlan)
    {
        teachPlans.add(teachPlan);
        teachPlan.setSubject(this);
    }
    public void removePlan(TeachPlan teachPlan)
    {
        teachPlans.remove(teachPlan);
        teachPlan.setSubject(null);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Set<TeachPlan> getTeachPlans() {
        return teachPlans;
    }

    public void setTeachPlans(Set<TeachPlan> teachPlans) {
        this.teachPlans = teachPlans;
    }
}
