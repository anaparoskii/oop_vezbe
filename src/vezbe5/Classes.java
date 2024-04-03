package vezbe5;

public class Classes {
    private String code;
    private String className;
    private enum Semester {
        FIRST(1), SECOND(2), THIRD(3),
        FOURTH(4), FIFTH(5), SIXTH(6),
        SEVENTH(7), EIGHTH(8);

        int s;
        private Semester(int i) {
            this.s = i;
        }
    }
    
    public Classes(String code, String className) {
        this.code = code;
        this.className = className;
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

}
