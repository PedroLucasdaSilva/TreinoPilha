import java.util.Arrays;

public class Pilha {
    private String[] pilha;
    private int topo;

    public Pilha(int capacidade) {
        pilha = new String[capacidade];
        topo = -1;
    }
    boolean isEmpty(){
        if (topo ==-1){
            return true;
        }else {
            return false;
        }
    }

    boolean isFull(){
        if(topo==(pilha.length-1)){
            return true;
        } else{
            return false;
        }
    }

    void push(String info){
        if(!isFull()){
            pilha[++topo]=info;
            System.out.println("Livro Inserido: "+ info);
        } else {
            System.out.println("Prateleira Cheia");
        }
    }



    String pop(){
        if(!isEmpty()){
            return pilha[topo--];
        } else{
            return "-1";
        }
    }

    String peek(){
        if(!isEmpty()){
            return pilha[topo];
        } else{
            return "-1";
        }
    }

    void exibe(){
        if(isEmpty()){
            System.out.println("Prateleira Vazia");
        } else{
            for (int i=0;i<=topo;i++){
                System.out.println(pilha[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "pilha=" + Arrays.toString(pilha) +
                ", topo=" + topo +
                '}';
    }
}
