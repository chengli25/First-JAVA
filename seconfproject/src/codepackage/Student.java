package codepackage;
import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 */
public class Student {
    private String name;
    private String id;
    public Set<Course> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }

    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }
}
