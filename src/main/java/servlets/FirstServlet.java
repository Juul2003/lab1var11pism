package servlets;

import java.io.IOException;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("Cp1251");

        // Устанавливаем MIME
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>Мой первый сервлет</title></head><body>");
        out.println("<h2>Введите информацию о себе:</h2>");
        out.println("<form method=\"post\" action=\"" + request.getContextPath() + "/FirstServlet\">");
        out.println("<table border=\"0\"><tr><td align=\"top\">");
        out.println("Имя:</td> <td valign=\"top\">");
        out.println("<input type=\"text\" name=\"firstname\" size=\"20\">");
        out.println("</td></tr><tr><td valign=\"top\">");
        out.println("Фамилия: </td> <td valign=\"top\">");
        out.println("<input type=\"text\" name=\"lastname\" size=\"20\">");
        out.println("</td></tr><tr><td valign=\"top\">");
        out.println("E-Mail: </td> <td valign=\"top\">");
        out.println("<input type=\"text\" name=\"email\" size=\"20\">");
        out.println("</td></tr><tr><td valign=\"top\">");

        out.println("<input type=\"submit\" value=\"Отправить\"></td></tr>");
        out.println("</table></form>");
        out.println("</body></html>");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");/* Устанавливает тип контента ответа, отправляемого клиенту, если ответ еще не фиксировался.*/
        request.setCharacterEncoding("UTF-8"); /* Устанавливает кодировку символов (набор символов MIME) ответа, отправляемого клиенту, например, UTF-8.*/
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='ru'>");
        out.println("<head>");
        out.println("<title>Tables</title>");
        out.println("</head>");
        out.println("<body>");
        String h2_value = "";
        int temperature = Integer.parseInt(request.getParameter("temperature"));
        if (temperature < 0) {
            h2_value = "<h1>Температура: <p style='color: blue;'>" + temperature + "</p></h1>";
            out.println(h2_value);
        }
        if (temperature > 0) {
            h2_value = "<h1>Температура: <p style='color: red;'>" + temperature + "</p></h1>";
            out.println(h2_value);
        }
        if (temperature == 0) {
            h2_value = "<h1>Температура: <p>" + temperature + "</p></h1>";
            out.println(h2_value);
        }


        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}