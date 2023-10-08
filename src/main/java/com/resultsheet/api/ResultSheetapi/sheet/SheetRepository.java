package com.resultsheet.api.ResultSheetapi.sheet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SheetRepository extends JpaRepository<Sheet,Long> {

//    @Query("INSERT INTO Sheet s (s.totalMark, gpa, overallRank) values(?1, ?2, ?3)")
//    Sheet abc(Sheet sheet);
}
