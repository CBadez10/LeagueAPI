package com.cambot.league.models;

import lombok.Data;

@Data
public class BannedChampion {
    private Integer pickTurn;
    private Long championId;
    private Long teamId;
}
