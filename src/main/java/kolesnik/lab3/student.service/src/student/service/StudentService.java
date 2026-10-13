package student.service;

import student.model.Group;
import student.model.Student;
import student.model.University;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentService {

    // список всех студентов конкретного университета
    public List<Student> getStudentsByUniversity(University university) {
        return university.getGroups().stream()
                .flatMap(group -> group.getStudents().stream())
                .sorted(Comparator.comparing(Student::getFullName))
                .collect(Collectors.toList());
    }

    // студенты каждой группы
    public Map<Group, List<Student>> getStudentsByEachGroup(List<University> universities) {
        Map<Group, List<Student>> result = new LinkedHashMap<>();

        universities.stream()
                .flatMap(university -> university.getGroups().stream())
                .sorted(Comparator.comparing(Group::getName))
                .forEach(group -> result.put(group, new ArrayList<>(group.getStudents())));

        return result;
    }

    // студенты одной группы
    public List<Student> getStudentsByGroup(Group group) {
        return new ArrayList<>(group.getStudents());
    }
}