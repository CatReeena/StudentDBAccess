package com.student.demo.contract;

import com.student.demo.contractkind.ContractKind;
import com.student.demo.student.Student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Long sum;
    @ManyToOne
    private Student student;
    @ManyToOne
    private ContractKind contractKind;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ContractKind getContractKind() {
        return contractKind;
    }

    public void setContractKind(ContractKind contractKind) {
        this.contractKind = contractKind;
    }
}
