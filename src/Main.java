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
                System.out.println("\t"+person.getFullName()+" ��������� �� �����������");
            } else {
                person.useTicket();
                System.out.println(person.getFullName() + " ���������� �� ����������");
                persons.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        Random random = new Random();
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("������ ����", random.nextInt(10));
        list.add(person1);
        Person person2 = new Person("������ ����", random.nextInt(10));
        list.add(person2);
        Person person3 = new Person("������� �����", random.nextInt(10));
        list.add(person3);
        Person person4 = new Person("������� �����", random.nextInt(10));
        list.add(person4);
        Person person5 = new Person("�������� �������", random.nextInt(10));
        list.add(person5);
        return list;
    }
}
