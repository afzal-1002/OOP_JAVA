import java.util.List;

/**
 * Run this class to see every concept from the slides happen live:
 * class/object creation, encapsulation, inheritance, abstraction,
 * reference type vs object type, and polymorphism.
 *
 * Compile:  javac *.java
 * Run:      java Main
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("== Creating objects from classes ==");
        Student ana = new Student("Ana", 101, 20);
        Instructor mrLee = new Instructor("Mr. Lee", 900);

        System.out.println();
        System.out.println("== Encapsulation: valid vs invalid data ==");
        try {
            ana.setAge(-5); // rejected by the class itself
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        System.out.println(ana.getName() + " is " + ana.getAge() + " years old");

        System.out.println();
        System.out.println("== Abstraction: enroll through the interface ==");
        Enrollable enrollableAna = ana; // caller only sees Enrollable's contract
        Project capstone = new Project("Capstone");
        enrollableAna.enroll(capstone);

        System.out.println();
        System.out.println("== Reference type vs. object type ==");
        Person p = ana;
        p.displayRole();          // OK -- Student's own version runs
        // p.enroll(capstone);    // Would NOT compile: enroll() isn't on Person

        System.out.println();
        System.out.println("== Polymorphism: one call, many behaviors ==");
        List<Person> people = List.of(ana, mrLee);
        for (Person person : people) {
            person.displayRole();
        }

        System.out.println();
        System.out.println("== Grading (Gradable) ==");
        mrLee.grade(ana, capstone, 95);
    }
}
