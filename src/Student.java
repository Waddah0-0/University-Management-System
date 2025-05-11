import java.time.LocalDate;
import java.util.*;

public class Student extends User {
    private LocalDate admissionDate;
    private String academicStatus;
    private List<Enrollment> enrollments = new ArrayList<>();
    private List<Course> attendanceCourses = new ArrayList<>();


    public Student(String userId, String username, String password, String name, String email, String contactInfo, LocalDate admissionDate, String academicStatus) {
        super(userId, username, password, name, email, contactInfo);
        setAdmissionDate(admissionDate);
        setAcademicStatus(academicStatus);
    }

    @Override
    public void displayUserMenu() {
        int choice=0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 7) {
            System.out.println("\n=== Student Menu ===");
            System.out.println("1. Register for Course");
            System.out.println("2. Drop Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. View Grades");
            System.out.println("5. Calculate GPA");
            System.out.println("6. Update Profile");
            System.out.println("7. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 7:
                    logout();
                    break;
                default:
                     System.out.println(" Invalid choice! ");
        }
    }}

    public void registerForCourse(Course c) {
        if (!c.isPrerequisiteMet(this)) {
            System.out.println(" Prerequisites not met");
            return;
        }
        if (!c.hasAvailableSeats()) {
            System.out.println("Course is full");
            return;
        }
        Enrollment e = new Enrollment(this, c, LocalDate.now()); // al localdate de lazem 3shan a3rf el date ely 3mlt feh el enrollment ( chatgpt 8al keda)
        enrollments.add(e);
        c.addEnrollment(e);
    }

    public void dropCourse(Course c) {
        enrollments.removeIf(enrollment-> enrollment.getCourse().equals(c));
        c.removeStudent(this);
    }

    public double calculateGPA() {
        double totalGradePoints = 0.0;
        int totalCreditHours = 0;
        for (Enrollment enrollment : enrollments) {
            Double grade = enrollment.getGrade();
            if (grade != null) {
                Course course = enrollment.getCourse();
                totalGradePoints += grade * course.getCreditHours();
                totalCreditHours += course.getCreditHours();
            }
        }
        return totalGradePoints / totalCreditHours;
    }

    public void viewGrades() {
        System.out.println("Grades:");
        for (Enrollment e : enrollments) {
            System.out.println("Course: " + e.getCourse().getTitle() + ", Grade: " + e.getGrade() );
        }
    }

    public void updateAttendance(Course c, int attendance) {
        if (attendanceCourses.contains(c)) {
            c.setAttendance(attendance);
            System.out.println("Attendance updated for course: " + c.getTitle());
        } else {
            attendanceCourses.add(c);
        }

    }

    public void viewAttendance() {
        System.out.println("Attendance Records:");
        for (Course c : attendanceCourses) {
            System.out.println("Course: " + c.getTitle() + ", Attendance: " + c.getAttendance() + "%");
        }
    }

    public void setAcademicStatus(String academicStatus) {
        this.academicStatus = academicStatus;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public String getAcademicStatus() {
        return academicStatus;
    }
}
