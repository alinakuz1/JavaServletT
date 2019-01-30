package ru.ivmiit.servlets;

import javax.servlet.http.HttpServlet;

public class Calc extends HttpServlet {

    private int fistArg;
    private int secondArg;
    private double result;

    Calc(int fistArg, int secondArg){
        this.fistArg=fistArg;
        this.secondArg=secondArg;
    }

    public double CalcNumberExample(int fistArg,int secondArg){
        result=fistArg*secondArg;
        return result;
    }
}
