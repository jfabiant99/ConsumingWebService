package electron.jfabiant.consmiendoservicioweb.services;

import java.util.List;

import electron.jfabiant.consmiendoservicioweb.models.Producto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    String API_BASE_URL = "https://productos-apj-ebenites.c9users.io";

    @GET("/api/productos/")

    public Call<List<Producto>> getProductos ();

}
