package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee {

    private List<Employee> supervisedEmployees;

    public Supervisor(String name) {
        super(name);
        this.supervisedEmployees = new ArrayList<>();
    }

    public List<Employee> getSupervisedEmployees() {
        return supervisedEmployees;
    }

    public void hireEmployee(Employee employee) {
        supervisedEmployees.add(employee);
    }

    public void fireEmployee(Employee employee) {
        supervisedEmployees.remove(employee);
    }

    public void listHierarchy(int level) {
        printName(level);
        for (Employee e : supervisedEmployees) {
            e.listHierarchy(level + 1);
        }

    }
    // TODO 2: Implement the Supervisor class

    // TODO 3: Implement listHierarchy() for Supervisor
}
