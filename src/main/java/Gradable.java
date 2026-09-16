/**
 * Gradable is a separate, independent contract from Enrollable.
 * A class implementing both gets "multiple inheritance of behavior"
 * without Java ever running into the diamond problem.
 */
public interface Gradable {
    void grade(Student student, Project project, int score);
}
