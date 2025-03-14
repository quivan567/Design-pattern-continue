package iuh;

import java.util.Observer;

public class SinhVien implements ObServer {
    private String ten;

    public SinhVien(String ten) {
        this.ten = ten;
    }

    @Override
    public void update(String message) {
        System.out.println(ten + "Nhan duoc thong bao: " + message);
    }
}
