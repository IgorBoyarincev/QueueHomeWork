import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        List<Person> listPersons = generateClients();
        Queue<Person> persons = new LinkedTransferQueue<>();
        for (Person listPerson : listPersons) {
            persons.offer(listPerson);
        }
        while (!persons.isEmpty()) {
            Person person = persons.poll();
            if (person.getCountTicket() == 0) {
                System.out.println("\t" + person.getFullName() + " откатался на аттракционах");
            } else if (person.getCountTicket() == 1) {
                person.useTicket();
                System.out.println(person.getFullName() + " прокатился на аттракционе");
            } else {
                person.useTicket();
                System.out.println(person.getFullName() + " прокатился на аттракционе");
                persons.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        Random random = new Random();
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Иавнов Иван", random.nextInt(10));
        list.add(person1);
        Person person2 = new Person("Петров Петр", random.nextInt(10));
        list.add(person2);
        Person person3 = new Person("Александров Александр", random.nextInt(10));
        list.add(person3);
        Person person4 = new Person("Васильев Василий", random.nextInt(10));
        list.add(person4);
        Person person5 = new Person("Федоров Федор", random.nextInt(10));
        list.add(person5);
        return list;
    }
}
