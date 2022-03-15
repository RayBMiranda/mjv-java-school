package com.mjvschool.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mjvschool.model.Produto;

public class ProdutoRepository {
    private EntityManager em;
    public ProdutoRepository() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PRODUTOS_PU");
        em = entityManagerFactory.createEntityManager();         
    }

    public void save(Produto produto){
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
    }

    public Produto findById(Integer id){
        Produto produto = em.find(Produto.class, id);
        return produto;
    }

    public List<Produto> findAll(){
        Query query = em.createQuery("Select p From Produto p");
        return query.getResultList();
    }

    public List<Produto> findProdutosSemEstoque() {
        Query query = em.createQuery("Select p From Produto p where p.estoque <= 0");
        return query.getResultList();
    }
}
