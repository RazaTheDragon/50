package com.example.faizan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] o = new int [6][6];
        int a=-1;
        int c=-1;
        for (int i=0;i<5;i++) {
            a++;
            for (int j = 0; j < 5; j++) {
                int b=0;
                double r = Math.random();
                o[a][b] = (int) (r * 1000);
                c = c+o[a][b];
                System.out.print(o[a][b]+" ");
                b++;
            }
            System.out.println(" ");
        }System.out.println(c);
    }
}

