package com.resultsheet.api.ResultSheetapi.classroom;

import com.resultsheet.api.ResultSheetapi.exam.Exam;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table
public class Classroom {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Classroom_GEN")
    @SequenceGenerator(name = "Classroom_GEN", sequenceName = "Classroom_SEQ", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String location;
    private String day;
    private String fromTime;
    private String toTime;
    private Integer grade;
    private String mode;
    private String type;

//    @OneToMany(mappedBy = "classroom")
//    private List<Exam> exams;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", day='" + day + '\'' +
                ", from='" + fromTime + '\'' +
                ", to='" + toTime + '\'' +
                ", grade=" + grade +
                ", mode='" + mode + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
