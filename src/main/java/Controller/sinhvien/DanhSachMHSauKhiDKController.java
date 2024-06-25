package Controller.sinhvien;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LopHP_MHDao;
import Model.LopHP_MH;

/**
 * Servlet implementation class DanhSachMHSauKhiDKController
 */
@WebServlet("/showDSMHSDK")
public class DanhSachMHSauKhiDKController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LopHP_MHDao hp_mh = new LopHP_MHDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachMHSauKhiDKController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int masv = (Integer) request.getSession().getAttribute("msv");
		
		List<LopHP_MH> li = hp_mh.getALLByMSV(masv);
		request.setAttribute("li", li);
		request.getRequestDispatcher("sinhvien/TrangDangKyMonHoc.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
