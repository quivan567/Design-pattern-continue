package iuh;

import java.util.Arrays;
import java.util.List;
import iuh.LopHoc;

public class Main {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc("DHKTPM17C");

        List<String> tenSinhVien = Arrays.asList("Nguyễn Văn A\n", "Trần Thị B\n", "Lê Văn C\n", "Phạm Thị D\n");

        for (String ten : tenSinhVien) {
            lopHoc.themSinhVien(new SinhVien(ten));
        }

        lopHoc.thongBaoMoi("Lịch học tuần này đã được cập nhật!");

        lopHoc.xoaSinhVien(new SinhVien("Trần Thị B"));

        lopHoc.thongBaoMoi("Kiểm tra giữa kỳ vào tuần sau!");
    }
}
