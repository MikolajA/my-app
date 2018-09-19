package com.mikolaj.dao;

import com.mikolaj.model.ParkingSpot;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ParkingSpotDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(ParkingSpot p) {
        entityManager.persist(p);
    }

}
