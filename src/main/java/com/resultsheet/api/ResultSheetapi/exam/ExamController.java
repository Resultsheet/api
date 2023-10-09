package com.resultsheet.api.ResultSheetapi.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api/exam")
@CrossOrigin
public class ExamController {
    @Autowired
    private final ExamService examService;
    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping(path="{classroomId}")
    public List<Exam> getAllExamsByClassroomId(@PathVariable Long classroomId){
        return examService.getExamsByClassroom(classroomId);
    }

    @PostMapping(path="{classroomId}")
    public Exam saveExam(@PathVariable Long classroomId, @RequestBody Exam exam){
        return examService.saveExam(classroomId, exam);
    }

    @DeleteMapping
    public void deleteExam(){
    }


}
