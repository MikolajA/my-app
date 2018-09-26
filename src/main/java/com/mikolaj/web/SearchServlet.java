package com.mikolaj.web;

import com.mikolaj.Freemarker.TemplateProvider;
import com.mikolaj.dao.ParkingSpotDao;
import com.mikolaj.model.ParkingSpot;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/search")
@MultipartConfig
public class SearchServlet extends HttpServlet {

    @Inject
    private TemplateProvider templateProvider;

    @Inject
    private ParkingSpotDao parkingSpotDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html;charset=UTF-8");
        Template template = templateProvider.getTemplate(getServletContext(), "Search.html");
        Map<String, Object> dataModel = new HashMap<>();
        try {
            template.process(dataModel, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html;charset=UTF-8");

        Template template = templateProvider.getTemplate(getServletContext(), "Details.ftlh");
        Map<String, Object> dataModel = new HashMap<>();

        String numerParam = req.getParameter("numer");

        try {
            dataModel.put("parkingspot", parkingSpotDao.findByNumber(numerParam));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            template.process(dataModel, resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
