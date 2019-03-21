import javax.servlet.ServletException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class support extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        Random rand = new Random();
        int num = rand.nextInt(90000) + 10000;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h2>Thank you! "+name+" for contacting us. We should receive " +
                "reply from us with in 24 hrs in your email address "+email+"." +
                " Let us know in our support email support@cstech.net if you don’t receive " +
                "reply within 24 hrs. Please be sure to attach your reference "+num+" " +
                "in your email.</h2>");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<head>\t\n" +
                "<title>CStech</title>\n" +
                "<style type=\"text/css\">\n" +
                "\t\thtml,body{height: 100%; padding:0; margin:0;}\n" +
                "\t\tform{ width:30em;height:23em; margin:-5em auto 0 auto; position: relative; top:50%; border:1px dotted #ccc; padding:.25em; }\n" +
                "\t\tfieldset{ margin:0;   border:0;padding:0;}\n" +
                "\t\tlegend{float:left; font-size: 200%; text-align: center; color:blue; font-weight: bold; border-bottom: 1px solid blue; width:15em;  padding:0; }\n" +
                "\t\tlabel, label+ input {display:inline; float:left;margin-top:1em;}\n" +
                "\t\tlabel{text-align: right; width:28%; clear: left; margin-top:.8em; }\n" +
                "\t\tlabel+ input{ width:60%; padding:.25em; ; margin-left:.5em; border: 1px inset;  margin-left: }\n" +
                "\t\tlabel+ textarea{ width:60%; padding:.25em; ; margin-left:.5em; border: 1px inset;  margin-left: }\n" +
                "\t\t#sub{  margin-top:1em; position: relative; float:left;clear: left; margin-left: 29%}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "\t<form action=\"support\" method=\"post\">\n" +
                "\t\t<fieldset><legend>CSTech</legend>\n" +
                "\t\t\t<label for=\"name\">Name: </label><input  type=\"text\" name=\"name\" id=\"name\">\n" +
                "\t\t\t<label for=\"email\">Email: </label><input  type=\"text\" name=\"email\" id=\"email\" >\n" +
                "\t\t\t<label for=\"problem\">Problem: </label><input  type=\"text\" name=\"problem\" id=\"problem\" >\n" +
                "\t\t\t<label for=\"problemdesc\">Problem Description: </label><textarea cols=\"20\" rows=\"10\"></textarea>\n" +
                "\t\t\t<input type=\"submit\" value=\"help\" id=\"sub\">\n" +
                "\t\t</fieldset>\t\n" +
                "\t</form>\n" +
                "</body>\n" +
                "</html>\n");
    }
}
