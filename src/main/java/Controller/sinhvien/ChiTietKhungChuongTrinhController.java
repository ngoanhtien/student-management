package Controller.sinhvien;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MonHocDao;
import Model.MonHoc;

/**
 * Servlet implementation class ChiTietKhungChuongTrinhController
 */
@WebServlet("/chitietKCT")
public class ChiTietKhungChuongTrinhController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiTietKhungChuongTrinhController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mahp = request.getParameter("mahp");
		MonHocDao mh = new MonHocDao();
		MonHoc x = mh.getSubjectObjectByMaHP(mahp);
		request.setAttribute("mh", x);
		request.getRequestDispatcher("sinhvien/TrangChiTietKhungChuongTrinh.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
