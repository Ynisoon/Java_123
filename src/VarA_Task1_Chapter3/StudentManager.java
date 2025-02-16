package VarA_Task1_Chapter3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

        //Список студентов заданного факультета
    public void printStudentsByFaculty(String faculty) {
        System.out.println("Студенты факультета: " + faculty);
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                System.out.println(student);
            }
        }
    }

    //Список студентов для каждого факультета и курса
    public void printStudentsByFacultyAndCourse() {
        System.out.println("Студенты по факультетам и курсам:");

        for (Student student : students) {
            System.out.println("Факультет: " + student.getFaculty() + ", Курс: " + student.getCourse());
            System.out.println("  " + student);
        }
    }

    //список студентов, родившихся после заданного года
    public void printStudentsBornAfter(int year) {
        System.out.println("Студенты, родившиеся после " + year + " года:");
        for (Student student : students) {
            int birthYear = student.getBirthDate().getYear() + 1900;
            if (birthYear > year) {
                System.out.println(student);
            }
        }
    }
    // список студентов учебной группы
    public void printStudentsByGroup(String group) {
        System.out.println("Студенты группы " + group + ":");
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase(group)) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        StudentManager manager = new StudentManager();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        // Добавление студентов
        manager.addStudent(new Student(1, "Иванов", "Иван", "Иванович", sdf.parse("12.05.2002"), "Москва", "89001112233", "ИТ", 2, "Группа-1"));
        manager.addStudent(new Student(2, "Петров", "Петр", "Петрович", sdf.parse("23.07.2000"), "Санкт-Петербург", "89112223344", "Экономика", 3, "Группа-2"));
        manager.addStudent(new Student(3, "Сидоров", "Алексей", "Александрович", sdf.parse("15.09.2001"), "Казань", "89223334455", "ИТ", 2, "Группа-1"));
        manager.addStudent(new Student(4, "Кузнецов", "Максим", "Викторович", sdf.parse("10.01.1999"), "Екатеринбург", "89334445566", "Медицина", 4, "Группа-3"));

        // Вывод данных
        manager.printStudentsByFaculty("ИТ");
        manager.printStudentsByFacultyAndCourse();
        manager.printStudentsBornAfter(2000);
        manager.printStudentsByGroup("Группа-1");
    }
}




