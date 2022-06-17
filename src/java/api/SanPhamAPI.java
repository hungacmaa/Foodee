/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uitils.HttpUtil;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SanPhamAPI", urlPatterns = {"/api-sanpham"})
public class SanPhamAPI extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("-------------------");
//        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("application/json");
//        resp.setCharacterEncoding("UTF-8");
//        PrintWriter pw = resp.getWriter();
//        pw.print("{\n"
//                + "    \"name\": \"nước lọc\",\n"
//                + "    \"price\": \"12000\",\n"
//                + "    \"avartar\": \"https://i.pinimg.com/736x/f4/ec/7d/f4ec7d41811ed755aaa4f898ddcbb610.jpg\",\n"
//                + "    \"rate\": \"5\",\n"
//                + "    \"categoryId\": \"1\",\n"
//                + "    \"discount\": \"0\",\n"
//                + "    \"amount\": \"0\"\n"
//                + "}");
//    }

    // thêm sản phẩm
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        System.out.println(HttpUtil.of(request.getReader()));
    }

//    // sửa sản phẩm
//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("-------------------");
//        System.out.println("put");
//    }
//
//    // xóa sản phẩm
//    @Override
//    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("-------------------");
//        System.out.println("delete");
//    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
