package com.resultsheet.api.ResultSheetapi.exam;

import com.resultsheet.api.ResultSheetapi.classroom.Classroom;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Exam_GEN")
    @SequenceGenerator(name = "Exam_GEN", sequenceName = "Exam_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String date;
    private String startTime;
    private Integer duration;
    private String type;
    private boolean isGraded;
    private String subject;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", duration=" + duration +
                ", type='" + type + '\'' +
                ", isGraded=" + isGraded +
                ", classroom=" + classroom +
                '}';
    }
}
