package guru.qa;

public class Main {

    public static void main(String[] args) {
        // 0) Применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int int1 = 10;
        int int2 = 3;

        int sum = int1 + int2;
        int difference = int1 - int2;
        int product = int1 * int2;
        int quotient = int1 / int2;

        System.out.println("Сложение: " + int1 + " + " + int2 + " = " + sum);
        System.out.println("Вычитание: " + int1 + " - " + int2 + " = " + difference);
        System.out.println("Умножение: " + int1 + " * " + int2 + " = " + product);
        System.out.println("Деление: " + int1 + " / " + int2 + " = " + quotient);

        // 1) Применить несколько арифметических операций над int и double в одном выражении
        double double1 = 2.5;

        double sumMixed = int1 + double1;
        double differenceMixed = int1 - double1;
        double productMixed = int1 * double1;
        double quotientMixed = int1 / double1;

        System.out.println("Сложение: " + int1 + " + " + double1 + " = " + sumMixed);
        System.out.println("Вычитание: " + int1 + " - " + double1 + " = " + differenceMixed);
        System.out.println("Умножение: " + int1 + " * " + double1 + " = " + productMixed);
        System.out.println("Деление: " + int1 + " / " + double1 + " = " + quotientMixed);

        // 2) Применить несколько логических операций ( < , >, >=, <= )
        int a = 5;
        int b = 10;

        boolean lessThan = a < b;
        boolean greaterThan = a > b;
        boolean greaterThanOrEqual = a >= b;
        boolean lessThanOrEqual = a <= b;

        System.out.println("a < b: " + lessThan);
        System.out.println("a > b: " + greaterThan);
        System.out.println("a >= b: " + greaterThanOrEqual);
        System.out.println("a <= b: " + lessThanOrEqual);

        // 3) Прочитать про диапазоны типов данных для вещественных чисел с плавающей точкой
        // Диапазоны для float и double
        System.out.println("Float MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Float MIN_VALUE: " + Float.MIN_VALUE);
        System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);

        // 4) Получить переполнение при арифметической операции
        int maxInt = Integer.MAX_VALUE;
        int overflow = maxInt + 1;

        System.out.println("Integer MAX_VALUE: " + maxInt);
        System.out.println("Overflow value: " + overflow);
    }
}
