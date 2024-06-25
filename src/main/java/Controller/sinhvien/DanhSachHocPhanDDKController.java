package Controller.sinhvien;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DSMH_SVDao;
import DAO.SinhVienDao;
import Model.DSMH_SV;
import Model.SinhVien;

/**
 * Servlet implementation class DanhSachHocPhanDDKController
 */
@WebServlet("/showDSHPDDK")
public class DanhSachHocPhanDDKController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachHocPhanDDKController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DSMH_SVDao x = new DSMH_SVDao();
		SinhVienDao sv = new SinhVienDao();
//		SinhVien a = sv.getStudentObjectByMaSV(request.getParameter("masv"));
//		String hoten = a.getHodem()+" "+a.getTen();		
		HttpSession sesstion = request.getSession();
		int masv = (Integer)(sesstion.getAttribute("msv"));
		List<DSMH_SV> li = x.getMHDKByMSV(masv);
		double tongTinTL = x.getSoTinTL(masv);
		double tBTL = x.getTBTL(masv, tongTinTL);
//		request.setAttribute("hoten", hoten);
		request.setAttribute("masv",masv);
		request.setAttribute("tongTinTL",tongTinTL);
		request.setAttribute("tBTL",tBTL);
		request.setAttribute("ListDSMH", li);
		request.getRequestDispatcher("sinhvien/TrangMonHocDaDK.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
