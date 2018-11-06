/** 	Uma classe “produtos” com atributos
 * 		- nome do produto
 * 		- tamanho do produto
 * 		- cor
 * 		- marca
**/


package semana4;

public class Produtos {

    protected String nomeProduto;
    protected double tamanhoProduto;
    protected String cor;
    protected String marca;

    //construtir inicialiando as variaveis da classe Produto
    public Produtos(String nomeProduto, double tamanhoProduto, String cor, String marca) {
        this.nomeProduto = nomeProduto;
        this.tamanhoProduto = tamanhoProduto;
        this.cor = cor;
        this.marca = marca;
    }

    Produtos() {

    }
}
