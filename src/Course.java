import java.util.*;

public abstract class Course {
    private int maxCapacity;
    private int creditHours;
    private int attendance;
    private String courseId;
    private String title;
    private String description;
    private List<String> prerequisites;
    private List<Enrollment> enrollments = new ArrayList<>();
    private List<String> assignments = new ArrayList<>();
    private List<String> materials = new ArrayList<>();
    private Faculty instructor;
    private Faculty faculty;
    private String schedule;

    public Course(String courseId, String title, String description, int creditHours, List<String> prerequisites, int maxCapacity) {
       setCourseId(courseId);
        setTitle(title);
        setDescription(description);
        setCreditHours(creditHours);
        setPrerequisites(prerequisites);
        setMaxCapacity(maxCapacity);
    }

    public void updateCourseDetails(String title, String description, int creditHours, int maxCapacity) {
        setTitle(title);
        setDescription(description);
        setCreditHours(creditHours);
        setMaxCapacity(maxCapacity);
        System.out.println("Course details updated successfully.");
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
        enrollments.removeIf(enrollment -> enrollment.getStudent().equals(s));
    }

    public void addAssignment(String assignment) {
        assignments.add(assignment);
        System.out.println("Assignment added: " + assignment);
    }

    public void addMaterial(String material) {
        materials.add(material);
        System.out.println("Material added: " + material);
    }
    public void removeAssignment(String assignment) {
        assignments.remove(assignment);
        System.out.println("Assignment removed: " + assignment);
    }

    public void removeMaterial(String material) {
        materials.remove(material);
        System.out.println("Material removed: " + material);
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
        System.out.println("Schedule set to: " + schedule);
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

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public void setInstructor(Faculty instructor) {
        this.instructor = instructor;
    }

    public void setAssignments(List<String> assignments) {
        this.assignments = assignments;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public String getCourseId() {

        return courseId;
    }

    public List<String> getAssignments() {
        return assignments;
    }

    public List<String> getMaterials() {
        return materials;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public String getTitle() {
        return title;
    }

    public String getSchedule() {
        return schedule;
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
        return (creditHours + " credit hours");

    }

    public void setPrerequisites(List<String> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public abstract void conductClass(); // 3shan fe classes be3mlha override zay el lab w el lecture wa keda
}