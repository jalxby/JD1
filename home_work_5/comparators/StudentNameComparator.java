package home_work_5.comparators;

import collections.dto.Student;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.compareTo(o2);
//    }
}
