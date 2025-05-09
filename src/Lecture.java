import java.util.List;

public class Lecture extends Course {
    private String lectureHall;

    public Lecture(String courseId, String title, String description, int creditHours, 
                  List<String> prerequisites, int maxCapacity, String lectureHall) {
        super(courseId, title, description, creditHours, prerequisites, maxCapacity);
        setLectureHall(lectureHall);
    }

    public void setLectureHall(String lectureHall) {
        this.lectureHall = lectureHall;
    }

    public String getLectureHall() {
        return lectureHall;
    }

    @Override
    public void conductClass() {
        System.out.println("lecture in " + lectureHall);
        System.out.println("Course: " + getTitle());
        String instructor = "";
        if (getInstructor() != null) {
            instructor = getInstructor().getName();
        } else {
            instructor = "Not assigned";
        }
        System.out.println("Instructor: " + instructor);
    }
} 