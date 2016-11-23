package HomeWork.Sorts;

import java.util.Random;

/**
 * Created by skima on 18.11.2016.
 */
public class StudentsCreator {

    private static String[] names = new String[]{"Paul", "Max", "Mark", "Angelina", "Izabell", "Adolf", "Iosif", "Gans", "Maria"};
    private Random random;

    public StudentsCreator() {
        random = new Random();
    }

    public Student[] Create(int amount){
        Student[] students = new Student[amount];
        for (int i = 0; i < amount; i++){
            students[i] = new Student(getRandomName(), getRandomAge(), getRandomScore());
        }
        return students;
    }

    private String getRandomName(){
        return names[random.nextInt(names.length)];
    }
    private int getRandomAge(){
        return random.nextInt(10) + 18;
    }
    private int getRandomScore(){
        return random.nextInt(101);
    }
}
