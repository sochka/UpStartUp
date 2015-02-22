package qsoft.upstartup.app.rest;

import retrofit.RestAdapter;

/**
 * Created by p_val on 21.02.15.
 */
public class RestClient {
    public static String BASE_URL = "link";
    private RestAPI restAPI;

    public RestClient() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(BASE_URL)
                .build();

        restAPI = restAdapter.create(RestAPI.class);
    }

    public RestAPI getRestAPI() {
        return restAPI;
    }
}
