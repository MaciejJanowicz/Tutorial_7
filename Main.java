import java.util.*;

public class Main {
    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        if (num < 0) {
            throw new NegativeNumberException();
        }
        return num;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                array[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        // Zadanie 1
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("Lexus", 2014),
                new Car("Volvo", 2011),
                new Car("Ford", 2021),
                new Car("Toyota", 2004),
                new Car("Audi", 2012),
                new Car("Peugeot", 2003),
                new Car("Fiat", 2016),
                new Car("Citroen", 2017),
                new Car("Mercedes", 2023),
                new Car("Audi", 2001)
        ));

        Collections.sort(cars);
        System.out.println("Zadanie 1: Posortowane samochody");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Zadanie 2
        ArrayList<Item> items = new ArrayList<>(Arrays.asList(
                new Item("zielony"),
                new Item("czerwony"),
                new Item("żółty"),
                new Item("szary"),
                new Item("niebieski"),
                new Item("czarny"),
                new Item("bordowy"),
                new Item("srebrny"),
                new Item("złoty"),
                new Item("biały")
        ));

        System.out.println("\nZadanie 2: Wywołanie metody show()");
        for (int i = 0; i < 5; i++) {
            items.get(i).show();
        }

        HashMap<UUID, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.getId(), item.getName());
        }

        System.out.println("\nZadanie 2: Iteracja po mapie");
        for (Map.Entry<UUID, String> entry : itemsMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

        // Zadanie 3
        List<Item> subItems = items.subList(0, 5);
        HashSet<Item> setItems = new HashSet<>(subItems);

        System.out.println("\nZadanie 3: Elementy w HashSet");
        for (Item item : setItems) {
            System.out.println(item);
        }

        // Zadanie 4
        int[] arr = new int[10];
        fillArray(arr);

        System.out.println("\nZadanie 4: Zawartość tablicy");
        for (int number : arr) {
            System.out.println(number);
        }
    }
}