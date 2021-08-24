package ru.rybakov.nikolay;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Casino casino = new Casino();

        //получаем все методы класса Casino
        Method[] methods = casino.getClass().getMethods();
        //Перебираем методы и проверяем есть ли над ними аннотация @MyAnnotation
        //если есть, то выводим название аттрибута на консоль (это и есть наше название игры)
        for (Method method : methods) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            if (annotation != null) {
                try {
                    System.out.print(annotation.name());
                    method.invoke(casino);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
