package com.example.demo.todoapp.service;

import com.example.demo.todoapp.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
