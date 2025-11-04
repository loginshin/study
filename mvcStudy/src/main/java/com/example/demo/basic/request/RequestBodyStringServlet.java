package com.example.demo.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {

        ServletInputStream inputStream = request.getInputStream();

        ServletInputStream inputStreams = request.getInputStream();

        String messageBody = StreamUtils.copyToString(inputStream,
                StandardCharsets.UTF_8);

        String messageBodys = StreamUtils.copyToString(inputStreams,
                StandardCharsets.UTF_8);

        System.out.println("messageBody = " + messageBody);
        System.out.println("messageBody = " + messageBodys);

        response.getWriter().write("ok");
    }
}
