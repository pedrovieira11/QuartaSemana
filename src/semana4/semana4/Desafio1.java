package semana4;

/**
 * Uma classe “produtos” com atributos
 * - nome do produto
 * - tamanho do produto
 * - cor
 * - marca
 * Uma classe ”estoque” que tem um objeto de produto
 * - quantidade
 * - id
 * - produto
 * Uma classe "funcionario" que tem os métodos
 * -Cadastrar
 * -Editar
 * -Excluir
 * -Consultar
 * <p>
 * mostre os metodos em execução
 */

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int err;

        Produtos p1 = new Produtos();
        Produtos p2 = new Produtos();
        Produtos p3 = new Produtos();

        Estoque e1 = new Estoque(p1, 10, 1);
        Estoque e2 = new Estoque(p2, 5, 2);
        Estoque e3 = new Estoque(p3, 15, 3);

        System.out.println("\nInsira os dados do produto 1:");
        System.out.println("\nNome: ");
        p1.nomeProduto = entrada.next();
        entrada.nextLine();
        System.out.println("\nTamanho: ");
        p1.tamanhoProduto = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("\nCor: ");
        p1.cor = entrada.next();
        entrada.nextLine();
        System.out.println("\nMarca: ");
        p1.marca = entrada.next();
        entrada.nextLine();

        System.out.println("\nInsira os dados do produto 2:");
        System.out.println("\nNome: ");
        p2.nomeProduto = entrada.next();
        entrada.nextLine();
        System.out.println("\nTamanho: ");
        p2.tamanhoProduto = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("\nMarca: ");
        p2.marca = entrada.next();
        entrada.nextLine();
        System.out.println("\nCor: ");
        p2.cor = entrada.next();
        entrada.nextLine();

        System.out.println("\nInsira os dados do produto 3:");
        System.out.println("\nNome: ");
        p3.nomeProduto = entrada.next();
        entrada.nextLine();
        System.out.println("\nTamanho: ");
        p3.tamanhoProduto = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("\nMarca: ");
        p3.marca = entrada.next();
        entrada.nextLine();
        System.out.println("\nCor: ");
        p3.cor = entrada.next();
        entrada.nextLine();

        Funcionario funcionarios = new Funcionario();

        //Cadastrando 3 novos produtos
        funcionarios.cadastrar(e1);
        funcionarios.cadastrar(e2);
        funcionarios.cadastrar(e3);

        //Consultando produto com sucesso.
        err = funcionarios.consultar(1);
        err = funcionarios.consultar(2);
        err = funcionarios.consultar(3);
        if (err >= 1 || err <= 3) {
            System.out.println("O produto escolhido foi encontrado!");
        }

        //Consultando produto com ID inxistente (erro)
        err = funcionarios.consultar(4);
        if (err == -1) {
            System.out.println("O produto escolhido não foi encontrado!");
        }

        //Editando produto com sucesso.
        e1.quantidade = 40;
        err = funcionarios.editar(e1);
        if (err == -1) {
            System.out.println("O produto escolhido não foi encontrado!");
        } else {
            System.out.println("Produto editado com sucesso!");
        }

        //Editando um produto com ID inexistente (erro)
        Estoque e4 = new Estoque(p1, 5, 100);
        err = funcionarios.editar(e4);
        if (err == -1) {
            System.out.println("O produto escolhido não foi encontrado!");
        } else {
            System.out.println("Produto editado com sucesso!");
        }

        //Excluindo produto com sucesso
        err = funcionarios.excluir(3);
        if (err == -1) {
            System.out.println("O produto escolhido não foi encontrado!");
        } else {
            System.out.println("Produto excluído!");
        }

        //Excluindo produto com ID inexistente (erro)
        err = funcionarios.excluir(5);
        if (err == -1) {
            System.out.println("O produto escolhido não foi encontrado!");
        } else {
            System.out.println("Produto excluído!");
        }
    }
}
