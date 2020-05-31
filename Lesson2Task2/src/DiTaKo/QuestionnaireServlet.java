package DiTaKo;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicIntegerArray;

@WebServlet(name = "QuestionnaireServlet", urlPatterns = "/questionnaire")
public class QuestionnaireServlet extends HttpServlet {

    public static AtomicIntegerArray a = new AtomicIntegerArray(4);
    static final String TEMPLATE = "<html>" +
            "<head><title>Statistic answers </title>" +
            "<meta charset=\"utf-8\"></head>" +
            "<body>" +
            "<table border=\"1\">\n" +
            "    <caption>Statistic answer</caption>\n" +
            "    <tr><td>Answer</td><td>Statistic</td></tr>\n" +
            "    <tr><td>14-21</td><td>%d</td></tr>\n" +
            "    <tr><td>22-30</td><td>%d</td></tr>\n" +
            "    <tr><td>31-40</td><td>%d</td></tr>\n" +
            "    <tr><td>41-100</td><td>%d</td></tr>\n" +
            "</table>\n" +"<p><a href=\"index.jsp\">" +
            "<input type=\"submit\" value=\"To anket\">" +
            "</a></p>"+
            "</body>";

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String answer0 = req.getParameter("answer1");
        String answer1 = req.getParameter("answer2");
        String answer2 = req.getParameter("answer3");
        String answer3 = req.getParameter("answer4");

        if (answer0 != null) {
            a.getAndIncrement(0) ;
        }
        if (answer1 != null) {
            a.getAndIncrement(1) ;
        }
        if (answer2 != null) {
            a.getAndIncrement(2) ;
        }
        if (answer3 != null) {
            a.getAndIncrement(3) ;
        }


        resp.getWriter().println(String.format(TEMPLATE, a.get(0), a.get(1), a.get(2), a.get(3)));

    }
}
