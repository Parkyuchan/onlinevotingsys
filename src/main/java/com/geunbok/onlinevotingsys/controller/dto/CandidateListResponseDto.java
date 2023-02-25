package com.geunbok.onlinevotingsys.controller.dto;

import com.geunbok.onlinevotingsys.domain.Candidate;

import java.time.LocalDateTime;

public class CandidateListResponseDto {
    private Long id;
    private String department;
    private String name_candidate1;
    private String name_candidate2;
    private LocalDateTime modifiedDate;

    public CandidateListResponseDto(Candidate entity) {
        this.id = entity.getId();
        this.department = entity.getDepartment();
        this.name_candidate1 = entity.getName_candidate1();
        this.name_candidate2 = entity.getName_candidate2();
        this.modifiedDate = entity.getModifiedDate();
    }
}
