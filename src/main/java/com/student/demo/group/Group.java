package com.student.demo.group;

import com.student.demo.student.Student;
import com.student.demo.teachplan.TeachPlan;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate createDate;
    private String groupCode;

    @ManyToMany
    private Set<Student> students = new HashSet<>();
    @OneToMany(mappedBy = "group")
    private Set<TeachPlan> teachPlans = new HashSet<>();
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
        teachPlan.setGroup(this);
    }

    public void removeTeachPlan(TeachPlan teachPlan)
    {
        teachPlans.remove(teachPlan);
        teachPlan.setGroup(null);
    }


}
