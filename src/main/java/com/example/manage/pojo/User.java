package com.example.manage.pojo;
import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private String passworld;

    public User(int id, String name, String passworld) {
        this.id = id;
        this.name = name;
        this.passworld = passworld;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passworld='" + passworld + '\'' +
                '}';
    }
}
