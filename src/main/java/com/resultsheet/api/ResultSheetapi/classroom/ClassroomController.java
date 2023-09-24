package com.resultsheet.api.ResultSheetapi.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classroom")
@CrossOrigin

public class ClassroomController {
    @Autowired
    private final ClassroomService classroomService;
    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping
    public List<Classroom> getClassrooms(){
       return classroomService.getAllClassrooms();
    }

    @PostMapping
    public void saveClassroom(@RequestBody Classroom classroom){
        classroomService.saveClassroom(classroom);
    }

    @DeleteMapping(path="{classId}")
    public void deleteClassroom(@PathVariable Long classId) {
        classroomService.deleteClassroom(classId);
    }


}
