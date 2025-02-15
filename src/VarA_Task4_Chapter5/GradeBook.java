package VarA_Task4_Chapter5;

import java.util.ArrayList;
import java.util.List;

class GradeBook {
    private String studentName;
    private String studentID;
    private List<Session> sessions;

    public GradeBook(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.sessions = new ArrayList<>();
    }

    public void addSession(String sessionName) {
        sessions.add(new Session(sessionName));
    }

    public void addExam(String sessionName, String subject, int grade) {
        for (Session session : sessions) {
            if (session.getSessionName().equals(sessionName)) {
                session.addExam(subject, grade);
                return;
            }
        }
        System.out.println("Сессия не найдена!");
    }

    public void addCredit(String sessionName, String subject, boolean passed) {
        for (Session session : sessions) {
            if (session.getSessionName().equals(sessionName)) {
                session.addCredit(subject, passed);
                return;
            }
        }
        System.out.println("Сессия не найдена!");
    }

    public void printGradeBook() {
        System.out.println("Зачетная книжка студента: " + studentName + " (ID: " + studentID + ")");
        for (Session session : sessions) {
            session.printSession();
        }
    }

    private class Session {
        private String sessionName;
        private List<Exam> exams;
        private List<Credit> credits;

        public Session(String sessionName) {
            this.sessionName = sessionName;
            this.exams = new ArrayList<>();
            this.credits = new ArrayList<>();
        }

        public String getSessionName() {
            return sessionName;
        }

        public void addExam(String subject, int grade) {
            exams.add(new Exam(subject, grade));
        }

        public void addCredit(String subject, boolean passed) {
            credits.add(new Credit(subject, passed));
        }

        public void printSession() {
            System.out.println("Сессия: " + sessionName);
            System.out.println("  Экзамены:");
            for (Exam exam : exams) {
                System.out.println("    " + exam);
            }
            System.out.println("  Зачеты:");
            for (Credit credit : credits) {
                System.out.println("    " + credit);
            }
        }
    }

    private class Exam {
        private String subject;
        private int grade;

        public Exam(String subject, int grade) {
            this.subject = subject;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return subject + " - Оценка: " + grade;
        }
    }

    private class Credit {
        private String subject;
        private boolean passed;

        public Credit(String subject, boolean passed) {
            this.subject = subject;
            this.passed = passed;
        }

        @Override
        public String toString() {
            return subject + " - " + (passed ? "Зачет" : "Не зачтено");
        }
    }

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook("Иван Петров", "12345");

        gradeBook.addSession("Зимняя сессия 2025");
        gradeBook.addExam("Зимняя сессия 2025", "Математика", 5);
        gradeBook.addCredit("Зимняя сессия 2025", "Физическая культура", true);

        gradeBook.addSession("Осенняя сессия 2025");
        gradeBook.addExam("Осенняя сессия 2025", "Физика", 4);
        gradeBook.addCredit("Осенняя сессия 2025", "История", true);

        gradeBook.printGradeBook();
    }
}
