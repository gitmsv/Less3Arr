package ua.jvlab.smlnk;

import java.util.Arrays;

public class Less3Arr {

    public static void main(String[] args) {
        //Первый способ обьявления (для переходящих из с)
        //int arrOne[];
        //Второй способ обьявления (для джава)
        //int[] arrTwo = new int[12];

        // int[] arrTree = new int[]{2, 5, 8, 4};
        // выводит размерность масива
        // System.out.println(arrTree.length);
        // выводит ссылку (в джава запрещено прямая работа с памятью)
        // выводит только хеш код
        // System.out.println(arrTree);
        // двомерный 
        // int[][] arr2;
        // трехмерный
        // int[][][] arr3;
        // четырех мерный
        // int[][][][] arr4;
        int[] arrTwo = new int[12];
        for (int i = 0; i < arrTwo.length; i++) {
            // заполняет 
            arrTwo[i] = (int) (Math.random() * 10000 + 5000);
        }
        System.out.println(Arrays.toString(arrTwo));

        int[] a = Arrays.copyOfRange(arrTwo, 2, 7);
        // вывод 5 элементов с инд. 2 по 6; 
        System.out.println(Arrays.toString(a));

        // получить масив длинее на х 2 за оригинал, но даные с оригинала;
        int[] b = Arrays.copyOf(arrTwo, arrTwo.length * 2);
        System.out.println(Arrays.toString(b));

        // сортировка масив а;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(arrTwo));

// обход arrTwo циклом for...each
        int summa = 0;
//        for (int element:arrTwo){
//            summa=summa+element;
//            }

        // обычный for
        for (int i = 0; i < arrTwo.length; i++) {
            summa = summa + arrTwo[i];
        }
        System.out.println("Aveagre = " + summa / arrTwo.length);
    }

}
