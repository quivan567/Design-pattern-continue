package iuh;

import java.util.ArrayList;
import java.util.List;

public class LopHoc extends Subject {
    private String tenLop;
    private List<SinhVien> danhSachSinhVien = new ArrayList<>();

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
    }

    public void themSinhVien(SinhVien sv) {
        danhSachSinhVien.add(sv);
        attach(sv);
    }

    public void xoaSinhVien(SinhVien sv) {
        danhSachSinhVien.remove(sv);
        detach(sv);
    }

    public void thongBaoMoi(String message) {
        System.out.println("Lop\t" + tenLop + "\tgui thong bao: " + message);
        notifyAllObServer(message);
    }
}
