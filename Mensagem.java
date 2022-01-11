package com.bootcampdiocog.estudos01;

public class Mensagem {

    // Método que retorna uma mensagem dependendo da hora informada.
    public static double saudacao(int i) {

        if ((i >= 5) && (i <= 12)) {
            System.out.println("Bom dia!");
        } else {
            if ((i >= 13) && (i <= 18)) {
                System.out.println("Boa tarde!");
            } else {
                if ((i >= 19) && (i <= 23) || (i <= 4)) {
                    System.out.println("Boa noite!");
                }
            }
        }
        return i;
    }
}
// Necessita melhoria para horas e minutos.
