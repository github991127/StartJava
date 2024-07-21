package com.domain;

/**
 * ClassName: Mankind
 * Package: com.domain
 * Description:
 *
 * @Author: Jimbo
 * @Create: 2023/11/6 19:28
 */
public class Mankind {
    private int id;
    private String name;
    private double age;
    private String birthday;
    private String deathday;

    public Mankind() {
    }

    public Mankind(int id, String name, double age, String birthday, String deathday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.deathday = deathday;
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

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDeathday() {
        return deathday;
    }

    public void setDeathday(String deathday) {
        this.deathday = deathday;
    }
}
