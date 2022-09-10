import java.util.*;

public class Main {
    private static List<Person> generateClients() {
        return List.of(
                new Person("Andrey", "Smirnov", 4),
                new Person("Olga", "Pavlova", 5),
                new Person("Elena", "Efimova", 2),
                new Person("Zoya", "Ivanova", 1),
                new Person("Anna", "Petrova", 2),
                new Person("Ivan", "Ivanov", 3),
                new Person("Vladimir", "Sividov", 5));
    }

    public static void main(String[] args) {
        Queue<Person> queueAttraction = new LinkedList<>(generateClients());

        while (!queueAttraction.isEmpty()) {
            Person currentPerson = queueAttraction.poll();
            System.out.printf("%s %s вышел из аттракциона, имея - %d билет(а/ов)\n",
                    currentPerson.getName(),
                    currentPerson.getSurName(),
                    currentPerson.getQuantityTickets());
            int quantityTickets = currentPerson.getQuantityTickets();

            if (quantityTickets > 0) {
                System.out.printf("%s %s решил покататься на аттракционах, имея - %d билет(а/ов)\n",
                        currentPerson.getName(),
                        currentPerson.getSurName(),
                        currentPerson.getQuantityTickets());
                currentPerson.setQuantityTickets(--quantityTickets);
                queueAttraction.offer(currentPerson);
            }
        }
        System.out.println("Билеты закончились!");
    }
}