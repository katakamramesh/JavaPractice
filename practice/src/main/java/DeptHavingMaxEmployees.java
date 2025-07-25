import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeptHavingMaxEmployees {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 1001),
                new Employee(2, "Bob", 1002),
                new Employee(3, "Charlie", 1001),
                new Employee(4, "David", 1002),
                new Employee(5, "Eve", 1001)
        );
        Map<Integer, Long> map = employees.stream().collect(Collectors.groupingBy(x -> x.getDepartmentId(), Collectors.counting()));
        Optional<Map.Entry<Integer, Long>> max = map.entrySet().stream().max(Map.Entry.comparingByValue());
        /*
            collect(Collectors.groupingBy -- to groupby
            (x -> x.getDepartmentId(), -- based on dept id
            Collectors.counting())) -- count how many
            map.entrySet() --> gives key and value pairs to stream over map
            max(Map.Entry.comparingByValue()) -- based on the value find the max one
         */
        if(max.isPresent()){
            System.out.println("------" + max.get());
        }else{
            System.out.println("na");
        }

    }


    static class Employee {
        private int id;
        private String name;
        private int departmentId;

        public Employee(int id, String name, int departmentId) {
            this.id = id;
            this.name = name;
            this.departmentId = departmentId;
        }

        public int getDepartmentId() {
            return departmentId;
        }
    }
}