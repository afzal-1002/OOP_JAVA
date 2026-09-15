/**
 * Instructor shares Person's fields and getName() through
 * inheritance, and adds its own capability through Gradable --
 * a second, independent contract, implemented alongside extends Person.
 */
public class Instructor extends Person implements Gradable {

    public Instructor(String name, int id) {
        super(name, id);
    }

    @Override
    public void grade(Student student, Project project, int score) {
        System.out.println(name + " grades " + student.getName()
            + " on " + project + ": " + score + "/100");
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is an Instructor");
    }
}
