import java.util.List;

public class Seminar extends Course {
    private String meetingRoom;
    private String Topic;

    public Seminar(String courseId, String title, String description, int creditHours, 
                  List<String> prerequisites, int maxCapacity, String meetingRoom, String Topic) {
        super(courseId, title, description, creditHours, prerequisites, maxCapacity);
        setMeetingRoom(meetingRoom);
        setTopic(Topic);
    }

    public void setMeetingRoom(String meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public String getMeetingRoom() {
        return meetingRoom;
    }

    public String getTopic() {
        return Topic;
    }

    @Override
    public void conductClass() {
        System.out.println("seminar in " + meetingRoom);
        System.out.println("Course: " + getTitle());
        System.out.println(" Topic: " + Topic);
        String instructor = "";
        if (getInstructor() != null) {
            instructor = getInstructor().getName();
        } else {
            instructor = "Not assigned";
        }
        System.out.println("Instructor: " + instructor);
    }
} 