package com.finac.sports.tennis.app.rest;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "User")
public class Employee {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column (name = "employee_id")
    private Integer employeeId;

    @Column(name = "id")
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


    public Employee(String firstName, String lastName, Integer age, Integer employeeId, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employeeId = employeeId;
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    @Repository
    public interface EmployeeRepository {

        Collection<Employee> list();

        Optional<Object> findById(Integer id);

        Employee save(Employee employee);

        void deleteById(Integer id);
    }
}
