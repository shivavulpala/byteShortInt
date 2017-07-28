package com.shivahari;

public class Main {

    public static void main(String[] args) {
        byte x = 124;
        short y = 32111;
        int z = 1800;
        long a = 50000L + 10L * (x + y + z);
        short b = (short) (50000 + 10 * (x + y + z));
        System.out.println("long value of a = " + a);
        System.out.println(b);
    }
}
