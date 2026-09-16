import java.util.ArrayList;
import java.util.List;

/**
 * Student demonstrates all four pillars at once:
 *  - Encapsulation: age and projects are private, guarded by methods
 *  - Inheritance:   extends Person, reusing name/id/getName()
 *  - Abstraction:   exposes enroll()/getProjects() via Enrollable,
 *                    hides that it happens to use an ArrayList
 *  - Polymorphism:  overrides displayRole() with its own version
 */
public class Student extends Person implements Enrollable {
    private int age;
    private final List<Project> projects = new ArrayList<>();

    public Student(String name, int id, int age) {
        super(name, id);
        setAge(age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be positive");
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public void enroll(Project project) {
        projects.add(project);
        System.out.println(name + " enrolled in " + project);
    }

    @Override
    public List<Project> getProjects() {
        return projects;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Student (age " + age + ")");
    }
}
