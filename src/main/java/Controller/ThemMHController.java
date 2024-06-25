package Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MonHocDao;
import Model.MonHoc;

/**
 * Servlet implementation class ThemMHController
 */
@WebServlet("/insertSubject")
public class ThemMHController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemMHController() {
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
		String smaHP = new String(request.getParameter("maHP").getBytes("ISO-8859-1"),"UTF-8");
		String stenHP = new String(request.getParameter("tenHP").getBytes("ISO-8859-1"),"UTF-8");
		String stenVietTat = new String(request.getParameter("tenVietTat").getBytes("ISO-8859-1"),"UTF-8");
		String smaIn = new String(request.getParameter("maIn").getBytes("ISO-8859-1"),"UTF-8");
		String smoTa = new String(request.getParameter("moTa").getBytes("ISO-8859-1"),"UTF-8");
		int soTiet  = Integer.parseInt(request.getParameter("soTiet"));
		double ssoTinChi = Double.parseDouble(request.getParameter("soTinChi"));
		String sloaiMon = new String(request.getParameter("loaiMon").getBytes("ISO-8859-1"),"UTF-8");
		String sngayBanHanh = request.getParameter("ngayBanHanh");
		String smucTieu = new String(request.getParameter("mucTieu").getBytes("ISO-8859-1"),"UTF-8");
		String snoiDungChuongTrinh = new String(request.getParameter("noiDungChuongTrinh").getBytes("ISO-8859-1"),"UTF-8");
		String strinhDoDaoTao = new String(request.getParameter("trinhDoDaoTao").getBytes("ISO-8859-1"),"UTF-8");
		String staiLieuThamKhao = new String(request.getParameter("taiLieuThamKhao").getBytes("ISO-8859-1"),"UTF-8");
		String snhomBienSoan = new String(request.getParameter("nhomBienSoan").getBytes("ISO-8859-1"),"UTF-8");
		String shocPhanHocTruoc = new String(request.getParameter("hocPhanHocTruoc").getBytes("ISO-8859-1"),"UTF-8");
		String shocPhanSongHanh = new String(request.getParameter("hocPhanSongHanh").getBytes("ISO-8859-1"),"UTF-8");
		String shocPhanTienQuyet = new String(request.getParameter("hocPhanTienQuyet").getBytes("ISO-8859-1"),"UTF-8");
		String shocPhanTuongDuong = new String(request.getParameter("hocPhanTuongDuong").getBytes("ISO-8859-1"),"UTF-8");
		int ssoLuongSVToiDa = Integer.parseInt(request.getParameter("soLuongSVToiDa"));
		int tongSoTiet  = Integer.parseInt(request.getParameter("tongSoTiet"));
		double sdonGiaTin = Double.parseDouble(request.getParameter("donGiaTin"));
		int hocKi  = Integer.parseInt(request.getParameter("hocKi"));
		
		
		MonHoc x = new MonHoc
		(
			smaHP,
			stenHP,
			stenVietTat,
			smaIn,
			smoTa,
			soTiet,
			ssoTinChi,
			sloaiMon,
			Date.valueOf(sngayBanHanh),
			smucTieu,
			snoiDungChuongTrinh,
			strinhDoDaoTao,
			staiLieuThamKhao,
			snhomBienSoan,
			shocPhanHocTruoc,
			shocPhanSongHanh,
			shocPhanTienQuyet,
			shocPhanTuongDuong,
			ssoLuongSVToiDa,
			tongSoTiet,
			sdonGiaTin,
			hocKi
		);
		
		MonHocDao s = new MonHocDao();
		s.save(x);
		response.sendRedirect("showSubject");
	}

}
