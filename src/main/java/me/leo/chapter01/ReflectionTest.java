package me.leo.chapter01;

import me.whiteship.chapter01.item01.HelloService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<?> aClass = Class.forName("me.whiteship.hello.ChineseHelloService");
        Constructor<?> constructor = aClass.getConstructor();
        HelloService helloService = (HelloService) constructor.newInstance();
        System.out.println("helloService = " + helloService);
    }
}
