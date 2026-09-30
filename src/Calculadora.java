import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        // O menu se repete até o usuário escolher a opção 6 (sair)
        while (opcao != 6) {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Realizar uma soma");
            System.out.println("2 - Realizar uma subtração");
            System.out.println("3 - Realizar uma multiplicação");
            System.out.println("4 - Realizar uma divisão");
            System.out.println("5 - Elevar um número a uma potência N");
            System.out.println("6 - Sair da calculadora");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1: // SOMA
                    System.out.print("Digite o primeiro número: ");
                    double somaA = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double somaB = sc.nextDouble();

                    double resultadoSoma = somaA + somaB;
                    System.out.println("Resultado: " + resultadoSoma);

                    // Submenu: continuar somando com o resultado
                    int subSoma = 0;
                    while (subSoma != 2) {
                        System.out.println("\n1 - Informar mais um número para continuar a soma");
                        System.out.println("2 - Sair da operação");
                        System.out.print("Escolha uma opção: ");
                        subSoma = sc.nextInt();

                        if (subSoma == 1) {
                            System.out.print("Digite o próximo número: ");
                            double novo = sc.nextDouble();
                            resultadoSoma = resultadoSoma + novo;
                            System.out.println("Resultado: " + resultadoSoma);
                        } else if (subSoma != 2) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;

                case 2: // SUBTRAÇÃO
                    System.out.print("Digite o primeiro número: ");
                    double subA = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double subB = sc.nextDouble();

                    double resultadoSub = subA - subB;
                    System.out.println("Resultado: " + resultadoSub);

                    // Submenu: continuar subtraindo do resultado
                    int subSub = 0;
                    while (subSub != 2) {
                        System.out.println("\n1 - Informar mais um número para continuar a subtração");
                        System.out.println("2 - Sair da operação");
                        System.out.print("Escolha uma opção: ");
                        subSub = sc.nextInt();

                        if (subSub == 1) {
                            System.out.print("Digite o próximo número: ");
                            double novo = sc.nextDouble();
                            resultadoSub = resultadoSub - novo;
                            System.out.println("Resultado: " + resultadoSub);
                        } else if (subSub != 2) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;

                case 3: // MULTIPLICAÇÃO
                    System.out.print("Digite o primeiro número: ");
                    double multA = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double multB = sc.nextDouble();

                    double resultadoMult = multA * multB;
                    System.out.println("Resultado: " + resultadoMult);
                    break;

                case 4: // DIVISÃO (quociente e resto)
                    System.out.print("Digite o dividendo: ");
                    double dividendo = sc.nextDouble();
                    System.out.print("Digite o divisor: ");
                    double divisor = sc.nextDouble();

                    // Não existe divisão por zero
                    if (divisor == 0) {
                        System.out.println("Erro: não é possível dividir por zero!");
                    } else {
                        double quociente = dividendo / divisor;
                        double resto = dividendo % divisor;
                        System.out.println("Divisão: " + quociente);
                        System.out.println("Resto: " + resto);
                    }
                    break;

                case 5: // POTÊNCIA
                    System.out.print("Digite a base: ");
                    double base = sc.nextDouble();
                    System.out.print("Digite o expoente (N): ");
                    double expoente = sc.nextDouble();

                    double potencia = Math.pow(base, expoente);
                    System.out.println("Resultado: " + potencia);
                    break;

                case 6: // SAIR
                    System.out.println("Calculadora encerrada. Até mais!");
                    break;

                default: // qualquer outro número
                    System.out.println("Opção inválida! Escolha de 1 a 6.");
            }
        }

        sc.close();
    }
}