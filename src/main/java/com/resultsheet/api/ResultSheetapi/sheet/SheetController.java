package com.resultsheet.api.ResultSheetapi.sheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/sheet")
@CrossOrigin
public class SheetController {

    @Autowired
    public final SheetService sheetService;
    public SheetController(SheetService sheetService) {
        this.sheetService = sheetService;
    }

    @GetMapping
    public List<Sheet> getAllSheet(){
        return sheetService.getAllSheet();
    }

    @PostMapping
    public Sheet saveSheet(@RequestBody Sheet sheet){
        return  sheetService.saveSheet(sheet);
    }

    @DeleteMapping(path="{sheetId}")
    public void deleteSheet(@PathVariable Long sheetId){
        sheetService.deleteSheet(sheetId);
    }
}
