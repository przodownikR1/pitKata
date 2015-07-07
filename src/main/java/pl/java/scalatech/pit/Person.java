package pl.java.scalatech.pit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String desc;

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean isAdultChecker(int threshold) {
        if (threshold > 18) { return true; }
        return false;
    }

    public boolean nameCheckerByPattern(String pattern) {

        if (this.getFirstName().equals(pattern)) { return true; }
        return false;
    }

    public static void main(String[] args) {

    }
}
