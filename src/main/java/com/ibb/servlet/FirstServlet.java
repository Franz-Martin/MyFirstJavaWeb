/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author trainer
 */
@WebServlet(urlPatterns = "/servlet")
public class FirstServlet extends HttpServlet {
    
    public void init(){
        System.out.println("Eine Objekt wurde geboren!");
    }
    
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) {
        try {
            PrintWriter out = response.getWriter();
            HttpSession session=request.getSession();
            Person p=new Person("Hans", "Mustermann");
            
            session.setAttribute("myPerson", p);
            p.setFirstname("Irene");
            out.print("<!DOCTYPE html><html>"
                    + "<head><title>Start Page</title>"
                    + "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>"
                    + "</head><body>");
            out.print("<p>SessionId:"+request.getSession().getId()+"</p>");
            out.print("Hallo Java Web Welt. Es ist:" + LocalDateTime.now());
            out.print("<p>User-agent:"+request.getHeader("User-Agent")+"</p>");
              out.print("<p>Accept-Language:"+request.getHeader("Accept-Language")+"</p>");
            out.print("</body>"
                    + "</html>");
            
        } catch (IOException ex) {
            Logger.getLogger(FirstServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
    
    @Override
    public void destroy(){
        System.out.println("Jetzt wird das Objekt tatsächlich aus dem Pool entfernt!");
    }
    
    
}
