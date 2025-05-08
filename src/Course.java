import java.util.*;

public abstract class Course {
    private int maxCapacity;
    private int creditHours;
    private String courseId;
    private String title;
    private String description;
    private List<String> prerequisites;
    private List<Enrollment> enrollments = new ArrayList<>();
    private Faculty instructor;

    public Course(String courseId, String title, String description, int creditHours, List<String> prerequisites, int maxCapacity) {
       setCourseId(courseId);
        setTitle(title);
        setDescription(description);
        setCreditHours(creditHours);
        setPrerequisites(prerequisites);
        setMaxCapacity(maxCapacity);
    }

    public boolean hasAvailableSeats() {
        return (enrollments.size() < maxCapacity);
    }

    public boolean isPrerequisiteMet(Student s) {
        if (prerequisites == null || prerequisites.isEmpty()) {
            return true;
        }
        return false;
    }

    public void addEnrollment(Enrollment e) {
        enrollments.add(e);
    }

    public void removeStudent(Student s) {
        // lesa ma 3mltha
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public void setInstructor(Faculty instructor) {
        this.instructor = instructor;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseId() {

        return courseId;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public String getTitle() {
        return title;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public String getDescription() {
        return description;
    }

    public String getCreditHours() {
        return creditHours + " credit hours";

    }

    public void setPrerequisites(List<String> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public abstract void conductClass(); // 3shan fe classes be3mlha override zay el lab w el lecture wa keda
}