package home_work_5;

import collections.core.GlobalCounter;
import collections.core.random.FakeRandom;
import collections.dto.Student;
import collections.suppliers.RandomStudentSupplier;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class CollectionsMain2 {
    public static void main(String[] args) {
        Set<Student> data = new HashSet<>();
        Supplier<Student> supplier = new RandomStudentSupplier(new GlobalCounter(), new FakeRandom(),
                3, 10);

//        Supplier<Student> supplier = new FakeStudentSupplier();

        for (int i = 0; i < 10_000; i++) {
            data.add(supplier.get());
        }

        System.out.println(data.size());
        System.out.println(data);
    }
}
