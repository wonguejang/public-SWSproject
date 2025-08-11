package com.hc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchSpellDto {
	private String mSpellMatchId;
	private String mSpellSummonerId;
	private int matchSpell1;
	private int matchSpell2;
}
