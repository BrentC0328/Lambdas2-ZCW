import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson(){
        System.out.println(this);
    }
}
