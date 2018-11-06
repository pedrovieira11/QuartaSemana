/**
 * Uma classe ”estoque” que tem um objeto de produto
 * - quantidade
 * - id
 * - produto
 **/
package semana4;

public class Estoque {

    protected Produtos produtos;
    protected int quantidade;
    protected int id;

    //construtor inicializando as variaveis da classe Estoque
    public Estoque(Produtos produtos, int quantidade, int id) {
        super();
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.id = id;
    }

    Estoque() {

    }
}
