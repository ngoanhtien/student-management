package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TaiKhoanDao;
import Model.TaiKhoan;

/**
 * Servlet implementation class DangNhapController
 */
@WebServlet("/login")
public class DangNhapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TaiKhoanDao x = new TaiKhoanDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DangNhapController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenDN = new String(request.getParameter("tenDN").getBytes("ISO-8859-1"),"UTF-8");
		String matKhau = new String(request.getParameter("matKhau").getBytes("ISO-8859-1"),"UTF-8");
		HttpSession Session = request.getSession();
		if(x.xacThuc(tenDN, matKhau))
		{
			if(x.phanQuyen(tenDN).equals("hs"))
			{
				//				request.setAttribute("msv", Integer.parseInt(tenDN));
				//				getServletContext().setAttribute("msv", Integer.parseInt(tenDN));
				//				HttpSession Session = request.getSession();
				Session.setAttribute("msv", Integer.valueOf(tenDN));
				response.sendRedirect("sinhvien/TrangChu.jsp");
				//				request.getRequestDispatcher("TrangChuSV").forward(request, response);

			}
		}
		else if(tenDN.equals("admin") && matKhau.equals("admin"))
		{
			//				HttpSession Session = request.getSession();
			Session.setAttribute("tenDN", tenDN);
			response.sendRedirect("Home.jsp");
		}
		else
		{
			request.getRequestDispatcher("errorlogin?error=true").forward(request, response);;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
