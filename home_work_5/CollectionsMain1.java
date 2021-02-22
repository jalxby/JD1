package home_work_5;

import collections.comparators.StudentNameComparator;
import collections.core.GlobalCounter;
import collections.core.random.FakeRandom;
import collections.dto.Student;
import collections.predicate.StudentAgeAndScorePredicate;
import collections.suppliers.RandomStudentSupplier;

import home_work_5.utils.SortUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CollectionsMain1 {
    public static void main(String[] args) {

        Supplier<Student> supplier1 = new RandomStudentSupplier(new GlobalCounter(), new FakeRandom(),
                3, 10);
        Predicate<Student> predicate = new StudentAgeAndScorePredicate(12, 3);
        StudentNameComparator studentNameComparator = new StudentNameComparator();

        flow(supplier1, predicate, studentNameComparator);

        flow(supplier1, predicate, studentNameComparator);
    }

    public static <T> void flow(Supplier<T> supplier, Predicate<T> predicate,
                            Comparator<T> comparator1){

        List<T> data = new ArrayList<>();

        do {
            data.add(supplier.get());
        } while (data.size() < 10_000);

        List<T> filtered = new ArrayList<>();

        for (T value : data) {
            if(predicate.test(value)){
                filtered.add(value);
            }
        }

        /**
         * 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
         */
        SortUtils.bubbleSort(filtered, comparator1);


        /**
         * 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
         */

        /**
         * 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
         */

    }
}
