package home_work_5.suppliers;

import collections.dto.Student;

import java.util.function.Supplier;

public class FakeStudentSupplier implements Supplier<Student> {

    public FakeStudentSupplier() {
    }

    @Override
    public Student get() {
        return new Student(
                1,
                "sdasd",
                56,
                6,
                true
        );
    }
}
