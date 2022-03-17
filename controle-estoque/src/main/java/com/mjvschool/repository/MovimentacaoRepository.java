package com.mjvschool.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mjvschool.model.Movimentacao;

public class MovimentacaoRepository {
    private EntityManager em;
    public MovimentacaoRepository() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PRODUTOS_PU");
        em = entityManagerFactory.createEntityManager();         
    }

    public void save(Movimentacao movimentacao){
        em.getTransaction().begin();
        em.persist(movimentacao);
        em.getTransaction().commit();
    }

    public Movimentacao findById(Integer id){
        Movimentacao produto = em.find(Movimentacao.class, id);
        return produto;
    }

    public List<Movimentacao> findAll(){
        Query query = em.createQuery("Select m From Movimentacao m");
        return query.getResultList();
    }
}
