package Challenge6.utils;

import Challenge6.entities.ProductResult;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("products")
    Call<ArrayList<ProductResult>> getProducts();

}
