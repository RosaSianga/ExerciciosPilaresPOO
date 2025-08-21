import financeiro.ContaBancaria;
import financeiro.OperacoesConta;
import formas.Circulo;
import formas.FormaGeometrica;
import formas.Quadrado;
import produto.Exibivel;
import produto.Produto;
import tarefa.Concluivel;
import tarefa.Tarefa;

public class Main {
    public static void main(String[] args) {

        // Classe Circulo
        // Classe Quadrado
        // Metodo CalcularArea

//  Exemplo na explicação
        FormaGeometrica formaCirculo = new Circulo(5);
        formaCirculo.calcularArea();

        FormaGeometrica formaQuadrado = new Quadrado(4);
        formaQuadrado.calcularArea();

//  1. Produto
        Exibivel exibir = new Produto("Coca-cola", 5.0, "Refrigerante");
        exibir.exibirDetalhes();

//  2. Conta Bancária

        OperacoesConta conta1 = new ContaBancaria("145893", 1000.00);
        OperacoesConta conta2 = new ContaBancaria("596321", 0.00);

        conta1.consultarSaldo();
        conta1.depositar(3000.00);
        conta1.sacar(1000.00);
        conta1.transferir((ContaBancaria) conta2,2000.00);

//  3. Tarefa

        Concluivel tarefa = new Tarefa("Matematica");
        tarefa.estaConcluida();

    }
}
