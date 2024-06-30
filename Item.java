import java.util.UUID;

public class Item {
    private UUID id;
    private String name;
    public Item(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
    public void show() {
        System.out.println("Name: " + name);
    }
    public String getName() {
        return this.name;
    }
    public UUID getId() {
        return this.id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}