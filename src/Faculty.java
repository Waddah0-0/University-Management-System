import java.util.*;
public class Faculty extends User {
    private String department;
    private List<Course> coursesTeaching = new ArrayList<>();

    public Faculty(String userId, String username, String password, String name, String email, String contactInfo, String department) {
        super(userId, username, password, name, email, contactInfo);
        setDepartment(department);
    }

    public void assignGrade(Student s, Course c, double grade) {
        for (Enrollment enrollment : c.getEnrollments()) {
            if (enrollment.getStudent().equals(s)) {
                enrollment.setGrade(grade);
                enrollment.setStatus("Completed");
                System.out.println(" Student: " + s.getName() + ", Course: " + c.getTitle() + ", Grade: " + grade
                        + "Grade assigned successfully.");
                return;
            }
        }
        System.out.println("Student is not enrolled in this course.");

    }

    public void manageCourse(Course c) {
        if (coursesTeaching.contains(c)) {
            System.out.println("Faculty is already managing this course.");
        } else {
            coursesTeaching.add(c);
            System.out.println("Course added to faculty's teaching list.");
        }
    }

    public void removeCourse(Course c) {
        if (coursesTeaching.contains(c)) {
            coursesTeaching.remove(c);
            System.out.println("Course removed from faculty's teaching list.");
        } else {
            System.out.println("Faculty is not managing this course.");
        }
    }

    public int calculateWorkload() {
        return coursesTeaching.size();
    }

    public void viewWorkload() {
        System.out.println("Faculty workload: " + calculateWorkload() + " courses.");
    }

    public void setOfficeHours(String officeHours) {
        System.out.println("Office hours set to: " + officeHours);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
