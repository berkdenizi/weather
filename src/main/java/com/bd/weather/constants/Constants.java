package com.bd.weather.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {
    public static String API_URL;
    public static String API_KEY;
    public static final String ACCES_KEY_PARAM = "?access_key=";
    public static final String QUERY_KEY_PARAM = "&query=";
    public static String GENERATED_URL;
    //http://api.weatherstack.com/current?access_key=5ebb9c34a5b3a781469622aefb98b74f&query=ankara

    @Value("${weather-stack.api-url}")
    public void setApiUrl(String apiUrl) {
        Constants.API_URL = apiUrl;
    }

    @Value("${weather-stack.api-key}")
    public void setApiKey(String apiKey) {
        Constants.API_KEY = apiKey;
    }

    public void setGeneratedUrl() {
        Constants.GENERATED_URL = API_URL + ACCES_KEY_PARAM + API_KEY + QUERY_KEY_PARAM;
    }

}
