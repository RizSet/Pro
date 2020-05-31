package com.company;

class Test{
    @MyAnatation(a = 1, b = 2)
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
}
