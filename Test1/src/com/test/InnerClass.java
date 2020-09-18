package com.test;

public class InnerClass {

    private int defaultAge = 5;
    //局部变量 age，必须添加final关键字，这里先不加
    public void addAge(final  int age){

        //局部内部类
        class NewAge{
            private int getAge(){
                return age + defaultAge;
            }
        }

        NewAge newAge = new NewAge();
        System.out.print(newAge.getAge());
    }
}

