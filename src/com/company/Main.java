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
   public static  void display(String variable, int num1, int num2, int result) {
       System.out.printf(variable, num1, num2, result);
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


   public static int sum (int sum1, int sum2) {
       return sum1+sum2;
   }


   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Introduzca el primer número para las operaciones");
       int num1 = scanner.nextInt();
       System.out.println("Introduzca el segundo número para las operaciones");
       int num2 = scanner.nextInt();

       System.out.println("¿Que operación quiere realizar?(introduzca solo el simbolo de la operacion)");
       char operacion = scanner.next().charAt(0);


       if (operacion=='-') {
           int resultres = resta(num1,num2);
           display("El resultado de restar %d - %d es %d", num1,num2, resultres);
       }
       else if (operacion=='+') {
           int resultsum = sum(num1,num2);
           display("El resultado de sumar %d + %d es %d", num1,num2, resultsum);
       }
       else if (operacion=='*') {
           int resultmult = mult(num1,num2);
           display("El resultado de multiplicar %d * %d es %d", num1,num2,resultmult);
       }
       else if (operacion=='/') {
           int resultdiv = div(num1,num2);
           display("El resultado de dividir %d / %d es %d",num1,num2,resultdiv);
       }
       else {
           System.out.println("La operación solicitada no existe en nustra base de datos. Lamentamos las molestias.");
       }


   }


}
