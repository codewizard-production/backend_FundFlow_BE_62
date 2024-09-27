package com.app.FundFlow_BE.repository;

import com.app.FundFlow_BE.model.Investor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class InvestorRepository extends SimpleJpaRepository<Investor, String> {
    private final EntityManager em;
    public InvestorRepository(EntityManager em) {
        super(Investor.class, em);
        this.em = em;
    }
    @Override
    public List<Investor> findAll() {
        return em.createNativeQuery("Select * from \"fundflow_be\".\"Investor\"", Investor.class).getResultList();
    }
}