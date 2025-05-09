import java.util.List;

public class Lab extends Course {
    private String labRoom;
    

    public Lab(String courseId, String title, String description, int creditHours, 
              List<String> prerequisites, int maxCapacity, String labRoom) {
        super(courseId, title, description, creditHours, prerequisites, maxCapacity);
        setLabRoom(labRoom);
    }

    public void setLabRoom(String labRoom) {
        this.labRoom = labRoom;
    }

    public String getLabRoom() {
        return labRoom;
    }

    @Override
    public void conductClass() {
        System.out.println("lab session in " + labRoom);
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