package dao;

import model.Product;
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public List<Product> getProducts() {
        String query = "Select * from product";
        List<Product> products = new ArrayList<>();

        try {
            Connection c = ConnectionFactory.factory();
            PreparedStatement stmt = c.prepareStatement(query);
            ResultSet res = stmt.executeQuery();

            while(res.next()){
                Product p = new Product();
                p.setDescricao(res.getString("descricao"));
                p.setNome(res.getString("nome"));
                p.setValor(res.getFloat("valor"));
                p.setEmail(res.getString("email"));
                products.add(p);
            }

            c.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return products;
    }
}
