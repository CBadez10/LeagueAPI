package com.cambot.league.interceptors;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class RestTemplateHeaderInterceptor implements ClientHttpRequestInterceptor {

    private String apiKey;

    public RestTemplateHeaderInterceptor(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().add("X-Riot-Token", apiKey);
        ClientHttpResponse response = execution.execute(request, body);
        return response;
    }
}
