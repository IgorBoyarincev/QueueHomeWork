import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        List<Person> listPersons = GenerateClients();
        Queue<Person> persons = new LinkedTransferQueue<>();
        for (Person listPerson : listPersons) {
            persons.offer(listPerson);
        }
        while (!persons.isEmpty()) {
            if (persons.peek().getCountTicket() == 0) {
                System.out.println("\t" + persons.poll().getFullName() + " ��������� �� ������������");
            } else {
                persons.peek().useTicket();
                System.out.println(persons.peek().getFullName() + " ���������� �� �����������");
                persons.offer(persons.poll());
            }
        }
    }

    public static List<Person> GenerateClients() {
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
