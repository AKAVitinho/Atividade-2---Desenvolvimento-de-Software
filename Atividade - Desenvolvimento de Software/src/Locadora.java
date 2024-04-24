// Autores: Victor Gabriel Purkott Coelho e Humberto Camargo de Castro

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {
    private static ArrayList<ItemLocadora> itens = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuItens() {
        int opcao;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Cadastrar Item");
            System.out.println("2. Buscar Item");
            System.out.println("3. Excluir Item");
            System.out.println("4. Listar todos os Itens");
            System.out.println("5. Excluir todos os Itens");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarItem();
                    break;
                case 2:
                    buscarItem();
                    break;
                case 3:
                    excluirItem();
                    break;
                case 4:
                    listarItens();
                    break;
                case 5:
                    excluirTodosItens();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void cadastrarItem() {
        System.out.println("----- CADASTRAR ITEM -----");
        System.out.println("Selecione o tipo de item:");
        System.out.println("1. Filme");
        System.out.println("2. Jogo");
        System.out.print("Opção: ");
        int tipoItem = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do item: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do item: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade do item: ");
        int qtdItem = scanner.nextInt();
        scanner.nextLine(); 

        switch (tipoItem) {
            case 1:
                System.out.print("Digite o diretor do filme: ");
                String diretor = scanner.nextLine();
                System.out.print("Digite a duração do filme (em minutos): ");
                int duracao = scanner.nextInt();
                scanner.nextLine();
                itens.add(new Filme(nome, preco, qtdItem, diretor, duracao));
                break;
            case 2:
                System.out.print("Digite a plataforma do jogo: ");
                String plataforma = scanner.nextLine();
                itens.add(new Jogo(nome, preco, qtdItem, plataforma));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Item cadastrado com sucesso!");
    }

    public static void buscarItem() {
        scanner.nextLine(); 
        System.out.print("Digite o nome do item a ser buscado: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;
        for (ItemLocadora item : itens) {
            if (item.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Item encontrado:");
                System.out.println(item);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Item não encontrado.");
        }
    }

    public static void excluirItem() {
        scanner.nextLine(); 
        System.out.print("Digite o nome do item a ser excluído: ");
        String nomeExclusao = scanner.nextLine();
        boolean removido = false;
        for (ItemLocadora item : itens) {
            if (item.getNome().equalsIgnoreCase(nomeExclusao)) {
                itens.remove(item);
                removido = true;
                System.out.println("Item excluído com sucesso!");
                break;
            }
        }
        if (!removido) {
            System.out.println("Item não encontrado.");
        }
    }

    public static void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Não há itens cadastrados.");
        } else {
            System.out.println("----- LISTA DE ITENS -----");
            for (ItemLocadora item : itens) {
                System.out.println(item);
            }
        }
    }

    public static void excluirTodosItens() {
        itens.clear();
        System.out.println("Todos os itens foram excluídos.");
    }

    public static void main(String[] args) {
        menuItens();
        scanner.close();
    }
}
