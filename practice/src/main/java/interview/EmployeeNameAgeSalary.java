package interview;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNameAgeSalary {

    List<Employee> employees = getEmployees();

    private static List<Employee> getEmployees() {
//        return new ArrayList<>();
        return List.of(new Employee(60000, "Alice", 35),
                new Employee(45000, "Bob", 28),
                new Employee(75000, "Charlie", 40));
    }

    public static void main(String[] args) {
        List<Employee> employees = getEmployees(); // assume this fetches the list

        List<Employee> filteredSortedEmployees = Optional.ofNullable(employees)
                .orElse(Collections.emptyList())
                .stream()
                .filter(e -> e != null && e.getSalary() > 50000 && e.getAge() > 30)
                .sorted(Comparator.comparing(Employee::getName, Comparator.nullsLast(String::compareTo)))
                .collect(Collectors.toList());

        System.out.println(filteredSortedEmployees);

    }
}
