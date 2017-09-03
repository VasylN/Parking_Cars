package controller;

import dao.DriverDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Pc on 02.09.2017.
 */
public class DriverController extends HttpServlet {
    private DriverDao dao;
    private static String INSERT_OR_EDIT = "/updateDriver.jsp";
    private static String LIST_DRIVER = "/listDriver.jsp";
    public DriverController(){
        this.dao = new DriverDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String forward = "";
        String action = req.getParameter("action");
        if(action.equalsIgnoreCase("delete")){
            int driverid = Integer.parseInt(req.getParameter("driverid"));
            dao.deleteDriver(driverid);
            forward = LIST_DRIVER;

        }else
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
