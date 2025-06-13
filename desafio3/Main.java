package NivelFacil.TiposDeDados.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroCadastros = 0;
        int maxCadastros = 10;
        int opcao = 0;

        Ninja[] ninja = new Ninja[maxCadastros];

        while (opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar Habilidades Especiais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    if (numeroCadastros < maxCadastros) {
                        System.out.println("Escolha 1 para Ninja ou 2 para Uchiha:");
                        int tipo = input.nextInt();
                        if(tipo == 1) {
                            ninja[numeroCadastros] = new Ninja();
                            System.out.println("Escreva o nome do Ninja a ser cadastrado: ");
                            input.nextLine();
                            ninja[numeroCadastros].nome = input.nextLine();
                            System.out.println("Escreva a idade do Ninja a ser cadastrado: ");
                            ninja[numeroCadastros].idade = input.nextInt();
                            System.out.println("Escreva a missão do Ninja a ser cadastrado: ");
                            input.nextLine();
                            ninja[numeroCadastros].missao = input.nextLine();
                            System.out.println("Escreva o nivel de dificuldade da missão do Ninja a ser cadastrado: ");
                            ninja[numeroCadastros].nivelDificuldade= input.nextLine();
                            System.out.println("Escreva o status da missão do Ninja a ser cadastrado: ");
                            ninja[numeroCadastros].statusMissao = input.nextLine();
                            numeroCadastros++;
                        } else if(tipo == 2){
                            ninja[numeroCadastros] = new Uchiha();
                            System.out.println("Escreva o nome do Uchiha a ser cadastrado: ");
                            input.nextLine();
                            ninja[numeroCadastros].nome = input.nextLine();
                            System.out.println("Escreva a idade do Uchiha a ser cadastrado: ");
                            ninja[numeroCadastros].idade = input.nextInt();
                            System.out.println("Escreva a missão do Uchiha a ser cadastrado: ");
                            input.nextLine();
                            ninja[numeroCadastros].missao = input.nextLine();
                            System.out.println("Escreva o nivel de dificuldade da missão do Uchiha a ser cadastrado: ");
                            ninja[numeroCadastros].nivelDificuldade= input.nextLine();
                            System.out.println("Escreva o status da missão do Uchiha a ser cadastrado: ");
                            ninja[numeroCadastros].statusMissao = input.nextLine();
                            System.out.println("Escreva a habilidade especial do Uchiha a ser cadastrado: ");
                            ((Uchiha) ninja[numeroCadastros]).habilidadeEspecial = input.nextLine();
                            numeroCadastros++;
                            } else{
                            System.out.println("Opção inválida");
                        }
                    } else{
                        System.out.println("Você excedeu o número máximo de ninjas cadastrados");
                    }
                    break;
                case 2:
                    if (numeroCadastros == 0) {
                        System.out.println("Nenhum ninja foi cadastrado");
                    } else {
                        System.out.println("Listando todos os ninjas cadastrados: \n");
                        for (int i = 0; i < numeroCadastros; i++) {
                            System.out.println("Ninja número " + i + ": ");
                            ninja[i].mostrarInformacoes();
                            System.out.println("\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Listando todos os ninjas cadastrados:");
                    for (int i = 0; i < numeroCadastros; i++) {
                        System.out.println("Ninja número " + i + ": ");ninja[i].mostrarInformacoes();
                        System.out.println("\n");
                    }
                    System.out.println("Escolha o número do ninja para atualizar sua habilidade especial: ");
                    int escolha = input.nextInt();
                    if(escolha <= numeroCadastros){
                        if(ninja[escolha] instanceof Uchiha){
                            System.out.println("Escreva a habilidade especial: ");
                            input.nextLine();
                            ((Uchiha) ninja[escolha]).habilidadeEspecial = input.nextLine();
                        } else{
                            System.out.println("Esse ninja não pode ter habilidades especiais");
                        }
                    } else{
                        System.out.println("Escolha Inválida");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Escolha inválida");
                    break;
            }
        }
        input.close();
    }
}
