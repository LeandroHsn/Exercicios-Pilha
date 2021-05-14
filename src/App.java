import java.util.Stack;

public class App {

    public static String converterDecimal(int valor){
        return Integer.toBinaryString(valor);
    }

    public static void main(String[] args) throws Exception {

        Stack<Object> stackLivros = new Stack<>();
        Stack<Integer> desafio1 = new Stack<>();
        Exercicio_1 teste = new Exercicio_1();
        Exercicio_2 teste2 = new Exercicio_2();
        Pilha<String> pilhaLivros = new Pilha<>(20);

        // 1) Escreva um programa que leia dez números. Para cada número lido, verifique e implemente de acordo com as regras a seguir
        // A. Se o número for par, empilhe na pilha;
        // B. Se o número for ímpar, desempilhar um número da pilha. Caso a pilha esteja vazia, mostre uma mensagem;
        // C. Se ao final do programa a pilha não estiver vazia, desempilhar todos os elementos, imprimindo-os na tela.

        System.out.println("\nExercício 01\n");

            //teste.empilhaPar(1);          // Condição de erro caso a pilha esteja vazia
            //System.out.println(teste+"\n");

            teste.empilhaPar(2);
            teste.empilhaPar(54);
            teste.empilhaPar(4);
            teste.empilhaPar(12);
            teste.empilhaPar(314);
            teste.empilhaPar(23); // Tirou o 314
            teste.empilhaPar(19); // Tirou o 12
            teste.empilhaPar(18);

            System.out.println("Elementos empilhados: " + teste);
            System.out.println("Elementos desempilhados: " + teste);

            teste.empilhaPar(2);
            teste.empilhaPar(54);
            teste.empilhaPar(4);
            teste.empilhaPar(12);
            teste.empilhaPar(314);
            teste.empilhaPar(23); // Tirou o 314
            teste.empilhaPar(19); // Tirou o 12
            teste.empilhaPar(18);

            System.out.println("Elementos empilhados: " + teste);
            System.out.println("Elementos desempilhados: " + teste);
            System.out.println("Elementos desempilhados: " + teste);

        // 2) Escreva um programa que leia 10 números. Para cada número lido, verifique e implemente de acordo com as regras a seguir:
        // A. Se o número for par, empilhe na pilha chamada par;
        // B. Se o número for ímpar, empilhe na pilha chamada ímpar;
        // C. Se o número for zero (0), desempilhar um elemento de cada pilha. Caso alguma pilha esteja vazia, mostre uma mensagem de erro na tela;
        // D. Ao final do programa desempilhar todos os elementos das duas pilhas, imprimindo-os na tela e apresentando qual número pertence a cada lista.

        System.out.println("\nExercício 02\n");

            //teste2.empilhaParOuImpar(0);      // Condição de erro caso pilha vazia.
            //System.out.println(teste2+"\n");

            teste2.empilhaParOuImpar(5);
            teste2.empilhaParOuImpar(2);
            teste2.empilhaParOuImpar(4);
            teste2.empilhaParOuImpar(3);
            teste2.empilhaParOuImpar(0); // Adicionando o 0
            teste2.empilhaParOuImpar(1);
            teste2.empilhaParOuImpar(7);
            teste2.empilhaParOuImpar(8);

            System.out.println(teste2);
            System.out.println("\n"+teste2); // Desemplilhando os elementos

            teste2.empilhaParOuImpar(5);
            teste2.empilhaParOuImpar(2);
            teste2.empilhaParOuImpar(4);
            teste2.empilhaParOuImpar(3);
            teste2.empilhaParOuImpar(0); // Adicionando o 0
            teste2.empilhaParOuImpar(1);
            teste2.empilhaParOuImpar(7);
            teste2.empilhaParOuImpar(8);

            System.out.println("\n"+teste2);
            System.out.println("\n"+teste2); // Desemplilhando os elementos

        // 3) Utilize a classe Pilha e desenvolva os seguintes items:
        // A. Crie uma pilha com capacidade para 20 livros;
        // B. Insira 6 livros na pilha;
        //       i. Cada livro contém nome, isbn, ano de lançamento e autor.
        // C. Crie um exemplo para utilizar cada método da classe pilha.

        System.out.println("\nExercício 03\n");

            Livro livro1 = new Livro("A ordem", 102456, "18/02/2019", "Roberto Gil");
            Livro livro2 = new Livro("O livro", 202456, "24/05/2020", "Leandro Gil");
            Livro livro3 = new Livro("Terra Plana", 452456, "09/08/2000", "Carlos Gil");
            Livro livro4 = new Livro("Terra Quadrada", 252456, "02/06/1995", "Wilbert Gil");
            Livro livro5 = new Livro("Assassins Creed", 962456, "17/07/1998", "Erick Gil");
            Livro livro6 = new Livro("Gof of War", 785456, "25/01/2001", "Jo Soares");

            System.out.println("A pilha está vazia? "+ pilhaLivros.estaVazia()+"\n");

            pilhaLivros.empilha(livro1);
            pilhaLivros.empilha(livro2);
            pilhaLivros.empilha(livro3);
            pilhaLivros.empilha(livro4);
            pilhaLivros.empilha(livro5);
            pilhaLivros.empilha(livro6);

            System.out.println(pilhaLivros);
            System.out.println("\nTamanho da pilha: "+ pilhaLivros.tamanho()+ "\n");

            pilhaLivros.desempilha();

            System.out.println(pilhaLivros);

            System.out.println("\nTamanho da pilha: "+ pilhaLivros.tamanho());

            System.out.println("A pilha está vazia? "+ pilhaLivros.estaVazia());

        // 4) Repita o mesmo processo do exercício anterior, porém utilizando a classe Stack da API Java.

        System.out.println("\nExercício 04\n");

            System.out.println("A pilha está vazia? "+ stackLivros.isEmpty()+"\n");

            stackLivros.push(livro1);
            stackLivros.push(livro2);
            stackLivros.push(livro3);
            stackLivros.push(livro4);
            stackLivros.push(livro5);
            stackLivros.push(livro6);

            System.out.println(stackLivros);
            System.out.println("\nTamanho da pilha: "+ stackLivros.size()+ "\n");

            stackLivros.pop();

            System.out.println(stackLivros);

            System.out.println("\nTamanho da pilha: "+ stackLivros.size());

            System.out.println("A pilha está vazia? "+ stackLivros.isEmpty());

        // Desafio 1: Conversão decimal-binário
        // Usando a classe Pilha ou Stack, desenvolva um algoritmo que faça a conversão de números decimais para binários.

            System.out.println("\nDesafio 1 - Conversão decimal-binário\n");

            desafio1.push(5);
            desafio1.push(7);
            desafio1.push(10);
            desafio1.push(15);
            desafio1.push(5);
            desafio1.push(1);

            for (int i = desafio1.size() - 1; i >= 0; i--) {
                System.out.println(converterDecimal(desafio1.get(i)) + " - " + desafio1.get(i));
                desafio1.pop();
            }
    }


}
