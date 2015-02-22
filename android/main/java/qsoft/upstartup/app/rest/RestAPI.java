package qsoft.upstartup.app.rest;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by p_val on 21.02.15.
 */
public interface RestAPI {
    @GET("/link/{id}")
    void getProject(@Path("id") String id, Callback<UpProject> cb);
}
