package VarA_Task1_Chapter3;

import java.util.Date;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    // Конструкторы
    public Student(int id, String lastName, String firstName, String middleName, Date birthDate, String address,
                   String phone, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String lastName, String firstName, String faculty, int course, String group) {
        this(id, lastName, firstName, "", new Date(), "", "", faculty, course, group);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    @Override
    public String toString() {
        return "ID: " + id + ", " + lastName + " " + firstName + " " + middleName +
                ", Дата рождения: " + birthDate + ", Адрес: " + address +
                ", Телефон: " + phone + ", Факультет: " + faculty +
                ", Курс: " + course + ", Группа: " + group;
    }
}
