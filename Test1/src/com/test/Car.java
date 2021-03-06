package com.test;

public class Car {

    private int batch;

    public Car(int batch) {
        this.batch = batch;
    }

    /**
     * 自反性->c1.equals(c1)：true
     * 对称性：
     * true
     * true
     * 传递性：
     * true
     * true
     * true
     * 一致性：
     * equals方法遵守一致性！
     * 与null比较：
     * false
     *
     * @param args
     */
    public static void main(String[] args) {
        Car c1 = new Car(1);
        Car c2 = new Car(1);
        Car c3 = new Car(1);
        System.out.println("自反性->c1.equals(c1)：" + c1.equals(c1));
        System.out.println("对称性：");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        System.out.println("传递性：");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c1.equals(c3));
        System.out.println("一致性：");
        for (int i = 0; i < 50; i++) {
            if (c1.equals(c2) != c1.equals(c2)) {
                System.out.println("equals方法没有遵守一致性！");
                break;
            }
        }
        System.out.println("equals方法遵守一致性！");
        System.out.println("与null比较：");
        System.out.println(c1.equals(null));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car) obj;
            return batch == c.batch;
        }
        return false;
    }

}
