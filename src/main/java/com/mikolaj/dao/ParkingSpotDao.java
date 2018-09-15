package com.mikolaj.dao;

import com.mikolaj.model.ParkingSpot;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;
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

}
