import java.util.Arrays;

public class Exercicio_2 {

    private int[] elementosPar;
    private int[] elementosImpar;
    private int tamanhoPar;
    private int tamanhoImpar;
    private boolean testePar;
    private boolean testeImpar;

    public Exercicio_2(int capacidade) {
        this.elementosPar = (int[]) new int[capacidade];
        this.elementosImpar = (int[]) new int[capacidade];
        this.tamanhoPar = 0;
        this.tamanhoImpar = 0;
    }

    public Exercicio_2() {
        this(10);
    }

    public int empilhaParOuImpar(int elemento) throws IllegalAccessException {
        if (elemento == 0){
            if((tamanhoPar == 0) && (tamanhoImpar == 0)){
                throw new IllegalAccessException("Pilha vazia");
            }
            this.elementosPar[this.tamanhoPar] = elemento;
            this.elementosImpar[this.tamanhoImpar] = elemento;
            this.tamanhoPar++;
            this.tamanhoImpar++;
            return 0;
        } else if ((this.tamanhoPar < this.elementosPar.length) && (elemento % 2 == 0)) {
            this.elementosPar[this.tamanhoPar] = elemento;
            this.tamanhoPar++;
            return this.elementosPar[this.tamanhoPar];
        } else if ((this.tamanhoImpar < this.elementosImpar.length) && (elemento % 2 == 1)){
            this.elementosImpar[this.tamanhoImpar] = elemento;
            this.tamanhoImpar++;
            return this.elementosImpar[this.tamanhoImpar];
        }
        throw new IllegalAccessException("Pilha vazia");
    }

    @Override
    public String toString() {
        if (testePar == true){
            for (int i = 0; i < elementosPar.length; i++) {
                this.elementosPar[i] = 0;
            }
            this.testePar = false;
            this.tamanhoPar = 0;
        } else {
            this.testePar = true;
        }
        if (testeImpar == true){
            for (int i = 0; i < elementosImpar.length; i++) {
                this.elementosImpar[i] = 0;
            }
            this.testeImpar = false;
            this.tamanhoImpar = 0;
        } else {
            this.testeImpar = true;
        }
        return "Elementos Par: " + Arrays.toString(elementosPar) +
                "\nElementos Impar: " + Arrays.toString(elementosImpar);
    }
}
