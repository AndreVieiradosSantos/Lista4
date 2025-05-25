package TechGadgets;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner opcao = new Scanner(System.in);
        do {
            System.out.println("===============Menu===============");
            System.out.println(" 1 - para cadastrar Smartphone");
            System.out.println(" 2 - para cadastrar Notebook");
            System.out.println(" 3 - para cadastrar Smartwatch");
            System.out.println(" 4 - Sair do programa");

            escolha = opcao.nextInt();

            switch (escolha) {
                case 1:
                    SmartPhone smartPhone = new SmartPhone("","",
                            "","",0,"","","");
                    smartPhone.cadastrarProduto();
                    smartPhone.exibirProduto();
                    break;
                case 2:
                    NoteBook noteBook = new NoteBook("","","");
                    noteBook.cadastrarProduto();
                    noteBook.exibirProduto();
                    break;
                case 3:
                    SmartWatch smartWatch = new SmartWatch("","","");
                    smartWatch.cadastrarProduto();
                    smartWatch.exibirProduto();
                    break;
                default:
                    System.out.println("Saindo do programa...");
                    opcao.close();
                    break;
            }

        }while (escolha>0 && escolha<4);
    }
}