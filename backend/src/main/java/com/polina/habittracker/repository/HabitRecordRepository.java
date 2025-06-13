package com.polina.habittracker.repository;

import com.polina.habittracker.model.HabitRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitRecordRepository extends JpaRepository<HabitRecord, Long> {
}
