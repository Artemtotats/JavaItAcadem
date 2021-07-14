package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Start {
    public static void main(String[] args) {

        Student student1 = new Student("Bob", "cs", 1, 3, 10, 1);


        Student student2 = new Student("Sab", "cs", 2, 1, 1, 1);


        Student student3 = new Student("Lab", "cs", 3, 5, 4, 6);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        List<Student> studentsNewCours = new ArrayList<>();

        for (Student student : students) {
            int Average = ((student.getHistory() + student.getMathematics() + student.getPhysics()) / 3);
            if (Average > 3) {
                //         students.getCours() = student.getCours() + 1;

                studentsNewCours.add(student);
            }
        }

        System.out.println(students);
        System.out.println(studentsNewCours);
        student1.printStudents(studentsNewCours, 2);
        student2.printStudents(studentsNewCours, 2);
        student3.printStudents(studentsNewCours, 2);

        Map<String, Pet> hashMap = new HashMap<>();
        hashMap.put("Кот", new Cat("Bob", 3));
        hashMap.put("Собака", new Dog("Sam", 5));
        hashMap.put("Попугай", new Parrot("Gena", 6));
        System.out.println(hashMap);
        Pet cat = hashMap.get("Кот");
        System.out.println(cat);
        System.out.println(hashMap.containsKey("Собака"));
        System.out.println(hashMap.containsValue(cat));
        Pet dog = hashMap.get("Собака");
        System.out.println(dog);
    }
}