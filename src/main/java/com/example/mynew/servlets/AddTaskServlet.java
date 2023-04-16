package com.example.mynew.servlets;


import com.example.mynew.db.DBManager;
import com.example.mynew.db.Task;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/add-task")
public class AddTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String taskName = request.getParameter("task_name");
        String taskDescription = request.getParameter("task_description");
        String taskDeadline = request.getParameter("task_deadline");
        DBManager.addTask(new Task(0,taskName, taskDescription, taskDeadline));
        response.sendRedirect("/");

    }

}
