package com.cambot.league.models;

import lombok.Data;

@Data
public class SpectatorResponse {
    private long gameId;
    private long gameStartTime;
    private String platformId;
    private String gameMode;
    private long mapId;
    private String gameType;s
    private List<BannedChampion> bannedChampions;
    private Observer observers;
    private List<CurrentGameParticipant> participants;
    private long gameLength;
    private long gameQueueConfigId;

}
