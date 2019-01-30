package ru.ivmiit.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //при переходе на http://localhost:8080/servlet_example_war/hello выводим строки ниже
        PrintWriter writer = response.getWriter();
        writer.write("<h1>Hello</h1>");
        writer.write("<h2>(-_-)</h2>");
    }



}
