import java.util.*;

public class Department {
    private String departmentId;
    private String name;
    private List<Faculty> faculty = new ArrayList<>();
    private List<Course>  courses = new ArrayList<>();

    public Department(String departmentId, String name) {
        setDepartmentId(departmentId);
        setName(name);
    }

    public void addFaculty(Faculty f) {
        faculty.add(f);
    }
    public void addCourse(Course c)   {
        courses.add(c);
    }
    public List<Faculty> getFaculty() {
        return faculty;
    }
    public List<Course>  getCourses() {
        return courses;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

}
