
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Person person) {
        if (this == person) {
            System.out.println(1);
            return true;
        }

        if (!(person instanceof Person)) {
            System.out.println(2);
            return false;
        }
        Person newperson = (Person) person;
        if (this.birthday.getDay() == newperson.birthday.getDay() && this.birthday.getYear() == newperson.birthday.getYear() && this.birthday.getMonth() == newperson.birthday.getMonth() &&
                this.height == newperson.height && this.name == newperson.name && this.weight == newperson.weight){
            return true;
        }

        return false;
    }

    // implement an equals method here for checking the equality of objects
}
