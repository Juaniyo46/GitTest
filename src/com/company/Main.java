package com.company;

import java.util.Scanner;

public class Main {

   /* public static void display (String variable) {
        System.out.println(variable);
    }

    public static String generateString () {
        return "Hola mundo desde función generadora";
    }

    public static void main(String[] args) {
	// write your code here
    String var = generateString();
    display(var);


    }*/
   public static  void display (String variable) {
       System.out.println(variable);
   }

   public static int resta (int res1, int res2) {
       return res1-res2;

   }

   public static int mult (int mult1, int mult2) {
       return mult1*mult2;
   }

   public static int div (int div1, int div2) {
       return div1/div2;
   }


   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Introduzca el primer número para las operaciones");
       int num1 = scanner.nextInt();
       System.out.println("Introduzca el segundo número para las operaciones");
       int num2 = scanner.nextInt();

       int resultres = resta(num1,num2);
       String totalResta= String.valueOf(resultres);
       display("El resultado de restar 5 - 6 es "+ totalResta);
       int resultmult = mult(num1,num2);
       String totalMult = String.valueOf(resultmult);
       display("El resultado de multiplicar 5 * 6 es "+totalMult);
       int resuldiv = div(num1,num2);
       String totalDiv = String.valueOf(resuldiv);
       display("El resultado de dividir 5/6 es " + totalDiv);

   }


}
