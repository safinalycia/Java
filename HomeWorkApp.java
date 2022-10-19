package Zadanie1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("_________________________________________");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println(a + b);
        if (c >= 0) {
        System.out.println("Сумма положительная");}
        else {
        System.out.println("Сумма отрицательная");}
        System.out.println("_________________________________________");
    }

    public static void printColor() {
     int value = 5;
     if (value <= 0) {
         System.out.println("Красный");
     }
     else if(value > 0 & value <= 100) {
         System.out.println("Желтый");
     }
     else if (value > 100) {
         System.out.println("Зеленый");
     }
        System.out.println("_________________________________________");
    }

    public static void compareNumbers() {
       int d = 5;
       int e = 6;
       if(d >= e) {
           System.out.println("d >= e"); }
       else if(d < e) {
               System.out.println("d < e");
           }
        System.out.println("_________________________________________");
       }
    }

