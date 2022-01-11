package com.bootcampdiocog.estudos01;

public class Operacoes {
    
    // Métodos que retornam resultados de operações aritméticas básicas.   
    
    public static void somar(int a, int b){
        
       // Declara uma variável e lhe Atribui, como valor, o resultado da Soma entre duas variáveis.
       int soma = a + b;
       System.out.println("Resultado:");
       
       // Exibe o resultado da operação.
       System.out.println(a + " + " + b + " = " + soma +"\n");
       
    }
   
    public static void subtrair(int a, int b){
        
       // Declara uma variável e lhe Atribui, como valor, o resultado da Subtração entre duas variáveis.
       int subtracao = a - b;
       System.out.println("Resultado:");
       
       // Exibe o resultado da operação.
       System.out.println(a + " - " + b + " = " + subtracao +"\n");
       
    }
   
    public static void multiplicar(int a, int b){
        
       // Declara uma variável e lhe Atribui, como valor, o resultado da Multiplicação entre duas variáveis.
       int multiplicacao = a * b;
       System.out.println("Resultado:");
       
       // Exibe o resultado da operação.
       System.out.println(a + " x " + b + " = " + multiplicacao +"\n");
       
    }
   
    public static void dividir(double a, double b){
        
       // Declara uma variável e lhe Atribui, como valor, o resultado da Divisão entre duas variáveis.
       double divisao = a / b;
       System.out.println("Resultado:");
       
       // Exibe o resultado da operação.
       System.out.println(a + " / " + b + " = " + divisao +"\n");
       
    }
   
}

