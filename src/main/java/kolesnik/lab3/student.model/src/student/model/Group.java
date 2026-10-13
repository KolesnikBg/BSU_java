package student.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Группа при создании автоматически присваивается унику
 */
public class Group {

    private final String name;
    private final University university;
    private final List<Student> students = new ArrayList<>();

    public Group(String name, University university) {
        this.name = name;
        this.university = university;
        university.addGroup(this); // группа к вузу
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    void addStudent(Student student) {
        students.add(student);
    }
}
