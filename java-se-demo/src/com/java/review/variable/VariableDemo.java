package com.java.review.variable;

public class VariableDemo {
    public static void main(String[] args) {
//        printDemo();
//        Test2();
//        Test3();
//        System.out.println( Test4(98)); // A
//        System.out.println(Test4Swtich(65)); // D
        Test5();
    }

    public static void printDemo() {
        int a = 10;
        int b = 3;

        double c = a / b;
        double d = (double) a / b;

        // a、b都是int，整数除法10/3=3，再赋值给double -> c
        System.out.println("c =" + c); // c =3.0
        // int类型的a先转给double类型，10.0 / 3 = 3.33......
        System.out.println("d =" + d); // d =3.3333333333333335

        System.out.println("-------------------------");

        // 在 Java中单引号'c'是char（字符），char本质上是整数，c的ASCII码是99，所以最终是99 + 3.0 = 102.0
        System.out.println('c' + c); // 102.0
        // 'd' 的 ASCII 码是 100
        System.out.println('d' + d); // 103.33333333333333
    }

    /**
     * 运算符与自增
     */
    public static void Test2() {
        int i = 5;
        int j = i++ + ++i;

        // i++，后++，返回旧值，先运算后自增；先取值5参与计算，然后i自增1变为6
        // ++i，前++，返回新值，先自增后运算；先将i变为7，再取值7参与运算
        System.out.println("i =" + i); // i =7
        System.out.println("j =" + j); // j =12
    }

    /**
     * 三元运算符与类型提升
     */
    public static void Test3() {
        int x = 10;
        Object obj = true ? x : "hello";
        // int 和 String类型不一样，编译器会将结果类型提升为两者的公共父类型Object
        // 所以，x被自动装箱为Integer再赋给Object，输出10
        System.out.println(obj); // 10

        Integer y = 5;
        int z = true ? y : 0;
        // Integer和int混合，会发生自动拆箱，结果类型为int；
        // 若y为null，此处会抛 NullPointerException
        System.out.println(z); // 5
    }

    /**
     * 流程控制 if/else 与 switch
     */
    public static char Test4(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static char Test4Swtich(int score) {
        switch (score/10) {
            case 9:
            case 10:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'E';
        }
    }

    /**
     * 循环与break/continue
     */
    public static void Test5() {
        int count = 0;
        for (int i = 1;  i <= 100; i++) {
            if (i % 3 > 0 || i % 5 == 0) {
//                break;
                continue;
            }
            System.out.print(i + "\t");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
