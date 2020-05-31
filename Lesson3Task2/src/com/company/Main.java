package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TextContainer tc = new TextContainer();
        Class<?> cls = tc.getClass();
        Method[] ms = cls.getMethods();

        for (Method m : ms) {
            if (m.isAnnotationPresent(Saver.class)) {
                SaveTo an = cls.getAnnotation(SaveTo.class);
                m.invoke(tc, an.path());
            }
        }
    }
}


