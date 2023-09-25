package com.resultsheet.api.ResultSheetapi.exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    @Query("SELECT e FROM Exam e WHERE e.classroom.id = ?1")
    List<Exam> findByClassroom(Long classroomId);
}
