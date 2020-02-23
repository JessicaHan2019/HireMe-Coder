package rolls;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity

public class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String branch;

    Employee(){}

    Employee(String name, String branch){
        this.name = name;
        this.branch = branch;
    }


}

