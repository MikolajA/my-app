package com.mikolaj.web;

import com.mikolaj.Freemarker.TemplateProvider;
import com.mikolaj.dao.ParkingSpotDao;
import com.mikolaj.model.ParkingSpot;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/save")
@MultipartConfig
public class SaveParkingSpotServlet extends HttpServlet {

    @Inject
    private ParkingSpotDao parkingSpotDao;

    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        resp.setContentType("text/html;charset=UTF-8");
        Template template = templateProvider.getTemplate(getServletContext(), "SaveParkingSpot.html");
        Map<String, Object> dataModel = new HashMap<>();
        try {
            template.process(dataModel, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        Template template = templateProvider.getTemplate(getServletContext(), "Saved.html");
        resp.setContentType("text/html;charset=UTF-8");
        Map<String, Object> dataModel = new HashMap<>();
        try {
            template.process(dataModel, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }

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
