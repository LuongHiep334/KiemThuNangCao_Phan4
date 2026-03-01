package phan2;

import java.util.ArrayList;
import java.util.List;

public class MonAnService {
	List<MonAn> listMonAn = new ArrayList<>();
	public void setUp() {
		listMonAn.add(new MonAn("001","Sữa chua","tráng miệng",10,12000));
		listMonAn.add(new MonAn("002","Rau sống","tráng miệng",10,12000));
		listMonAn.add(new MonAn("003","Cơm trắng","tráng miệng",10,12000));
	}
	public boolean themMonAn(MonAn monAn) {
	    // Thuật toán: 
	    // - Dùng vòng lặp for (hoặc foreach) duyệt qua listMonAn.
	    // - Nếu phát hiện có món ăn nào trong danh sách có mã (getMaMonAn) 
	    //   GIỐNG HỆT với mã của biến 'monAn' truyền vào (dùng hàm .equals() để so sánh chuỗi).
	    //   -> Trả về false luôn (Báo lỗi: Mã đã tồn tại, không cho thêm).
	    // - Nếu vòng lặp chạy xong mà không thấy trùng ai -> listMonAn.add(monAn); -> Trả về true.
		for (MonAn monAnX : listMonAn) {
			if (monAnX.getMaMonAn().equals(monAn.getMaMonAn())) {
				return false;
			}
		}
		listMonAn.add(monAn);
		return true;
	}
	public boolean suaMonAn(String maCanSua, MonAn thongTinMoi) {
		for (MonAn monAn : listMonAn) {
			if (monAn.getMaMonAn().equals(maCanSua)) {
				monAn.setTenMonAn(thongTinMoi.getTenMonAn());
				monAn.setLoaiMonAn(thongTinMoi.getLoaiMonAn());
				monAn.setSoLuong(thongTinMoi.getSoLuong());
				monAn.setGia(thongTinMoi.getGia());
				return true;
			}
		}
	    // Thuật toán:
	    // - Dùng vòng lặp duyệt qua listMonAn.
	    // - Nếu tìm thấy món ăn có mã giống với 'maCanSua':
	    //      + Dùng các hàm set (ví dụ: setTenMonAn, setGia...) để cập nhật dữ liệu từ 'thongTinMoi' sang món ăn tìm được.
	    //      + (Lưu ý: Thường người ta KHÔNG cho phép sửa mã món ăn, nên em chỉ set các thuộc tính còn lại).
	    //      + Cập nhật xong thì trả về true (Sửa thành công).
	    // - Nếu duyệt hết danh sách mà không tìm thấy -> Trả về false.
		return false;
	}
}
