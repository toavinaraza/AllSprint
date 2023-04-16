package etu1911.framework.servlet;

import etu1911.framework.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import jakarta.servlet.*;

public class FrontServlet extends HttpServlet {

    HashMap<String,Mapping> mappingUrls;

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        processRequest(request, response);
    }

    protected void processRequest (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    }
}
