package com.app.FundFlow_BE.repository;

import com.app.FundFlow_BE.model.Stage;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class StageRepository extends SimpleJpaRepository<Stage, String> {
    private final EntityManager em;
    public StageRepository(EntityManager em) {
        super(Stage.class, em);
        this.em = em;
    }
    @Override
    public List<Stage> findAll() {
        return em.createNativeQuery("Select * from \"fundflow_be\".\"Stage\"", Stage.class).getResultList();
    }
}