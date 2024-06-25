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
 * Servlet implementation class SuaHPController
 */
@WebServlet("/editHP")
public class SuaHPController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuaHPController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String malop = request.getParameter("malop");
		LopHPDao lopHPDao = new LopHPDao();
		LopHP x = lopHPDao.getLopHPByMa(malop);
		request.setAttribute("hp", x);
		request.getRequestDispatcher("TrangSuaHP.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LopHPDao lopHPDao = new LopHPDao();
		LopHP x = new LopHP
		(
			request.getParameter("maLop"),
			new String(request.getParameter("tenLop").getBytes("ISO-8859-1"),"UTF-8"),
			Date.valueOf(request.getParameter("tGBD")),
			Date.valueOf(request.getParameter("tGKT")),
			new String(request.getParameter("moTa").getBytes("ISO-8859-1"),"UTF-8"),
			Integer.valueOf(request.getParameter("sLSVTD")),
			request.getParameter("maPhong"),
			request.getParameter("maHP")
		);
		lopHPDao.update(x);
		response.sendRedirect("showDSHP");
	}

}
