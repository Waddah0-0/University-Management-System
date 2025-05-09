import java.time.LocalDate;
import java.util.*;

public class University {
    private List<User> users = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();
    private List<String> calendar = new ArrayList<>();

    public void addUser(User u) {
        users.add(u);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public User findUser(String id) {
        for (User u : users) {
            if (u.getUserId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public Course findCourse(String id) {
        for (Course c : courses) {
            if (c.getCourseId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public Department findDepartment(String id) {
        for (Department d : departments) {
            if (d.getDepartmentId().equals(id)) {
                return d;
            }
        }
        return null;
    }

    public List<String> getCalendar() {
        return new ArrayList<>(calendar);
    }

    public void addEvent(LocalDate date, String desc, String Event) {
        calendar.add(Event + ":" + date + ": " + desc);
    }

    public void removeEvent(LocalDate date, String desc, String Event) {
        calendar.remove(Event + date + ": " + desc);
    }
}
