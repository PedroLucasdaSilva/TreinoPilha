import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        Scanner leitor = new Scanner(System.in);
        Integer escolha;
        Scanner leitorS = new Scanner(System.in);
        String nome;
        do {
            System.out.println("Menu\n" +
                                "1 - Insira Livro\n" +
                                "2 - Olhe o Livro de Cima\n" +
                                "3 - Retire um Livro\n" +
                                "4 - Olhe a Pilha de Livros \n" +
                                "5 - Sair");
            escolha = leitor.nextInt();
            if(escolha==1){
                System.out.println("Escreva o nome do Livro:");
                nome = leitorS.nextLine();
                pilha.push(nome);
                System.out.println("Inserido com sucesso");
            } else if (escolha==2){
                System.out.println(pilha.peek());
            } else if (escolha==3){
                System.out.print("Livro removido: ");
                System.out.println(pilha.pop());
            } else if(escolha==4){
                System.out.println("Olhando todos os Livros...");
                pilha.exibe();
            }else if (escolha ==5){
                System.out.println("Encerrando...");
                break;
            }
        }while(escolha>=1 ||escolha<=4);
    }
}
