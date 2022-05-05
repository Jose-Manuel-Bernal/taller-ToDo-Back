package com.example.demo.todoapp.repository;

import com.example.demo.todoapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
