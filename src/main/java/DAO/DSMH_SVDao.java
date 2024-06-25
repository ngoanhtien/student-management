package DAO;

import Model.DSMH_SV;
import java.text.DecimalFormat;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DSMH_SVDao extends Initialization{

	public List<DSMH_SV> getALLByMSV(int masv)
	{
		List<DSMH_SV> li = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select monhoc.mahp, tenhp, lophp_sv.malop, hocki, sotinchi,tx1,tx2,tx3,diem, trangthaihoc ");
		sql.append("from sinhvien join lophp_sv on sinhvien.masv = lophp_sv.masv ");
		sql.append("join lophp on lophp.malop = lophp_sv.malop ");
		sql.append("join monhoc on monhoc.mahp = lophp.mahp ");
		sql.append("where sinhvien.masv= ? ");
		sql.append("order by hocki asc ");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setInt(1, masv);
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				li.add(new DSMH_SV(
							rs.getString("mahp"),
							rs.getString("tenhp"),
							rs.getString("malop"),
							rs.getInt("hocki"),
							rs.getDouble("sotinchi"),
							rs.getFloat("tx1"),
							rs.getFloat("tx2"),
							rs.getFloat("tx3"),
							rs.getDouble("diem"),
							rs.getString("trangthaihoc")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return li;
	}
	
	public List<DSMH_SV> getMHDKByMSV(int masv)
	{
		List<DSMH_SV> li = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select monhoc.mahp, tenhp, lophp_sv.malop, hocki, sotinchi,tx1,tx2,tx3,diem, trangthaihoc ");
		sql.append("from sinhvien join lophp_sv on sinhvien.masv = lophp_sv.masv ");
		sql.append("join lophp on lophp.malop = lophp_sv.malop ");
		sql.append("join monhoc on monhoc.mahp = lophp.mahp ");
		sql.append("where sinhvien.masv= ? ");
		sql.append("and ( trangthaihoc like 'Đã học' or trangthaihoc like 'Đang học' ) ");
		sql.append("order by hocki asc ");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setInt(1, masv);
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				li.add(new DSMH_SV(
							rs.getString("mahp"),
							rs.getString("tenhp"),
							rs.getString("malop"),
							rs.getInt("hocki"),
							rs.getDouble("sotinchi"),
							rs.getFloat("tx1"),
							rs.getFloat("tx2"),
							rs.getFloat("tx3"),
							rs.getDouble("diem"),
							rs.getString("trangthaihoc")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return li;
	}
	
	
	
	
	
	
	public double getSoTinTL(int masv)
	{
		double tintichluy = 0;
		StringBuilder sql = new StringBuilder();
		sql.append("select monhoc.mahp, tenhp, lophp_sv.malop, hocki, sotinchi,diem, trangthaihoc ");
		sql.append("from sinhvien join lophp_sv on sinhvien.masv = lophp_sv.masv ");
		sql.append("join lophp on lophp.malop = lophp_sv.malop ");
		sql.append("join monhoc on monhoc.mahp = lophp.mahp ");
		sql.append("where sinhvien.masv= ? and trangthaihoc like ?");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setInt(1, masv);
			pre.setString(2, "Đã học");
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				tintichluy+=rs.getDouble("sotinchi");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tintichluy;
	}
	
	public double getTBTL(int masv, double tongTinTL)
	{
		double tongDiem=0;
		StringBuilder sql = new StringBuilder();
		sql.append("select monhoc.mahp, tenhp, lophp_sv.malop, hocki, sotinchi,diem, trangthaihoc ");
		sql.append("from sinhvien join lophp_sv on sinhvien.masv = lophp_sv.masv ");
		sql.append("join lophp on lophp.malop = lophp_sv.malop ");
		sql.append("join monhoc on monhoc.mahp = lophp.mahp ");
		sql.append("where sinhvien.masv= ? and trangthaihoc like ?");
		try {
			PreparedStatement pre = this.getCon().prepareStatement(sql.toString());
			pre.setInt(1, masv);
			pre.setString(2, "Đã học");
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				tongDiem+= rs.getDouble("diem") * rs.getDouble("sotinchi");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double tBTL = (tongDiem / tongTinTL)* 0.4;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		String ketQua = decimalFormat.format(tBTL);
		ketQua = ketQua.replace(",",".");
		return Double.parseDouble(ketQua);
//		return tBTL;
	}
	
	
	
}
