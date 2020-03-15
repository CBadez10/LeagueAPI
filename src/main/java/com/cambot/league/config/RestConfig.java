package com.cambot.league.config;

import com.cambot.league.interceptors.RestTemplateHeaderInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestConfig {

    @Value("${riot.apiKey}")
    private String apiKey;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        List<ClientHttpRequestInterceptor> interceptorList = restTemplate.getInterceptors();
        if(CollectionUtils.isEmpty(interceptorList)) {
            interceptorList = new ArrayList<>();
        }
        interceptorList.add(new RestTemplateHeaderInterceptor(apiKey));
        restTemplate.setInterceptors(interceptorList);
        return restTemplate;
    }
}
