import java.util.*;

public class AdminStaff extends User {
    private String department;
    private String staffId;
    private String role;
    private List<Student> registeredStudents = new ArrayList<>();
    private List<Course> availableCourses = new ArrayList<>();

    public AdminStaff(String userId, String username, String password,
                      String name, String email, String contactInfo,
                      String department, String role, String staffId) {
        super(userId, username, password, name, email, contactInfo);
        setDepartment(department);
        setRole(role);
        setStaffId(staffId);
    }

    public void registerStudent(Student s) {
        if (registeredStudents.contains(s)) {
            System.out.println("Student " + s.getName() + " is already registered.");
        } else {
            registeredStudents.add(s);
            System.out.println("Student " + s.getName() + " registered successfully.");
        }
    }

    public void createCourse(Course c) {
        if (availableCourses.contains(c)) {
            System.out.println("Course " + c.getTitle() + " already exists.");
        } else {
            availableCourses.add(c);
            System.out.println("Course " + c.getTitle() + " created successfully.");
        }
    }

    public void assignFaculty(Course c, Faculty f) {
        if (availableCourses.contains(c)) {
            c.setFaculty(f);
            System.out.println("Faculty " + f.getName() + " assigned to course " + c.getTitle() + ".");
        } else {
            System.out.println("Course " + c.getTitle() + " does not exist.");
        }
    }

    public void generateReport() {
        System.out.println("Admin Staff Report:");
        System.out.println("Registered Students:");
        for (Student s : registeredStudents) {
            System.out.println("- " + s.getName()); // a7san n3mel for loop 3shan n3mel ar8am men 1 l 7ta el 7ad
        }
        System.out.println("Available Courses:");
        for (Course c : availableCourses) {
            System.out.println("- " + c.getTitle()); // a7san n3mel for loop 3shan n3mel ar8am brdo
        }
    }

    public void setStaffId (String staffId) {
        this.staffId = staffId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getdepartment() {
        return department;
    }

    public String getStaffId() {
        return staffId;
    }
}
