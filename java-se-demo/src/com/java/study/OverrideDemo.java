package com.java.study;

public class OverrideDemo {
    public static void main(String[] args) {

        Income[] incomes = new Income[]{
                new Income(3000),
                new Income(8000),
                new Income(20000)
        };
        System.out.println(getTotalTax(incomes));
    }

    public static double getTotalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total += income.getTax();
        }
        return total;
    }
}

class Income {
    protected double salary;

    public Income(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return salary * 0.1; // 税率10%
    }
}

class Salary extends Income {
    public Salary(double salary) {
        super(salary);
    }

    @Override
    public double getTax() {
        if (salary < 5000) {
            return 0;
        }
        return (salary - 5000) * 0.2;
    }
}

class SpecialSalary extends Income {
    public SpecialSalary(double salary) {
        super(salary);
    }

    @Override
    public double getTax() {
        return 0;
    }
}