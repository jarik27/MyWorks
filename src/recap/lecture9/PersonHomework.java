package recap.lecture9;

import java.util.ArrayList;
import java.util.List;

public class PersonHomework {
    public static void main(String[] args) {
        Person pers1 = new Person("Pavel", 35);
        Person pers2 = new Person("Heidi", 32);
        Person pers3 = new Person("Kaspar", 30);
        Person pers4 = new Person("Vladimir", 37);
        Person pers5 = new Person("Jarik", 39);

        List<Person> personList = new ArrayList<>();
        personList.add(pers1);
        personList.add(pers2);
        personList.add(pers3);
        personList.add(pers4);
        personList.add(pers5);

        // I variant(important)
        for (Person someone:personList) {
            System.out.println(someone.getName() + " " + someone.getAge());
        }

        // II variant(important)
        for (int counter = 0; counter < personList.size(); counter++) {
            System.out.println(personList.get(counter).getName() + " " + personList.get(counter).getAge());
        }
    }
}
