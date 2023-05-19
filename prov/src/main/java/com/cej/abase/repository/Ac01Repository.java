package com.cej.abase.repository;


import com.cej.abase.domain.Ac01;
import com.cej.abase.repository.extend.Ac01RepositoryEx;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Ac01
 * */
public interface Ac01Repository extends JpaRepository<Ac01,String>, Ac01RepositoryEx {

}
