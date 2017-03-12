package com.momo.aksu.getircontest.data.remote;

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "https://getir-bitaksi-hackathon.herokuapp.com/";

    public static APIService getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}