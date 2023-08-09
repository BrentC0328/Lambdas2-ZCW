import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {

        PersonList.printPersons(

                new PersonList() {
                    public boolean test (Person p){
                        if (p.getAge() > 21){
                            return true;
                        }
                        return false;
                    }
                }
        );

    }
}
