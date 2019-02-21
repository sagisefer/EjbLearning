package org.sagi.servlets;

import org.sagi.session.TestStatelessEjb;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ssefer at 2/21/2019
 */
public class TestServlet extends HttpServlet {
    @EJB
    TestStatelessEjb testStatelessEjb;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        testStatelessEjb.sayHello("Stackify Reader");
    }
}