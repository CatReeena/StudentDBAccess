package com.student.demo.group;

import com.student.demo.speciality.Speciality;
import com.student.demo.student.Student;
import com.student.demo.teachplan.TeachPlan;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GroupOfStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate createDate;
    private String groupCode;

    @ManyToMany
    private Set<Student> students = new HashSet<>();
    @OneToMany(mappedBy = "groupOfStudents")
    private Set<TeachPlan> teachPlans = new HashSet<>();
    @ManyToOne
    private Speciality speciality;

    public void addStudent(Student student)
    {
        students.add(student);
        student.addGroup(this);
    }

    public void removeStudent(Student student)
    {
        students.remove(student);
        student.removeGroup(this);
    }

    public void addTeachPlan(TeachPlan teachPlan)
    {
        teachPlans.add(teachPlan);
        teachPlan.setGroupOfStudents(this);
    }

    public void removeTeachPlan(TeachPlan teachPlan)
    {
        teachPlans.remove(teachPlan);
        teachPlan.setGroupOfStudents(null);
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<TeachPlan> getTeachPlans() {
        return teachPlans;
    }

    public void setTeachPlans(Set<TeachPlan> teachPlans) {
        this.teachPlans = teachPlans;
    }
}
