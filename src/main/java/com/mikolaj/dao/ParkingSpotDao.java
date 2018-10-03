package com.mikolaj.dao;

import com.mikolaj.model.ParkingSpot;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ParkingSpotDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(ParkingSpot p) {
        entityManager.persist(p);
    }

    public ParkingSpot findByNumber (String numer) {
        final Query query = entityManager.createQuery("SELECT p FROM ParkingSpot p WHERE p.numer = :numer");
        query.setParameter("numer", numer);
        return (ParkingSpot) query.getSingleResult();
    }

}
