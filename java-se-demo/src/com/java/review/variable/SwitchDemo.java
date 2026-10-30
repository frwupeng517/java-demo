package com.java.review.variable;

public class SwitchDemo {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
            case 2:
                System.out.println("Selected 2");
            case 3:
                System.out.println("Selected 3");
            default:
                System.out.println("Selected other");
        }
//        当option = 2时，将依次输出"Selected 2"、"Selected 3"、"Selected other"，
//        原因是从匹配到case 2开始，后续语句将全部执行，直到遇到break语句。因此，任何时候都不要忘记写break

//        Selected 2
//        Selected 3
//        Selected other
    }
}
