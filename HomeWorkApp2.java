package Zadanie2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        TrueOrFalse(5, 10);
        NumberStatus(0);
        NegativOrPozitiv(-15);
        Line();
    }
    //Написать метод, принимающий на вход два целых числа
    //и проверяющий, что их сумма лежит в пределах
    //от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static void TrueOrFalse(int a, int b) {
        int c = a + b;
        if (c > 10 && c <= 20) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
        System.out.println("..........................................");
    }

//Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль, положительное ли число передали
//или отрицательное. Замечание: ноль считаем положительным числом.
public static void NumberStatus(int d) {
    if (d >= 0) {
        System.out.println("Положительное");
    } else {
        System.out.println("Отрицательное");
    }
    System.out.println("..........................................");

}
  //Написать метод, которому в качестве параметра передается целое число.
  //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    private static void NegativOrPozitiv(int g) {
        if (g >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
        System.out.println("..........................................");
    }

    //Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз.
    private static void Line() {
        for (int i = 0; i < 5; i++) {
            System.out.print(17 + " ");
        }
    }
}
//Не могу никак сообразить с типом boolean, пробовала и метод отдельный создать для заданий
//с boolean, не отрабатывает код. Как в одном классе использовать несколько типов методов?