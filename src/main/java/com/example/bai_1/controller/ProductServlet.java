package com.example.bai_1.controller;

import com.example.bai_1.model.SanPham;
import com.example.bai_1.resources.ProductServiceImpl;
import com.example.bai_1.resources.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/sanpham1")
public class ProductServlet extends HttpServlet {

    private ProductService productService = new ProductServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action) {
            case "taoSp":
                themSP(req, resp);
                break;
            case "suaSP":
                bangSuaSP(req,resp);
                break;
            case "xoaSP":
                xoaSP(req,resp);
                break;
            case "timKiem":
                break;
            default:
//                listProduct(req,resp);
                break;
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getParameter("action");
    if(action == null) {
    action = "";
    }
    switch (action) {
        case "taoSp":
            hienThiTrangTaoSP(req,resp);
            break;
        case "suaSP":
//            hienThiTrangSua(req,resp);
            break;
        case "xoaSP":
            deleteSP(req,resp);
            break;
        case "timKiem":
            timKiemKH(req, resp);
            break;
        case "view":
            break;
        default:
            listProduct(req,resp);
            break;
    }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        List<SanPham> sanPhams = this.productService.hienThi();
        request.setAttribute("sanPhams", sanPhams);

        RequestDispatcher dispatcher = request.getRequestDispatcher("sanPhams/list.jsp");
        dispatcher.forward(request,response);
    }

    private  void hienThiTrangTaoSP(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
RequestDispatcher dispatcher = request.getRequestDispatcher("/sanPhams/taoSp.jsp");
        dispatcher.forward(request, response);
    }

    private void themSP(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        int id = Integer.parseInt(request.getParameter("id"));
        String productName = request.getParameter("productName");
        int priceName = Integer.parseInt(request.getParameter("priceName"));
        String productDescription = request.getParameter("productDescription");
        String producer = request.getParameter("producer");

        SanPham sanPham = new SanPham(id, productName,priceName, productDescription, producer);

        this.productService.taoSP(sanPham);
        RequestDispatcher dispatcher = request.getRequestDispatcher("sanPhams/taoSp.jsp");
        dispatcher.forward(request, response);
    }

    private void timKiemKH(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        int id = Integer.parseInt(request.getParameter("id"));
        SanPham sanPham = this.productService.timKiem(id);
        RequestDispatcher dispatcher;
        if(sanPham == null){
            dispatcher = request.getRequestDispatcher("/error-404.jsp");
        } else {
            request.setAttribute("sanPham", sanPham);
            dispatcher = request.getRequestDispatcher("/sanPhams/edit.jsp");

        }
        dispatcher.forward(request, response);
    }

    private void bangSuaSP (HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
int id = Integer.parseInt(request.getParameter("id"));
String productName = request.getParameter("productName");
int priceName = Integer.parseInt(request.getParameter("priceName"));
String productDescription = request.getParameter("productDescription");
String producer = request.getParameter("producer");

SanPham sanPham = new SanPham(id, productName, priceName, productDescription, producer);

RequestDispatcher dispatcher;
if (sanPham == null) {
    dispatcher = request.getRequestDispatcher("/error-404.jsp");
} else {
    sanPham.setId(id);
    sanPham.setProductName(productName);
    sanPham.setPriceName(priceName);
    sanPham.setProductDescription(productDescription);
    sanPham.setProducer(producer);

    this.productService.suaSP(sanPham, id);
    request.setAttribute("sanPham", sanPham);
    dispatcher = request.getRequestDispatcher("/sanPhams/edit.jsp");
    dispatcher.forward(request, response);
}

    }
    private void deleteSP (HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        int id = Integer.parseInt(request.getParameter("id"));
        SanPham sanPham = this.productService.timKiem(id);
        RequestDispatcher dispatcher;
        if(sanPham == null) {
            dispatcher = request.getRequestDispatcher("/error-404.jsp");
        } else {
            request.setAttribute("sanPham",sanPham);
            dispatcher = request.getRequestDispatcher("/sanPhams/delete.jsp");
        }
        dispatcher.forward(request, response);
    }

    private void xoaSP (HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        int id = Integer.parseInt(request.getParameter("id"));
        SanPham sanPham = this.productService.timKiem(id);
        RequestDispatcher dispatcher;
        if(sanPham == null) {
            dispatcher = request.getRequestDispatcher("/error-404.jsp");
        } else {
            this.productService.xoa(id);
        }
        response.sendRedirect("/sanpham1");
    }
}
