import java.time.LocalDate;

public class Enrollment {
    private Student student;
    private Course  course;
    private LocalDate enrollmentDate;
    private Double  grade;
    private String  status;

    public Enrollment(Student s, Course c, LocalDate date) {
       setCourse(c);
       setStudent(s);
       setEnrollmentDate(date);
       setLocalDate(date);
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
