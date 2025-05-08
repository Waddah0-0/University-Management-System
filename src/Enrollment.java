import java.time.LocalDate;
import java.util.*;
public class Enrollment {
    private Student student;
    private Course  course;
    private LocalDate enrollmentDate;
    private Double  grade;
    private String  status;
    private int maxCapacity = 7;// Example capacity
    private List<Enrollment> enrollments = new ArrayList<>();
    public Enrollment(Student s, Course c, LocalDate enrollmentDate) {
       setCourse(c);
       setStudent(s);
       setEnrollmentDate(enrollmentDate);
    }
    public void addEnrollment(Enrollment e) {
        if (enrollments.size() < maxCapacity) {
            enrollments.add(e);
            System.out.println("Enrollment successful.");
        } else {
            System.out.println("Enrollment failed: Course is full.");
        }
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLocalDate(LocalDate date) {
        this.enrollmentDate = date;
    }

    public Course getCourse() {
        return course;
    }

    public Double getGrade() {
        return grade;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getLocalDate() {
        return enrollmentDate.toString();
    }

    public String getStatus() {
        return status;
    }

    public Student getStudent() {
        return student;
    }


}
