package com.student.demo.testkind;



import com.student.demo.teachplan.TeachPlan;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class TestKind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    @OneToMany(mappedBy = "testKind")
    private Set<TeachPlan> teachPlans = new HashSet<>();

    public void addPlan(TeachPlan teachPlan)
    {
        teachPlans.add(teachPlan);
        teachPlan.setTestKind(this);
    }
    public void removePlan(TeachPlan teachPlan)
    {
        teachPlans.remove(teachPlan);
        teachPlan.setTestKind(null);
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

    public Set<TeachPlan> getTeachPlans() {
        return teachPlans;
    }

    public void setTeachPlans(Set<TeachPlan> teachPlans) {
        this.teachPlans = teachPlans;
    }
}
