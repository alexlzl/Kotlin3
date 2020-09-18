package com.test;

public class S2 {

    public void outerDoSomething() {
         String localObj = "hello";
        class InnerClass {
            public void innerDoSomething() {
                String a = localObj;
                System.out.println(a);
            }
        }
        ;

        InnerClass innerObj = new InnerClass();
        innerObj.innerDoSomething();
    }

    public static void main(String[] args) {
        S2 s2 = new S2();
        s2.outerDoSomething();
    }
}
