package student.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Хранит список групп
 */
public class University {
    private final String name;
    private final List<Group> groups = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return Collections.unmodifiableList(groups);
    }

    void addGroup(Group group) {
        groups.add(group);
    }
}
