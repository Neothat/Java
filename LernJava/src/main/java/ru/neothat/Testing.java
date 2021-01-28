package ru.neothat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Testing {
    public static void start(Class c) {
        List <Method> methods = new ArrayList<>();
        Method[] classMethods = c.getDeclaredMethods();

        for (Method m : classMethods) {
            if (m.isAnnotationPresent(Test.class)) {
                methods.add(m);
            }
        }

        methods.sort(Comparator
                .comparingInt((Method i) -> i.getAnnotation(Test.class).priority())
                .reversed());

        for (Method m : classMethods) {
            if (m.isAnnotationPresent(BeforeSuit.class)) {
                if (methods.size() > 0 && methods.get(0).isAnnotationPresent(BeforeSuit.class)){
                    throw new RuntimeException("BeforeSuit используется больше одного раза");
                }
                methods.add(0, m);
            }
        }

        for (Method m : classMethods) {
            if (m.isAnnotationPresent(AfterSuit.class)) {
                if (methods.size() > 0 && methods.get(methods.size()-1).isAnnotationPresent(AfterSuit.class)){
                    throw new RuntimeException("AfterSuit используется больше одного раза");
                }
                methods.add(m);
            }
        }

        for (Method m : methods) {
            try {
                m.invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
