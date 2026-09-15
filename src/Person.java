/**
 * Person is the abstract parent of Student and Instructor.
 * It holds the fields and behavior every Person shares,
 * and declares one abstract method that every subclass
 * must implement in its own way.
 */
public abstract class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // No body here -- every concrete subclass MUST implement this.
    public abstract void displayRole();
}
