public class StudentRecord {
    private final String name;
    private final int age;
    private final String college;

    public StudentRecord(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public String getCollege() {return college;}
}

// public record StudentRecord(String name, int age, String college) {}
