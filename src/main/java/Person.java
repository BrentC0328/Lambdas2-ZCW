import java.time.LocalDate;

public class Person implements CheckPerson {

    @Override
    public boolean test(Person p) {
        return false;
    }

    public enum Sex {
        MALE, FEMALE;
    }

    String name;
    int age;
    String emailAddress;

    public Person(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }


    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson(){
        System.out.println(this);
    }

}
