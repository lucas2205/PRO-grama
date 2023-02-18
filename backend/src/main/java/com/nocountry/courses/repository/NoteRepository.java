package com.nocountry.courses.repository;

import com.nocountry.courses.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

        List<Note> findAllByUserId(Long id);
}
