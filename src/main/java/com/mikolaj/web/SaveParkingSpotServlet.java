package com.mikolaj.web;

import com.mikolaj.dao.ParkingSpotDao;
import com.mikolaj.model.ParkingSpot;

import javax.inject.Inject;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/save")
@MultipartConfig
public class SaveParkingSpotServlet extends HttpServlet {

    @Inject
    private ParkingSpotDao parkingSpotDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws IOException{

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws IOException{

       String imieParam = req.getParameter("imie");
       String nazwiskoParam = req.getParameter("nazwisko");
       String markaParam = req.getParameter("marka");
       String numerParam = req.getParameter("numer");
       String miejsceParam = req.getParameter("miejsce");

       final ParkingSpot ps = new ParkingSpot();

       ps.setImie(imieParam);
       ps.setNazwisko(nazwiskoParam);
       ps.setMarka(markaParam);
       ps.setNumer(numerParam);
       ps.setMiejsce(miejsceParam);

       parkingSpotDao.save(ps);

    }
}
