package home_work_1.taskcode.ru;

public class Triangle {
    private int a, b, c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isAlive() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        } else {
            return true;
        }
    }

    public void getTriangleType(boolean b) {
        if (!b) {
            System.out.println("Треугольник НЕ существует!");
        } else if (a != this.b && a != c && this.b != c) {
            System.out.println("Треугольник разносторонний");
        } else if (a == this.b && this.b == c) {
            System.out.println("Треугольник равносторонний");
        } else {
            System.out.println("Треугольник равнобедренный");
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setA(JaUtils.scanNums());
        triangle.setB(JaUtils.scanNums());
        triangle.setC(JaUtils.scanNums());
        triangle.getTriangleType(triangle.isAlive());
    }
}
