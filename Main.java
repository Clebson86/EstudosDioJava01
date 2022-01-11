package com.bootcampdiocog.estudos01;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = 0, b = 0;
        String x = null;

        // Variável para controle de exibição do Título no Menu principal.
        boolean m = false;

        // Laço central que roda todo o programa.
        do {

            // Teste de comparação.
            if (m == false) {
                // Exibido na primeira entrada do programa.
                System.out.println("   Olá! Seja bem vindo!!");
            } else {
                // Exibido caso o usuário volte ao inicio. 
                System.out.println("Você retornou ao menu principal!");
            }
            // Mudança de valor para exibição do Título do Menu
            m = true;

            // Exibição do menu de seleção.
            System.out.println("Para Calculadora, digite 1!");
            System.out.println("Para Empréstimo,  digite 2!");
            System.out.println("Para Mensagem,    digite 3!");

            int op = s.nextInt();

            /* Inicio da estrutura de seleção para os serviços do Menu principal.
               Em qualquer opção, o usuário poderá realizar outro serviço, 
               voltar ao menu principal ou sair do programa. 
            */
            switch (op) {

                case 1: {

                    /* Inicio da estrutura de repetição para Calculadora. .*/
                    do {

                        // Menu de escolha das operações aritméticas básicas.
                        System.out.println("\tVocê escolheu Calculadora!");
                        System.out.println("Digite o número para a Operação desejada:");
                        System.out.println("Soma\t\t1");
                        System.out.println("Subtração\t2");
                        System.out.println("Multiplicação\t3");
                        System.out.println("Divisão\t\t4");

                        op = s.nextInt();

                        switch (op) {

                            case (1): {

                                System.out.println("Você ecolheu a operação de Soma!");
                                
                                // Entrada dos valores
                                System.out.println("Informe o primeiro número: ");
                                a = s.nextInt();
                                System.out.println("Informe o segundo número: ");
                                b = s.nextInt();
                                
                                // Chamando método que executa a operação desejada e exibe o resultado.
                                Operacoes.somar(a, b);
                            }
                            break;

                            case 2: {

                                System.out.println("Você ecolheu a operação de Subtração!");
                                
                                // Entrada dos valores
                                System.out.println("Informe o primeiro número: ");
                                a = s.nextInt();
                                System.out.println("Informe o segundo número: ");
                                b = s.nextInt();

                                // Chamando método que executa a operação desejada e exibe o resultado.
                                Operacoes.subtrair(a, b);
                            }
                            break;

                            case (3): {

                                System.out.println("Você ecolheu a operação de Multiplicação!");
                                
                                // Entrada dos valores
                                System.out.println("Informe o primeiro número: ");
                                a = s.nextInt();
                                System.out.println("Informe o segundo número: ");
                                b = s.nextInt();

                                // Chamando método que executa a operação desejada e exibe o resultado.
                                Operacoes.multiplicar(a, b);
                            }
                            break;

                            case 4: {

                                System.out.println("Você ecolheu a operação de Divisão!");
                                
                                // Entrada dos valores
                                System.out.println("Informe o primeiro número: ");
                                a = s.nextInt();
                                System.out.println("Informe o segundo número: ");
                                b = s.nextInt();
                                
                                // Chamando método que executa a operação desejada e exibe o resultado.
                                Operacoes.dividir(a, b);
                            }
                            break;

                            default: {
                                System.out.println("Escolha uma opção válida!\n");
                            }
                        }
                        // Comando para limpar o buffer de entrada.
                        s.nextLine();

                        
                        System.out.println("Deseja realizar outra Operação?");
                        System.out.println("Digite 's' para sim ou 'n' para não!");
                        x = s.nextLine();
                        
                    // Fim da estrutura para Calculadora    
                    } while (!"n".equals(x)); 

                }
                break;

                case 2: {

                    // Inicio da estrutura de repetição para Empréstimos.
                    do {
                        System.out.println("Você escolheu Empréstimo!");
                        
                        // Entrada dos valores.
                        System.out.println("Qual valor para simular o empréstimo?");
                        double valor = s.nextDouble();

                        System.out.println("Em quantas parcelas será pago?");
                        int parcela = s.nextInt();
                        
                        if ((parcela > 5) || (parcela < 1)) {
                            System.out.println("Você só pode escolher parcelamento em até 5 vezes!!\n");
                            continue;
                        }
                        
                        // Atribuição do resultado à uma variável, através da chamada
                        // do método que calcula o valor do empréstimo parcelado.
                        double valorTotal = Emprestimo.emprestimoParcela(valor, parcela);

                        System.out.println("o valor total do empréstimo dividido em " + parcela + " vezes");
                        System.out.println("com juros é de R$ " + valorTotal + ", com parcelas de R$ " + (valorTotal / parcela) + "\n");

                        // Comando para limpar o buffer de entrada.
                        s.nextLine();
                        
                        System.out.println("Deseja realizar outra simulação?");
                        System.out.println("Digite 's' para sim ou 'n' para não!");
                        x = s.nextLine();
                        
                    // Fim da estrutura para Empréstimos.
                    } while (!"n".equals(x));
                }
                break;

                case 3: {

                    // Inicio da estrutura de repetição para Mensagens.
                    do {
                        System.out.println("Você escolheu Mensagem!");
                        System.out.println("Olá, que horas são?");
                        int u = s.nextInt();
                        if ((u > 23) || (u < 0)) {
                            System.out.println("Informe uma hora válida!!");
                            continue;
                        }
                        System.out.println("Olá, são " + u + "H!");
                        
                        // Chamando método que exibe a Mensagem.
                        Mensagem.saudacao(u);
                        System.out.println();

                        s.nextLine();
                        System.out.println("Deseja saber as horas novamente?");
                        System.out.println("Digite 's' para sim ou 'n' para não!");
                        x = s.nextLine();
                        
                    // Fim da estrutura para Mensagens.
                    } while (!"n".equals(x));

                }
                break;

                default: {
                    System.out.println("Opção inválida!");
                }
            }
            System.out.println("Deseja voltar ao menu princípal?");
            System.out.println("Digite 's' para sim ou 'n' para não!");
            x = s.nextLine();
            
        // Fim da estrutura do laço central.
        } while (!"n".equals(x)); 

        System.out.println();
        System.out.println("Obrigado por utilizar os nossos serviços!!");
        System.out.println("Volte sempre!!");
        System.out.println("Teremos novidades em breve!");
    }

}
