package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LopHP_SVDao;
import Model.LopHPSV;

/**
 * Servlet implementation class ThemLopHPSV
 */
@WebServlet("/insertLopHPSV")
public class ThemLopHPSV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemLopHPSV() {
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
		LopHPSV x = new LopHPSV
				(
						new String(request.getParameter("maLop").getBytes("ISO-8859-1"),"UTF-8"),
						Integer.parseInt(request.getParameter("maSV")),
						Float.parseFloat(request.getParameter("tx1")),
						Float.parseFloat(request.getParameter("tx2")),
						Float.parseFloat(request.getParameter("tx3")),
						Float.parseFloat(request.getParameter("diem")),
						"",
						"",
						new String(request.getParameter("trangThaiHoc").getBytes("ISO-8859-1"),"UTF-8")
				);
		LopHP_SVDao a = new LopHP_SVDao();
		a.save(x);
		request.setAttribute("malop", new String(request.getParameter("maLop").getBytes("ISO-8859-1"),"UTF-8"));
		request.getRequestDispatcher("showDSDiemHP-after-add").forward(request, response);
	}

}
