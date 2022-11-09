package Zadanie3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {


        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        int[] inverttArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
//        for(int i = 0; i < inverttArray.length; i++){
//            System.out.print (i + "-" + inverttArray[i]+" ");
//        }
//        System.out.println("");
//        for(int i = 0; i < inverttArray.length; i++)
//            if(inverttArray[i] == 1) {
//                inverttArray[i] = 0;
//            }else inverttArray[i] = 1;
//        for(int i = 0; i < inverttArray.length; i++){
//            System.out.print (i + "-" + inverttArray[i]+" ");
//        }
        //2. Задать пустой целочисленный массив длиной 100.
        //С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//        int[]fillArray = new int[100];
//        fillArray[0] = 0;
//        for (int i = 1; i <= fillArray.length; i++){
//            System.out.print(i + " ");
//        }


        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        //пройти по нему циклом, и числа меньшие 6 умножить на 2;

//        int[] changeArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < changeArray.length; i++){
//            if (changeArray[i] < 6){
//                changeArray[i] = changeArray[i] * 2;
//            }
//        }
//        for (int i = 0; i < changeArray.length; i++){
//            System.out.print(i + " this i*2 =" + changeArray[i] + " | ");
//        }

//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с
//        помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если
//                обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
//        элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

//        int[][] fillDiagonal = new int[3][3]; //
//        for (int i = 0; i < fillDiagonal.length; i++) {
//            for (int j = 0; j < fillDiagonal[i].length; j++) {
//                if (i == j) fillDiagonal[i][j] = 1;
//                else fillDiagonal[i][j] = 8;
//                System.out.print(fillDiagonal[i][j] + "   ");
//            }
//            System.out.print("\n");
//
//                }

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

        //printArgumentArrayInConsole(array(3, 5));

        //public static int[] array(int len, int initialValue){
        //int[] argumentArray = new int[len];
        //for (int i = 0; i < argumentArray.length; i++) {
        //argumentArray[i] = initialValue;
        //}
        //return argumentArray;
        //}
        //public static void printArgumentArrayInConsole(int[] inputArray) {
        //for (int i = 0; i < inputArray.length; i++) {
        //System.out.print(inputArray[i] + " ");
        //}
        //System.out.println();
        //}

//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int[] minMax = new int[100];
        minMax[0] = 0;
        int min = minMax[0];
        //int max = minMax[0];
        for (int i = 1; i < minMax.length; i++) {
            if (minMax[0] < min) {
                min = minMax[i];
            }
            //if (minMax[0] < max) {
            //max = minMax[i];
        }
        System.out.print(" min is - " + min);
        //System.out.print(" max is - " + max);

}
        }


















