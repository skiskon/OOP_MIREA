package Sem1.HomeWork.Sorts;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by skima on 18.11.2016.
 * https://e.mail.ru/attachment/14794694380000000481/0;1
 */

public class Ex1 {
    public static void main(String[] args) {
        StudentsCreator creator = new StudentsCreator();
        Student[] stds = creator.Create(10);
        Arrays.sort(stds, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge())
                    return 1;
                else
                    return -1;
            }
        });
        for (Student std : stds) {
            System.out.println(std);
        }
    }
}
