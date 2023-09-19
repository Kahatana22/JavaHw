package com.example.JavaHw.services;

import com.example.JavaHw.entities.Note;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NoteService {
    private Map<Long, Note> notes;

    public NoteService() {
        notes = new HashMap<>();
    }

    public List<Note> listAll() {
        return new ArrayList<>(notes.values());
    }

    public Note add(Note note){
        Long id = generateId();
        note.setId(id);
        notes.put(note.getId(), note);
        return note;
    }

    public void deleteById(Long id) {
        if (!notes.containsKey(id)) {
            throw new RuntimeException("Note with id " + id + " not found.");
        }
        notes.remove(id);
    }

    public void update(Note note) {
        Long id = note.getId();
        if (!notes.containsKey(id)) {
            throw new RuntimeException("Note with id " + id + " not found.");
        }
        notes.put(id, note);
    }

    public Note getById(Long id) {
        if (!notes.containsKey(id)) {
            throw new RuntimeException("Note with id " + id + " not found.");
        }
        return notes.get(id);
    }

    private Long generateId() {
        Long id = new Random().nextLong();
        while (notes.containsKey(id) || id <= 0) {
            id = new Random().nextLong();
        }
        return id;
    }
}