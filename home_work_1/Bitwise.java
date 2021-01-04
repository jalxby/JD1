package home_work_1;

public class Bitwise {
    public static void main(String[] args) {
        byte a = 42;
        byte b = 15;
        byte x = -42;
        byte z = -15;

        System.out.println(~a); // a = 101010   ~a = 11010101
        System.out.println(~b); // b = 1111     ~b = 11110000
        System.out.println(~x); // x = 11010110 ~x = 101001
        System.out.println(~z); // z = 11110001 ~z = 1110

        System.out.println(a & b); // a = 101010 b = 1111 (a & b) = 1010
        System.out.println(x & z); // x = 11010110 z = 11110001 (x & z) = 11010000

        System.out.println(a &= b); // a = 101010 b = 1111 (a &= b) = 1010
        System.out.println(x &= z); // x = 11010110 z = 11110001 (x &= z) = 11010000

        a = 42;
        x = -42;


        System.out.println(a | b); // a = 101010 b = 1111 (a | b) = 101111
        System.out.println(x | z); // x = 11010110 z = 11110001 (x | z) = 11110111

        System.out.println(a |= b); // a = 101010 b = 1111 (a |= b) = 101111
        System.out.println(x |= z); // x = 11010110 z = 11110001 (x |= z) = 11110111

        a = 42;
        x = -42;

        System.out.println(a ^ b); // a = 101010 b = 1111 (a ^ b) = 100101
        System.out.println(x ^ z); // x = 11010110 z = 11110001 (x ^ z) = 100111

        System.out.println(a ^= b); // a = 101010 b = 1111 (a ^ b) = 100101
        System.out.println(x ^= z); // x = 11010110 z = 11110001 (x ^ z) = 100111

        a = 42;
        x = -42;


        System.out.println(a >> 4); // a = 101010 (a >> 4) = 0010
        System.out.println(b >> 3); // b = 1111 (b >> 3) = 0001
        System.out.println(x >> 4); // x = 11010110 (x >> 4) = 11111101
        System.out.println(z >> 4); // z = 11110001 (z >> 4) = 11111111

        System.out.println(a >>= 2); // a = 101010 (a >>= 2) = 1010
        System.out.println(b >>= 2); // b = 1111 (b >>= 2) = 0011
        System.out.println(x >>= 2); // x = 11010110 (x >>= 2) = 11110101
        System.out.println(z >>= 2); // z = 11110001 (z >>= 2 ) = 11111100

        a = 42;
        b = 15;
        x = -42;
        z = -15;

        System.out.println(a >>> 3); // a = 101010 (a >>> 3) = 0101
        System.out.println(b >>> 3); // b = 1111   (b >>> 3) = 0001
        System.out.println(x >>> 3); // x = 11010110 (x >>> 3) = 11111111111111111111111111010
        System.out.println(z >>> 3); // z = 11110001 (z >>> 3) = 11111111111111111111111111110

        System.out.println(a << 4); // a = 101010 (a << 4) = 1010100000
        System.out.println(b << 4); // b = 1111 (b << 4) = 1111110101100000
        System.out.println(x << 4); // x = 11010110 (x << 4) = 1111110101100000
        System.out.println(z << 4); // z = 11110001 (z << 4) = 1111111100010000

        System.out.println(a <<= 2); // a = 101010 (a <<= 2) = 10101000
        System.out.println(b <<= 2); // b = 1111 (b <<= 2) = 111100
        System.out.println(x <<= 2); // x = 11010110 (x <<= 2) = 101 1000
        System.out.println(z <<= 2); // z = 11110001 (z <<= 2) = 11000100

        a = 42;
        b = 15;
        x = -42;
        z = -15;

        System.out.println(a >>>= 3); // a = 101010 (a >>> 3) = 0101
        System.out.println(b >>>= 3); // b = 1111   (b >>> 3) = 0001
        int s = x;
        int y = z;
        s >>>= 3;
        y >>>= 3;
        System.out.println(s); // s = 11111111111111111111111111010
        System.out.println(y); // y = 11111111111111111111111111110

        float fl = 42.5F;
        //System.out.println(fl <<= 2.2F); //побитовые операторы применимы только к целочисленным типам
        // java: bad operand types for binary operator '<<'


    }

}

