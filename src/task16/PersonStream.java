package task16;

public class PersonStream {
    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return "PersonStream{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonStream(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
