import java.util.Scanner; // 1. Importando a classe Scanner

public class main {

    public static void main(String[] args) {
        //comentário
        Scanner leitor = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println(" nome inserido: " + nome);
        while (true) {
            System.out.println("========== Escolha as Opções a Baixo: ==========");
            System.out.println("1 - Para Soma \n2 - Para Subtração \n3 - Para Sair");
            int opcao = leitor.nextInt();

            switch (opcao) {


            case 1:
                System.out.print("Digite o primeiro número: ");
                numero1 = leitor.nextInt();


                System.out.print("Digite o segundo número: ");
                numero2 = leitor.nextInt();

                int soma = numero1 + numero2;

                System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                numero1 = leitor.nextInt();

                System.out.print("Digite o segundo número: ");
                numero2 = leitor.nextInt();

                float subtracao = numero1 - numero2;

                System.out.println("A subtração de " + numero1 + " e " + numero2 + " é: " + subtracao);
                break;
            case 3:
                System.out.println("saindo do sistema");
                leitor.close();
                break;

            default:
                System.out.println("opção invalidade! digite apenas numeros!");
        }

        }

    }
}

