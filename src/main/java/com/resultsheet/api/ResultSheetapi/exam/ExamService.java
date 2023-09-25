package com.resultsheet.api.ResultSheetapi.exam;
import com.resultsheet.api.ResultSheetapi.classroom.Classroom;
import com.resultsheet.api.ResultSheetapi.classroom.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ExamService {
    @Autowired
    private final ExamRepository examRepository;
    private final ClassroomRepository classroomRepository;
    public ExamService(ExamRepository examRepository, ClassroomRepository classroomRepository) {
        this.examRepository = examRepository;
        this.classroomRepository = classroomRepository;
    }


    public List<Exam> getExamsByClassroom(Long classroomId) {
        System.out.println(classroomId);
        try {
            return examRepository.findByClassroom(classroomId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to fetch exams.");
        }

    }

    public Exam saveExam(Long classroomId, Exam exam) {

        Classroom cls = classroomRepository.findById(classroomId)
                        .orElseThrow(() -> new IllegalStateException("classroom does not exists."));

        try {
            exam.setClassroom(cls);
            examRepository.save(exam);
            return exam;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to save the exam.");
        }
    }
}
