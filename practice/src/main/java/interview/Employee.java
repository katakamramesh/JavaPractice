package interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@Component
public class Employee {
    int salary;
    String name;
    int age;

}
