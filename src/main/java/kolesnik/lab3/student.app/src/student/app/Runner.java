package student.app;

import student.model.Group;
import student.model.Student;
import student.model.University;
import student.service.ShowService;
import student.service.StudentService;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        University university = new University("БГТУ");

        Group group1 = new Group("ИТ", university);
        Group group2 = new Group("ПИ", university);

        new Student("Иванов Иван Иванович", group1, 2);
        new Student("Петров Петр Петрович", group1, 2);
        new Student("Сидорова Анна Сергеевна", group2, 3);
        new Student("Козлов Дмитрий Михайлович", group2, 3);

        StudentService studentService = new StudentService();
        ShowService showService = new ShowService();

        // Студенты одного университета
        showService.showStudents(
                "Студенты университета " + university.getName(),
                studentService.getStudentsByUniversity(university)
        );

        // Студенты по каждой группе
        showService.showStudentsByGroups(
                studentService.getStudentsByEachGroup(List.of(university))
        );

        // Студенты одной конкретной группы
        showService.showStudents(
                "Студенты группы " + group1.getName(),
                studentService.getStudentsByGroup(group1)
        );
    }
}
