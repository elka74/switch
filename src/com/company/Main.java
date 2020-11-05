package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		/*System.out.println("Введите два числа и оператор действия между ними");
		int a, b;
		String operation;
		a = scr.nextInt();
		b = scr.nextInt();
		operation = scr.next();
		switch (operation) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				if (b == 0) {
					System.out.println("На ноль делить нельзя");
				} else {
					System.out.println((float) (a) / (float) (b));
				}
				break;
		}*/

		/*for (int i = 0; i < 5; i++){
			System.out.println("i =  " + i);
		}
		int x ;
		for ( x = 10; x >= 0; x -= 5){
			System.out.println(x + " ");
		}*/

		/*for (int i = 0, j = 11; i <= j; i++, j--){
			System.out.println("i - j: " + i + "-" + j);
		}*/
		/*for(int i =0;i< 7; i++){
			if (i > 3){
				break;
			}
			System.out.println("i = "+ i);
		}*/

		/*for (int i = 0; i < 3; i++){
			for (int j =0; j < 3; j++){
				System.out.print(" " + i + j);
			}
		}*/
    int [] a =new int [7];
        a[0] = 5;
		a[1] = 2;
		a[2] = 9;
		a[3] = 1;
		a[4] = 3;
		a[5] = 12;
		a[6] = 5234;
		babbleSort(a);
		System.out.println();

	}
	public static void babbleSort(int [] a){
    	for (int i = 0; i < a.length -1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
	}
}
