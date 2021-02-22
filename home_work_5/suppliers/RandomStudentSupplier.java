package home_work_5.suppliers;

import collections.core.GlobalCounter;
import collections.core.random.api.IRandom;
import collections.dto.Student;

import java.util.function.Supplier;

public class RandomStudentSupplier implements Supplier<Student> {

    private final IRandom rnd;
    private final GlobalCounter counter;
    private final int nameLengthFrom;
    private final int nameLengthTo;

    public RandomStudentSupplier(GlobalCounter counter, IRandom rnd,
    int nameLengthFrom, int nameLengthTo) {
        this.rnd = rnd;
        this.counter = counter;
        this.nameLengthFrom = nameLengthFrom;
        this.nameLengthTo = nameLengthTo;
    }

//
//    public RandomStudentSupplier() {
//        this.rnd = new FakeRandom();
//    }

    @Override
    public Student get() {
        return new Student(
                this.counter.getAndInc(),
                this.rnd.randString(this.nameLengthFrom, this.nameLengthTo),
                this.rnd.randInt(7, 17),
                this.rnd.randDouble(0, 10),
                this.rnd.randBoolean()
        );
    }
}
