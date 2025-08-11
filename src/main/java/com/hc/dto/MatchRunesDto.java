package com.hc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchRunesDto {
	private String match_id;
	private String mrSummonerId;
	private int matchMainRune1;
	private int matchMainRune2;
	private int matchMainRune3;
	private int matchMainRune4;
	private int matchSubRune1;
	private int matchSubRune2;
}