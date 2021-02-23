package home_work_5.suppliers;



import home_work_5.core.GlobalCounter;
import home_work_5.core.random.api.IRandom;
import home_work_5.dto.Student;

import java.util.function.Supplier;

public class RandomStudentSupplier implements Supplier<Student> {

    private final IRandom rnd;
    private final GlobalCounter counter;


    public RandomStudentSupplier(GlobalCounter counter, IRandom rnd) {
        this.rnd = rnd;
        this.counter = counter;

    }

//
//    public RandomStudentSupplier() {
//        this.rnd = new FakeRandom();
//    }

    @Override
    public Student get() {
        return new Student(
                this.counter.getAndInc(),
                this.rnd.randString(3, 10),
                this.rnd.randInt(7, 17),
                this.rnd.randDouble(0, 10),
                this.rnd.randBoolean()
        );
    }
}
