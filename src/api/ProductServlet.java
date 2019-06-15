package api;

import dao.ProductDao;
import model.Product;
import serializer.ProductJsonSerializer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        List<Product> produtos = new ProductDao().getProducts();
        String json = new ProductJsonSerializer().toJsonString(produtos);
        out.append(json);
        out.close();
    }
}
