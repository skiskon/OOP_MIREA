package Sem1.HomeWork.Sorts;

import java.util.Comparator;

/**
 * Created by skima on 18.11.2016.
 */
public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if (s1.getGeneralScore() > s2.getGeneralScore())
            return 1;
        else
            return -1;
    }
}
