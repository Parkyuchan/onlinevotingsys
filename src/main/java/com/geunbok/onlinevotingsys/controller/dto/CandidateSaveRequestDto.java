package com.geunbok.onlinevotingsys.controller.dto;

import com.geunbok.onlinevotingsys.domain.Candidate;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CandidateSaveRequestDto {
    private String department;
    private String name_candidate1;
    private String id_candidate1;
    private String name_candidate2;
    private String id_candidate2;
    private String gongyak;

    @Builder
    public CandidateSaveRequestDto(String department, String name_candidate1, String id_candidate1,
                                   String name_candidate2, String id_candidate2, String gongyak) {
        this.department = department;
        this.name_candidate1 = name_candidate1;
        this.id_candidate1 = id_candidate1;
        this.name_candidate2 = name_candidate2;
        this.id_candidate2 = id_candidate2;
        this.gongyak = gongyak;
    }

    public Candidate toEntity() {
        return Candidate.builder()
                .name_candidate1(name_candidate1)
                .id_candidate1(id_candidate1)
                .name_candidate2(name_candidate2)
                .id_candidate2(id_candidate2)
                .gongyak(gongyak)
                .department(department).build();
    }
}
