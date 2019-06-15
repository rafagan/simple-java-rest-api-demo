package serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.ProductDao;
import model.Product;

import java.util.List;

public class ProductJsonSerializer {

    public String toJsonString(List<Product> products){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String json = gson.toJson(products);
        return json;
    }


}
