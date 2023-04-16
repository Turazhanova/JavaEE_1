package com.example.mynew.servlets;

import com.example.mynew.db.DBManager;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/delete-task")
public class DeleteTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        DBManager.deleteTask(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("/");

    }
}
