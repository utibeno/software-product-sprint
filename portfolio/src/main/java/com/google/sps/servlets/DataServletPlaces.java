package com.google.sps.servlets;

import java.util.ArrayList;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet that returns some example content. TODO: modify this file to handle
 * comments data
 */
@WebServlet("/places")
public class DataServletPlaces extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String json = convertToJson();
        response.setContentType("application/json;");
        response.getWriter().println(json);
    }

    private ArrayList<String> createList() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Bangkok");
        return cities;
    }

    private String convertToJson() {
        Gson gson = new Gson();
        String json = gson.toJson(createList());
        return json;
    }
}
