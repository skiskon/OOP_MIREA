package HomeWork.Sorts;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by skima on 18.11.2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        StudentsCreator creator = new StudentsCreator();
        Student[] stds = creator.Create(10);
        Arrays.sort(stds, new SortingStudentsByGPA());
        for (Student std : stds) {
            System.out.println(std);
        }
    }
}
