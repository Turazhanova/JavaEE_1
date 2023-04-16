package com.example.mynew.servlets;


import com.example.mynew.db.DBManager;
import com.example.mynew.db.Task;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Task task = DBManager.getTask(Integer.parseInt(request.getParameter("task_id")));
        request.setAttribute("task", task);
        request.getRequestDispatcher("/details.jsp").forward(request, response);
    }
}