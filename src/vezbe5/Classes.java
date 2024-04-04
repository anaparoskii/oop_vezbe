package vezbe5;

public class Classes {
    private String code;
    private String className;
    private Semester semester;
    private Professor professor;
    private boolean activity = true;

    public Classes() {}
    
    public Classes(String code, String className, Semester semester) {
        this.code = code;
        this.className = className;
        this.semester = semester;
    }

    public Classes(Professor professor) {
        this.professor = professor;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

}
