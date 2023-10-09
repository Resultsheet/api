package com.resultsheet.api.ResultSheetapi.sheet;

import jakarta.persistence.*;

@Entity
@Table
public class Sheet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Classroom_GEN")
    @SequenceGenerator(name = "Classroom_GEN", sequenceName = "Classroom_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private int totalMark;
    private Float gpa;
    private int rank;
}
