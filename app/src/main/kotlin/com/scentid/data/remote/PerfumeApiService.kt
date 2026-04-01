import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PerfumeApiService {

    // Endpoint to scan an image
    @POST("/api/scan")
    Call<ResponseType> scanImage(@Body ImageUploadRequest request);

    // Endpoint to search for perfumes
    @GET("/api/search")
    Call<List<Perfume>> searchPerfumes(@Query("q") String query, @Query("filters") String filters);

    // Endpoint to get details of a specific perfume
    @GET("/api/perfume/{id}")
    Call<Perfume> getPerfumeById(@Path("id") String id);

    // Endpoint to get recommendations
    @POST("/api/recommend")
    Call<List<Perfume>> recommendPerfumes(@Body List<String> perfumeIds);
}