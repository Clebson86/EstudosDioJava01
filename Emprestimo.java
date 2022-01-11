package com.bootcampdiocog.estudos01;

// Método que retorna o valor total de um emprétimo com juros
public class Emprestimo {

    public static double emprestimoParcela(double x, int z) {

        // Armazena o valor do empréstimo com a taxa de juros.
        double juros = 0;
        
        // Estrutura de seleção para valor da taxa em relação as parcelas.
        switch (z) {

            case 1: {
                juros = x * 0.05;
            }
            break;
            case 2: {
                juros = x * 0.10;
            }
            break;
            case 3: {
                juros = x * 0.15;
            }
            break;
            case 4: {
                juros = x * 0.20;
            }
            break;
            case 5: {
                juros = x * 0.25;
            }
            break;
            default: {
                System.out.println("Opção inválida!");
            }
        }
        return juros + x;
    }
}
