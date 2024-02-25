package org.example;

//import java.util.InputMismatchException;


class Main {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static java.util.ArrayList<String> numeros = new java.util.ArrayList<String>();
    public static double x;
    public static double y;
    public static String operador;
    public static double resultado;

    public static void main(String[] args) {
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");
        numeros.add("7");
        numeros.add("8");
        numeros.add("9");
        numeros.add("0");

       try {
           System.out.print("Digite um valor para x: ");
           x = scanner.nextDouble();
           System.out.print("Digite um valor para y: ");
           y = scanner.nextDouble();
           System.out.println("====================================");
           System.out.println("+     -->    adição                 ");
           System.out.println("-     -->    subtração              ");
           System.out.println("*     -->    mutiplicação           ");
           System.out.println("/     -->    divisão                ");
           System.out.println("====================================");
           System.out.print("Digite um operador: ");
           operador = scanner.next();

           if ((operador.length() > 1) && (numeros.contains(operador))) {
               System.out.println("Digite epenas um operador!");
           } else if (operador.equals("+")) {
               resultado = somar(x, y);
           } else if (operador.equals("-")) {
               resultado = subtrair(x, y);
           } else if (operador.equals("*")) {
               resultado = multiplicar(x, y);
           } else if (operador.equals("/")) {
               resultado = dividir(x, y);
           } else if (numeros.contains(operador)){
               System.out.println("operador invalido");
           }
           System.out.printf("O resultado da operação é: %.2f", resultado);

       } catch (java.util.InputMismatchException e){
           System.out.println("não pode letras ou simbolos no lugar dos números!");
       }
    }

    public static double somar(double x, double y){
        return x + y;
    }

    public static double multiplicar(double x, double y){
        return x * y;
    }

    public static double dividir(double x, double y){
        return x / y;
    }

    public static double subtrair(double x, double y){
        return x - y;
    }
}