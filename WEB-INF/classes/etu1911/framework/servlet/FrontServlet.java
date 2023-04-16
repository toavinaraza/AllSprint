package etu1911.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;

public class FrontServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        processRequest(request, response);
    }

    protected void processRequest (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    }
}
