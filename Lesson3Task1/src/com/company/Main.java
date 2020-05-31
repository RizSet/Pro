package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> cls = Test.class;
        Method[] method = cls.getDeclaredMethods();
        for (Method m : method) {
            if (m.isAnnotationPresent(MyAnatation.class)) {
                MyAnatation an = m.getAnnotation(MyAnatation.class);
                m.invoke(null, an.a(), an.b());
            }
        }
    }
}
