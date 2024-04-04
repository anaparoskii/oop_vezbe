package vezbe5;

import java.util.HashMap;

public class ManageClasses {
    static HashMap<String, Classes> allClasses = new HashMap<>();

    public static void addClass() {
        Semester semester = Semester.SECOND;
        Classes newClass = new Classes("1001", "Object Oriented Programming", semester);
        allClasses.put(newClass.getCode(), newClass);
        System.out.println("New class added: " + newClass.getClassName());

    }

    public static void editClass() {
        String code = "1001";
        Classes classToEdit = allClasses.get(code);
        classToEdit.setClassName("Object Oriented Programming 1");
        System.out.println("Class edited: " + classToEdit.getClassName());
    }

    public static void deleteClass() {
        String code = "1001";
        Classes classToDelete = allClasses.get(code);
        classToDelete.setActivity(false);
    }

    public static void listAllClasses() {
        Status status = Status.BOTH;
        for (Classes c : allClasses.values()) {
            if (status.value == -1) {
                String className = c.getClassName();
                String classCode = c.getCode();
                String classSemester = String.valueOf(c.getSemester());
                System.out.printf("\nClass Name: %-30s\tClass Code: %-5s\tClass Semester: %-4s\n",
                        className, classCode, classSemester);
            }
            else if (status.activity == c.isActivity()) {
                String className = c.getClassName();
                String classCode = c.getCode();
                String classSemester = String.valueOf(c.getSemester());
                System.out.printf("\nClass Name: %-30s\tClass Code: %-5s\tClass Semester: %-4s\n",
                        className, classCode, classSemester);
            }
        }
    }

    public static void listChosenClass() {
        String code = "1001";
        Classes chosenClass = allClasses.get(code);
        String className = chosenClass.getClassName();
        String classSemester = String.valueOf(chosenClass.getSemester());
        System.out.printf("\nClass Name: %-30s\tClass Code: %-5s\tClass Semester: %-4s\n",
                className, code, classSemester);
    }

}
