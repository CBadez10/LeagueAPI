package com.cambot.league.models;

import lombok.Data;

@Data
public class SummonerResponse {
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private long revisionDate;
    private String id;
    private String accountId;

}
