package com.cambot.league.models;

import lombok.Data;

import java.util.List;

@Data
public class Perks {
    private Long perkStyle;
    private List<Long> perkIds;
    private Long perkSubStyle;
}
