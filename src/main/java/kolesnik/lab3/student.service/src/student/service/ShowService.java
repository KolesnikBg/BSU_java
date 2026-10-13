package student.service;


import student.model.Group;
import student.model.Student;

import java.util.List;
import java.util.Map;

/**
 * Вывод информации о студентах
 */
public class ShowService {

    public void showStudents(String title, List<Student> students) {
        System.out.println(title);

        if (students.isEmpty()) {
            System.out.println("Студентов нет.");
        } else {
            for (Student student : students) {
                System.out.println(" - " + student);
            }
        }

        System.out.println();
    }

    public void showStudentsByGroups(Map<Group, List<Student>> studentsByGroups) {
        studentsByGroups.forEach((group, students) -> {
            System.out.println("Группа: " + group.getName()
                    + " (" + group.getUniversity().getName() + ")");

            if (students.isEmpty()) {
                System.out.println("Студентов нет.");
            } else {
                for (Student student : students) {
                    System.out.println(" - " + student);
                }
            }

            System.out.println();
        });
    }
}