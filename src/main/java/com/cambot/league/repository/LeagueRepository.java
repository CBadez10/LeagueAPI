package com.cambot.league.repository;

import com.cambot.league.models.SummonerResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

@Repository
public class LeagueRepository {

    @Value("${riot.apiKey}")
    private String apiKey;

    public ResponseEntity getSummoner(String summoner) {

        // Set api key in header
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-Riot-Token", apiKey);
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        // Build custom URL for passed in summoner
        UriComponents uri = UriComponentsBuilder.fromHttpUrl("https://na1.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summoner}")
                .buildAndExpand(summoner);
        String urlString = uri.toString();

        // Call riot API
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(urlString, HttpMethod.GET, entity, SummonerResponse.class);
    }

}
