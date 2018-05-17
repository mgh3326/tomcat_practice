

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageLogin
 */
@WebServlet("/login")
public class PageLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageLogin() {
        super();
        // TODO Auto-generated constructor stub


    }

    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setCharacterEncoding("utf-8");
        System.out.println("service 실행됨");
        PrintWriter out =resp.getWriter();
        out.print("" +
                "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "  <meta charset=\"UTF-8\">" +
                "<meta name=\"robots\" content=\"noindex\">" +
                "  <meta name=\"viewport\" content=\"width=device-width\">" +
                "  <title>UCAMPUS:로그인</title>" +
                "<link rel=\"shortcut icon\" href=\"/drawable/kw_favicon.ico\">" +
                "<style>" +
                //CSS
                "</style>" +
                "</head>");
        //body
        out.print("<body>");
        out.print("<br>");
        out.print("<select name=\"gubun_code\" id=\"gubun_code\" tabindex=\"1\" style=\"width:143px;\" onchange=\"javascript:fn_showhide();\">\r\n" +
                "                                        <option value=\"11\">학부생</option>\r\n" +
                "                                        <option value=\"21\">교수(Professor)</option>\r\n" +
                "                                        <option value=\"22\">직원</option>\r\n" +
                "                                        <option value=\"23\">외래강사(Instructor)</option>\r\n" +
                "                                        <option value=\"24\">조교</option>\r\n" +
                "                                        <option value=\"25\">사환</option>\r\n" +
                "                                        <option value=\"31\">일반대학원</option>\r\n" +
                "                                        <option value=\"33\">경영대학원</option>\r\n" +
                "                                        <option value=\"34\">스마트융합대학원</option>\r\n" +
                "                                        <option value=\"35\">교육대학원</option>\r\n" +
                "                                        <option value=\"36\">상담복지정책대학원</option>\r\n" +
                "                                        <option value=\"37\">환경대학원</option>\r\n" +
                "                                        <option value=\"38\">건설법무대학원</option>\r\n" +
                "                                        <option value=\"12\">타교생(학부)</option>\r\n" +
                "                                        <option value=\"30\">타교생(대학원)</option>\r\n" +
                "                                        <option value=\"51\">예산사용자</option>\r\n" +
                "                                        <option value=\"99\">게시판담당자</option>\r\n" +
                "                                      </select>");
        out.print("<br><b>로그인 : </b>");
        out.print("<input name=\"member_no\" type=\"text\" style=\"width:137px;\" tabindex=\"2\"/><br>");
        out.print("<b>비밀번호 : </b>");
        out.print("<input name=\"password\" type=\"password\" style=\"width:137px;\" tabindex=\"3\"/>&ensp;");
        out.print("<input name=\"bntLogin\" type=\"button\" tabindex=\"4\" width=\"95\" height=\"19\" value=\"로그인\"/>");
        out.print("</body>");
        out.print("</html>");
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
