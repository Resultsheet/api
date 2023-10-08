package com.resultsheet.api.ResultSheetapi.sheet;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Sheet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Sheet_GEN")
    @SequenceGenerator(name = "Sheet_GEN", sequenceName = "Sheet_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private  Long id;

    private  Integer totalMark;
    private  Float gpa;
    private  Integer overallRank;

    public Sheet(Integer totalMark, Float gpa, Integer rank) {
        this.totalMark = totalMark;
        this.gpa = gpa;
        this.overallRank = rank;
    }

}
