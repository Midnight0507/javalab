// 8. a. Write a java program to store the employee details in an ArrayList and display the employee
// details in ascending order of their experience. Create 'Employee' class with two instance variables
// Employee name and Employee experience (no. of years).

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class test8a {
    public static void main(String[] args) {
        ArrayList<Employee> ar = new ArrayList<>();
        ar.add(new Employee("John", 5));
        ar.add(new Employee("Nic", 3));
        ar.add(new Employee("Roma", 9));

        System.out.println("Unsorted Employee List:");
        for (Employee employee : ar) {
            System.out.println(employee);
        }

        Collections.sort(ar, new Sortbyexp());

        System.out.println("Sorted by Experience:");
        for (Employee employee : ar) {
            System.out.println(employee);
        }
    }
}

class Employee {
    String empname;
    int exp;

    Employee(String empname, int exp) {
        this.empname = empname;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return this.empname + " " + this.exp;
    }
}

class Sortbyexp implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return Integer.compare(a.exp, b.exp);
    }
}


// OUTPUT: Unsorted Emp List
// John 5
// Nic 3
// Roma 9
// Sorted by Experience
// 42
// Nic 3
// John 5
// Roma 9