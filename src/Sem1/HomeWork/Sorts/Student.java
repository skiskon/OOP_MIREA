package Sem1.HomeWork.Sorts;

/**
 * Created by skima on 18.11.2016.
 */
public class Student {
    private String name;
    private int age;
    private int generalScore;

    public Student(String name, int age, int generalScore) {
        this.name = name;
        this.age = age;
        this.generalScore = generalScore;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", generalScore=" + generalScore +
                '}';
    }

    public int getGeneralScore() {
        return generalScore;
    }

    public void setGeneralScore(int generalScore) {
        this.generalScore = generalScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
