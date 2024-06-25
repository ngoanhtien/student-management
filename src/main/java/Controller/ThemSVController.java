package Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SinhVienDao;
import Model.SinhVien;

/**
 * Servlet implementation class ThemSVController
 */
@WebServlet("/insert")
public class ThemSVController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemSVController() {
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
		String smasv = new String(request.getParameter("masv").getBytes("ISO-8859-1"),"UTF-8");
		String shodem = new String(request.getParameter("hodem").getBytes("ISO-8859-1"),"UTF-8");
		String sten = new String(request.getParameter("ten").getBytes("ISO-8859-1"),"UTF-8");
		String squequan = new String(request.getParameter("quequan").getBytes("ISO-8859-1"),"UTF-8");
		String sngaysinh = request.getParameter("ngaysinh");
		String scccd = request.getParameter("cccd");
		String squoctich = new String(request.getParameter("quoctich").getBytes("ISO-8859-1"),"UTF-8");
		String sdantoc = new String(request.getParameter("dantoc").getBytes("ISO-8859-1"),"UTF-8");
		String stongiao = new String(request.getParameter("tongiao").getBytes("ISO-8859-1"),"UTF-8");
		String ssdt = request.getParameter("sdt");
		String semail = request.getParameter("email");
		String shedaotao = new String(request.getParameter("hedaotao").getBytes("ISO-8859-1"),"UTF-8");
		SinhVien sv = new SinhVien
		(
			Integer.valueOf(smasv),
			shodem,
			sten,
			squequan,
			Date.valueOf(sngaysinh),
			scccd,
			squoctich,
			sdantoc,
			stongiao,
			ssdt,
			semail,
			shedaotao
		);
		
		SinhVienDao s = new SinhVienDao();
		s.save(sv);
		response.sendRedirect("show");
	}

}
