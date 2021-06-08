package java8.refresh.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3Sorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 30, "Bay", 100000));
        employees.add(new Employee(2, 40, "Jin", 140000));
        employees.add(new Employee(3, 25, "Vik", 105000));
        employees.add(new Employee(4, 42, "ABB", 99000));

        //Collections.sort(employees, new SortEmployee());

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }
//        });

        Collections.sort(employees, (Employee o1, Employee o2) -> {
            return (int) (o1.getSalary() - o2.getSalary());
        });

        System.out.println(employees);

    }
}

class SortEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}