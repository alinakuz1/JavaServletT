package ru.ivmiit.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletCalc extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //принимаем из командной строки параметры
        String firstArgAsStr=request.getParameter("first");
        String secondArgAsStr=request.getParameter("second");

        //переводим их из стринга в нужный формат
        int firstArg=Integer.parseInt(firstArgAsStr);
        int secondArg=Integer.parseInt(secondArgAsStr);

        //можно вычислить что нибудь с использованием этих параметров
        double result=(firstArg*3.14242)+(secondArg-1);

        //выводим результат в виде строки в браузере
        PrintWriter writer = response.getWriter();
        writer.write("Result:"+result);

    }
}
