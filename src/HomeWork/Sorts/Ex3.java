package HomeWork.Sorts;

import java.util.Arrays;

/**
 * Created by skima on 18.11.2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        StudentsCreator creator = new StudentsCreator();
        Student[] stds = merge(creator.Create(5), creator.Create(10));
        for (Student std : stds) {
            System.out.println(std);
        }
    }

    public static  Student[] merge(Student[] list1, Student[] list2){
        Student[] newList = new Student[list1.length + list2.length];
        int i = 0;
        for (int j = 0; j < list1.length; j++)
            newList[i++] = list1[j];

        for (int j = 0; j < list2.length; j++)
            newList[i++] = list2[j];

        Arrays.sort(newList, new SortingStudentsByGPA());
        return newList;
    }
}
