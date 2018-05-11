package com.student.demo.semestr;

import com.student.demo.teachplan.TeachPlan;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Semestr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate teachBeginDate;
    private LocalDate teachEndDate;
    private LocalDate sessionBeginDate;
    private LocalDate sessionEndDate;
    private LocalDate firstAttestDate;
    private LocalDate secondAttestDate;

    @OneToMany(mappedBy = "semestr")
    private Set<TeachPlan> teachPlans = new HashSet<>();

    public void addPlan(TeachPlan teachPlan)
    {
        teachPlans.add(teachPlan);
        teachPlan.setSemestr(this);
    }
    public void removePlan(TeachPlan teachPlan)
    {
        teachPlans.remove(teachPlan);
        teachPlan.setSemestr(null);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDate getTeachBeginDate() {
        return teachBeginDate;
    }

    public void setTeachBeginDate(LocalDate teachBeginDate) {
        this.teachBeginDate = teachBeginDate;
    }

    public LocalDate getTeachEndDate() {
        return teachEndDate;
    }

    public void setTeachEndDate(LocalDate teachEndDate) {
        this.teachEndDate = teachEndDate;
    }

    public LocalDate getSessionBeginDate() {
        return sessionBeginDate;
    }

    public void setSessionBeginDate(LocalDate sessionBeginDate) {
        this.sessionBeginDate = sessionBeginDate;
    }

    public LocalDate getSessionEndDate() {
        return sessionEndDate;
    }

    public void setSessionEndDate(LocalDate sessionEndDate) {
        this.sessionEndDate = sessionEndDate;
    }

    public LocalDate getFirstAttestDate() {
        return firstAttestDate;
    }

    public void setFirstAttestDate(LocalDate firstAttestDate) {
        this.firstAttestDate = firstAttestDate;
    }

    public LocalDate getSecondAttestDate() {
        return secondAttestDate;
    }

    public void setSecondAttestDate(LocalDate secondAttestDate) {
        this.secondAttestDate = secondAttestDate;
    }

    public Set<TeachPlan> getTeachPlans() {
        return teachPlans;
    }

    public void setTeachPlans(Set<TeachPlan> teachPlans) {
        this.teachPlans = teachPlans;
    }
}
