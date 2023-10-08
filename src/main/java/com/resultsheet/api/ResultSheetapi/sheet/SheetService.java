package com.resultsheet.api.ResultSheetapi.sheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheetService {

    @Autowired
    private  final SheetRepository sheetRepository;
    public SheetService(SheetRepository sheetRepository) {
        this.sheetRepository = sheetRepository;
    }

    public List<Sheet> getAllSheet(){
//        return  List.of(new Sheet(1L, 90, 3.1F, 19));
        return  sheetRepository.findAll();
    }

    public  Sheet saveSheet(Sheet sheet){
        return  sheetRepository.save(sheet);
    }

    public void deleteSheet(Long sheetId) {
        sheetRepository.deleteById(sheetId);
    }
}
