import java.util.Arrays;

public class Exercicio_1 {

    private int[] elementos;
    private int tamanho;
    private boolean teste;

    public Exercicio_1(int capacidade) {
        this.elementos = (int[]) new int[capacidade];
        this.tamanho = 0;
    }

    public Exercicio_1() {
        this(10);
    }

    public int empilhaPar(int elemento) throws IllegalAccessException {
        if ((this.tamanho < this.elementos.length) && (elemento % 2 == 0)) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return this.elementos[this.tamanho];
        } else {
            if(estaVazia()){
                throw new IllegalAccessException("Pilha vazia");
            }
            return this.elementos[--tamanho] = 0;
        }
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    @Override
    public String toString() {
        if (teste == true){
            for (int i = 0; i < elementos.length; i++) {
                this.elementos[i] = 0;
            }
            this.teste = false;
            this.tamanho = 0;
        } else {
            this.teste = true;
        }
        return Arrays.toString(elementos);
    }
}
