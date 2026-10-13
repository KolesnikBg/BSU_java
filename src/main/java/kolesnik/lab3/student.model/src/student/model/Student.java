package student.model;

/**
 * Студент при создании автоматом добавляется в группу
 */
public class Student {

    private final String fullName;
    private final Group group;
    private final int course;

    public Student(String fullName, Group group, int course) {
        this.fullName = fullName;
        this.group = group;
        this.course = course;
        group.addStudent(this);
    }

    public String getFullName() {
        return fullName;
    }

    public Group getGroup() {
        return group;
    }

    public University getUniversity() {
        return group.getUniversity();
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return fullName + " (" + group.getName() + ", курс " + course + ")";
    }
}