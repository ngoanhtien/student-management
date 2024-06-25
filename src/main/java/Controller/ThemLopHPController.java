package Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LopHPDao;
import Model.LopHP;

/**
 * Servlet implementation class ThemLopHPController
 */
@WebServlet("/insertHP")
public class ThemLopHPController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemLopHPController() {
        super();
        // TODO Auto-generated constructor stub
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
		LopHP x = new LopHP
				(
					request.getParameter("maLop"),
					new String(request.getParameter("tenLop").getBytes("ISO-8859-1"),"UTF-8"),
					Date.valueOf(request.getParameter("tGBD")),
					Date.valueOf(request.getParameter("tGKT")),
//					phải làm thế này để hiện thị tiếng việt vì tạo trang jsp thì để mặc định là ký tự ISO-8859-1
//					nên khi nhập dữ liệu từ form đổ lên servlet thì vẫn là ký tự ISO-8859-1 nên phải lấy các mảng byte kiểu 
//					ký tự ISO-8859-1 và mã hóa về ký tự UTF-8
					new String(request.getParameter("moTa").getBytes("ISO-8859-1"),"UTF-8"),
					Integer.valueOf(request.getParameter("sLSVTD")),
					request.getParameter("maPhong"),
					request.getParameter("maHP")
				);
				LopHPDao hp = new LopHPDao();
				hp.save(x);
				response.sendRedirect("showDSHP");
	}

}