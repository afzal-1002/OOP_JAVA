/**
 * A simple encapsulated value object: the title can only be read,
 * never changed from outside, because it is private and final.
 */
public class Project {
    private final String title;

    public Project(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
