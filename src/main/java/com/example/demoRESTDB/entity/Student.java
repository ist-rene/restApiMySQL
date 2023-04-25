package com.example.demoRESTDB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @Getter
    private String studentName;

    @Getter
    private String email;

    @Getter
    @Setter
    private String subject;

    public Student() {}

    public Student(String studentName, String email, String subject) {
        this.studentName = studentName;
        this.email = email;
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Student student))
            return false;
        return Objects.equals(this.id, student.id) && Objects.equals(this.studentName, student.studentName) && Objects.equals(this.email, student.email)
                && Objects.equals(this.subject, student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.email, this.studentName, this.subject);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", studentName='" + this.studentName + '\'' +
                ", password='" + this.email + '\'' + ", subject='" + this.subject + '\'' + '}';
    }

}
