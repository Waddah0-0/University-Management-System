public class AcademicDepartment extends Department {
    private String researchArea;
    private int numOfProg;

    public AcademicDepartment(String departmentId, String name) {
        super(departmentId, name);
        this.numOfProg = 0;
    }

    public void addResearchArea(String area) {
        this.researchArea = area;
    }

    public void addProgram() {
        this.numOfProg++;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public int getnumOfProg() {
        return numOfProg;
    }

} 