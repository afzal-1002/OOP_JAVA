import java.util.List;

/**
 * Enrollable is a contract, not a class: it says WHAT a type
 * can do (enroll in projects) without saying HOW. Any class,
 * related or not, can implement it.
 */
public interface Enrollable {
    void enroll(Project project);
    List<Project> getProjects();
}
