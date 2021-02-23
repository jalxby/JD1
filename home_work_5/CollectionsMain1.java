package home_work_5;


import home_work_5.comparators.StudentAgeComparator;
import home_work_5.comparators.StudentNameComparator;
import home_work_5.comparators.StudentScoreComparator;
import home_work_5.core.GlobalCounter;
import home_work_5.core.random.Java8Random;
import home_work_5.core.random.api.IRandom;
import home_work_5.dto.Student;
import home_work_5.predicate.StudentAgeAndScorePredicate;
import home_work_5.suppliers.RandomStudentSupplier;
import home_work_5.utils.SortUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CollectionsMain1 {

    public static void printTop10(List<Student> filteredStudents) {
        for (int i = 0; i < 10; i++) {
            System.out.println(filteredStudents.get(i));
        }
    }

    public static void main(String[] args) {
        List<Student> data = new ArrayList<>();
        IRandom rnd = new Java8Random();
        GlobalCounter counter = new GlobalCounter();
        Supplier<Student> supplier = new RandomStudentSupplier(counter, rnd);
        StudentAgeAndScorePredicate predicate = new StudentAgeAndScorePredicate(12, 8);
        Comparator<Student> ScoreAgeComparator = new StudentAgeComparator().thenComparing(new StudentScoreComparator());
        do {
            data.add(supplier.get());
        } while (data.size() < 10_000);

        List<Student> filtered = new ArrayList<>();

        for (Student value : data) {
            if (predicate.test(value)) {
                filtered.add(value);
            }
        }

        /**
         * 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
         */
        SortUtils.bubbleSort(filtered, new StudentNameComparator());
        printTop10(filtered);


        /**
         * 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
         */
        System.out.println("--------------------------------------------------------------");
        SortUtils.bubbleSort(filtered, new StudentScoreComparator());
        printTop10(filtered);

        /**
         * 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
         */
        System.out.println("--------------------------------------------------------------");
        SortUtils.shakerSort(filtered, ScoreAgeComparator);
        Iterator iterator = filtered.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
