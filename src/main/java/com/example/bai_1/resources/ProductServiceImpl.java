package com.example.bai_1.resources;

import com.example.bai_1.model.SanPham;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    private static Map<Integer, SanPham> sanPham;

    static {
        sanPham = new HashMap<>();
        sanPham.put(1, new SanPham(1, "Thịt trâu gác bếp", 50, "Siêu mềm, ngon ngọt", "Tập đoàn Đào Thị"));
        sanPham.put(2, new SanPham(2, "Gà muối tiêu", 25, "Siêu chất lượng", "Công ty gia đình"));
        sanPham.put(3, new SanPham(3, "Trứng vịt lộn", 1, "Ngon bổ rẻ", "Tập đoàn Đào Thị"));
        sanPham.put(4, new SanPham(4, "Ba tê voi", 120, "Đắt sắt ra miếng", "Sở thú Việt Nam"));

    }
    @Override
    public List<SanPham> hienThi() {
        return new ArrayList<>(sanPham.values()) ;
    }

    @Override
    public void taoSP(SanPham sanPham) {
this.sanPham.put(sanPham.getId(), sanPham);
    }

    @Override
    public SanPham timKiem(int id) {
        return sanPham.get(id);
    }

    @Override
    public void xoa(int id) {
sanPham.remove(id);
    }

    @Override
    public void suaSP(SanPham sanPham, int id) {
this.sanPham.put(id, sanPham);
    }
}
