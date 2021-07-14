package list;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int cours;
    private  int history;
    private int  mathematics;
    private  int physics;



    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public Student(String name, String group, int cours, int history, int mathematics, int physics) {
        this.name = name;
        this.group = group;
        this.cours = cours;
        this.history = history;
        this.mathematics = mathematics;
        this.physics = physics;
    }
public   void printStudents(List<Student> studentsNewCours,  int newCours){
        if (newCours==getCours()) {
            System.out.println(this.name + " курс: " + (getCours() + 1));
        }
        else {
            System.out.println(this.name + " курс: " + (getCours() + 0));
        }
}
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", cours=" + cours +
                ", history=" + history +
                ", mathematics=" + mathematics +
                ", physics=" + physics +
                '}';
    }


}

