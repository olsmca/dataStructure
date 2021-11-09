package dataStructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String title;

    @Override
    public int compareTo(Employee emp) {
        if(this.id == emp.getId()){
            return 0;
        }else if(this.id < emp.getId()){
            return -1;
        }else{
            return 1;
        }
    }
}
