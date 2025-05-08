import java.util.*;

public class Faculty extends User {
    private String department;
    private List<Course> coursesTeaching = new ArrayList<>();

    public Faculty(String userId, String username, String password, String name, String email, String contactInfo, String department) {
        super(userId, username, password, name, email, contactInfo);
        this.department = department;
    }

    public void assignGrade(Student s, Course c, double grade) {
        // lesaaaaaaaaaaaaaaaaaaaaaaaa
    }

    public void manageCourse(Course c) {
        // lessa ma 3mltha
    }

    public void setOfficeHours(String officeHours) {
        // lesa lesaaaaaaa
    }
}
