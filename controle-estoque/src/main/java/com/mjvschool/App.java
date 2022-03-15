package com.mjvschool;

import java.math.BigDecimal;
import java.util.List;

import com.mjvschool.model.Produto;
import com.mjvschool.model.TipoUnidade;
import com.mjvschool.repository.ProdutoRepository;
import com.mjvschool.util.NumberUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProdutoRepository produtoRepository = new ProdutoRepository();

        Produto p1 = new Produto();
        p1.setEan("7898994329367");
        p1.setDescricao("FEIJAO PRETO BOM FEIJAO 1 KG");
        p1.setEstoque(new BigDecimal(2.0));
        p1.setPrecoCusto(new BigDecimal(2.50));
        p1.setPrecoVenda(new BigDecimal(4.20));
        p1.setTipoUnidade(TipoUnidade.UN);

        Produto p2 = new Produto();
        p2.setEan("7893500025375");
        p2.setDescricao("ARROZ COM BRÓCOLIS TIO JOÃO COZINHA FÁCIL 250G");
        p2.setEstoque(new BigDecimal(0.0));
        p2.setPrecoCusto(new BigDecimal(5.50));
        p2.setPrecoVenda(new BigDecimal(7.50));
        p2.setTipoUnidade(TipoUnidade.UN);

        Produto p3 = new Produto();
        p3.setEan("7899567253416");
        p3.setDescricao("CARNE BOVINA PATINHO 1 KG ");
        p3.setEstoque(new BigDecimal(100.5));
        p3.setPrecoCusto(new BigDecimal(2.50));
        p3.setPrecoVenda(new BigDecimal(34.55));
        p3.setTipoUnidade(TipoUnidade.KG);

        
        produtoRepository.save(p1);
        produtoRepository.save(p2);
        produtoRepository.save(p3);

        List<Produto> produtos = produtoRepository.findAll();
        
        System.out.println("Produtos Cadastrados:");
        for (Produto produto : produtos) {
            System.out.println( produto.toString()); 
        }

        List<Produto> produtosSemEstoque = produtoRepository.findProdutosSemEstoque();
        
        System.out.println("Produtos Sem Estoque:");
        for (Produto produto : produtosSemEstoque) {
            System.out.println( produto.toString()); 
        }

    }
}
