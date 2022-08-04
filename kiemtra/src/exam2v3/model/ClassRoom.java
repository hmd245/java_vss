package exam2v3.model;

public class ClassRoom {
    // property
    public static int id = 0;
    private int idClass;
    private String className;
    private String teachName;

    // constructor


    public ClassRoom() {
    }

    public ClassRoom(String className, String teachName) {
        id++;
        this.idClass = id;
        this.className = className;
        this.teachName = teachName;
        // System.out.println("id class: " + idClass);
    }

    // getters, setters
    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "className='" + className + '\'' +
                ", teachName='" + teachName + '\'' +
                '}';
    }
}
