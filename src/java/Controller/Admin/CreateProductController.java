/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.Admin;

import Controller.DashboardController;
import DAL.BrandRepository;
import DAL.Repository.CategoryRepository;
import DAL.Repository.Interface.IBrandRepository;
import DAL.Repository.Interface.ICategoryRepository;
import DAL.Repository.Interface.IProductRepository;
import DAL.Repository.ProductRepository;
import MapperModel.BrandMapper;
import MapperModel.CategoryMapper;
import Model.Brand;
import Model.Category;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author hp
 */
public class CreateProductController extends HttpServlet {

    private IProductRepository productRepository = new ProductRepository();
    private ICategoryRepository categoryRepository = new CategoryRepository();
    private IBrandRepository brandRepository = new BrandRepository();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CreateProductController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreateProductController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("cats", productRepository.getAll("category", new CategoryMapper().getMapFunction()));
        request.setAttribute("brands", brandRepository.getAll("brand", new BrandMapper().getMapFunction()));

        request.getRequestDispatcher("View/Admin/create_product.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        int category_id = Integer.parseInt(request.getParameter("category_id"));
        double price = Double.parseDouble(request.getParameter("price"));
        int brand_id = Integer.parseInt(request.getParameter("brand_id"));
        String image = "img/" + request.getParameter("image");
        String description = request.getParameter("description");
        Product newProduct = new Product(
                0, name, description, category_id, price,
                brand_id, image, new Timestamp(System.currentTimeMillis()),
                new Timestamp(System.currentTimeMillis()));
        if (productRepository.create("product", newProduct)) {
            response.sendRedirect(request.getContextPath() + "/DashboardController");
        } else {
            request.getRequestDispatcher("View/Admin/create_product.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
