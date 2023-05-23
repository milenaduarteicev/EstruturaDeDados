import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Cadastrar paciente" + 
        "\n2 - Atender paciente" +
        "\n3 - Verificar vez" +
        "\n4 - Sair");
        
        int opcao = sc.nextInt();
        System.out.println(" ");
        
        //opções
        switch (opcao) {
            case 1:
                menuPaciente();
                break;
            case 2:
                menuAtender();
                break;
            case 3:
                imprimirVez();
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        sc.close();
    }

    public static void menuPaciente() {

        GestaoHospital paciente = new GestaoHospital(null, null, 0);

        Scanner sc = new Scanner(System.in);
        
        System.out.println("############### CADASTRO ###############");
        System.out.println(" ");
        System.out.println("Qual seu nível de prioridade?" +
        "\n0 - Normal" +
        "\n1 - Leve" +
        "\n2 - Moderado" +
        "\n3 - Severo");

        paciente.nivelPrioridade = sc.nextInt();
        System.out.println("------------------------------------");
        System.out.print("Digite seu nome: ");
        paciente.nome = sc.nextLine();
        sc.nextLine();
        System.out.print("Digite seu CPF: ");
        paciente.cpf = sc.nextLine();
        System.out.println("------------------------------------");
    }

    public static void menuAtender() {
        
    }

    public static void imprimirVez() {

        Scanner sc = new Scanner(System.in);

        GestaoHospital paciente = new GestaoHospital(null, null, 0);

        System.out.println("############### MENU VEZ ###############");
        System.out.println("Digite seu CPF: ");
        paciente.nome = sc.nextLine();

        // procurar na fila

    }

}
