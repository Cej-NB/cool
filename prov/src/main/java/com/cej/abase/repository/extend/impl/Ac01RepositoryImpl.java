package com.cej.abase.repository.extend.impl;


import com.cej.abase.domain.Ac01;
import com.cej.abase.repository.extend.Ac01RepositoryEx;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class Ac01RepositoryImpl implements Ac01RepositoryEx {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<Ac01> findTopAc01(int maxResult) {

        Query query = entityManager.createQuery("from ac01");
        query.setMaxResults(maxResult);
        return query.getResultList();
    }
}
