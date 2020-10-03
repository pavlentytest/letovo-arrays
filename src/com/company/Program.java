package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

     /*   Scanner scanner = new Scanner(System.in);
        // y = x
       double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String str = (x*x + y*y > 4 && x < 2 && y < 2 && y < x && x > 0 && y > 0) ? "YES" : "NO";
        System.out.println(str);

        for(int i=0;i<5; i++) {

        }

        while(x>0) {
            // может не выполнится совсем
        }

        do {
            // выполнится 1 раз всегда
        } while(y < 0);
*/
        int[] a; // null
        a = new int[5];

        ArrayList arr = new ArrayList(); // дин.массив

        a[4] = 9;
        for(int j=0; j< 5; j++) {
      //      System.out.print(a[j] + " ");
        }

        int[] b = {5,6,7,9,10,-5};
        int c[] = {44,55};

        int[][] z = new int[3][4];

//        Math.random()
        Random r = new Random();
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++) {
                z[i][j] = r.nextInt(10000);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++) {
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(b));

        System.out.println();

        int[][] s = new int[3][];
        s[0] = new int[]{6, -9, 3};
        s[1] = new int[]{5,2,5,6};
        s[2] = new int[]{-900};

        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++) {
                System.out.printf("%4d", s[i][j]);
            }
            System.out.println();
        }


    }

}
