package NivelFacil.TiposDeDados.desafio6;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciar LinkedList com 7 Ninjas

        LinkedList<Ninja> listDeNinjas = new LinkedList<>();

        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        String novoNinjaNome;
        int novoNinjaIdade;
        String novoNinjaVila;

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int criterioOrdenacao;

        while (opcao != 6) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Listar ninjas");
            System.out.println("2. Inserir ninja no inicio da lista");
            System.out.println("3. Remover ninja no inicio da lista");
            System.out.println("4. Acessar um ninja em uma posição especifica da lista");
            System.out.println("5. Ordenar a lista de ninjas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                // Listar Ninjas
                case 1:
                    for(Ninja ninja: listDeNinjas){
                        System.out.println(ninja);
                    }
                    break;

                // Adicionar ninja no inicio da lista
                case 2:
                    System.out.println("Insira o nome do Ninja a ser adicionado");
                    novoNinjaNome = input.nextLine();
                    System.out.println("Insira a idade do Ninja a ser adicionado");
                    novoNinjaIdade = input.nextInt();
                    System.out.println("Insira a vila do Ninja a ser adicionado");
                    input.nextLine();
                    novoNinjaVila = input.nextLine();
                    listDeNinjas.addFirst(new Ninja(novoNinjaNome, novoNinjaIdade, novoNinjaVila));
                    break;

                // Remover ninja no inicio da lista
                case 3:
                    System.out.println("Ninja: " + listDeNinjas.removeFirst() + " removido.");
                    break;

                // Acessar ninja em uma posição especifica
                case 4:
                    System.out.println("Insira a posição que deseja consultar:");
                    System.out.println(listDeNinjas.get(input.nextInt()));
                    break;

                // Ordenar lista de ninjas
                case 5:
                    System.out.println("Escolha o criério de ordenação desejado:");
                    System.out.println("1. Nome");
                    System.out.println("2. Idade");
                    System.out.println("3. Vila");
                    criterioOrdenacao = input.nextInt();
                    switch (criterioOrdenacao) {
                        case 1:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getNome));
                            break;
                        case 2:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getIdade));
                            break;
                        case 3:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getVila));
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;

                case 6:
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
