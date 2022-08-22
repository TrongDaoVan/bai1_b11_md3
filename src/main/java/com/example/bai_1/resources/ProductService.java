package com.example.bai_1.resources;

import com.example.bai_1.model.SanPham;

import java.util.List;

public interface ProductService {
    List<SanPham> hienThi();
    void taoSP(SanPham sanPham);
    SanPham timKiem(int id);
    void xoa(int id);
    void suaSP(SanPham sanPham, int id);
}

