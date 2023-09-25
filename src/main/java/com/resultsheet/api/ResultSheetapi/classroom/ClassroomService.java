package com.resultsheet.api.ResultSheetapi.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {
    private final ClassroomRepository classroomRepository;

    @Autowired
    public ClassroomService(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    public List<Classroom> getAllClassrooms(){
        return classroomRepository.findAll();
    }

    public void saveClassroom(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    public void deleteClassroom(Long id) {
        boolean exists = classroomRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("classroom does not exists.");
        }
        classroomRepository.deleteById(id);
    }
}



