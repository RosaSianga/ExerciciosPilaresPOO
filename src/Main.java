import financeiro.ContaBancaria;
import financeiro.OperacoesConta;
import formas.Circulo;
import formas.FormaGeometrica;
import formas.Quadrado;
import produto.Exibivel;
import produto.Produto;

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

        OperacoesConta banco = new ContaBancaria("145893", 1000.00);
        banco.consultarSaldo();
        banco.depositar("145893", 3000.00);
        banco.sacar(1000.00);
        //banco.transferir("596321",2000.00);

    }
}
