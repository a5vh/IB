package LinkedList;

import java.util.LinkedList;

public class StudentEmail {

    public static final String EMAIL_STUB = "@my.email";
    private String name;
    private String id;


    public StudentEmail() {
        name = " ";
        id = " ";
    }

    public StudentEmail(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return id + "\t" + name + "\t" + id +  EMAIL_STUB;
    }
}
