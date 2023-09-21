package com.example.JavaHw.controllers;

import com.example.JavaHw.entities.Note;
import com.example.JavaHw.services.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/note")
public class NoteController {
    private NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    @GetMapping(value = "/list")
    public ModelAndView getListOfNotes() {
        ModelAndView model = new ModelAndView("note/list");
        model.addObject("notes", noteService.listAll());
        return model;
    }

    @GetMapping(value = "/create")
    public String createNote() {
        return "note/note";
    }

    @PostMapping(path = "/create")
    public String updateListOfNodes(@ModelAttribute("note") Note newNote) {
        noteService.add(newNote);
        return "redirect:/note/list";
    }

    @PostMapping(path = "/delete")
    public String deleteNote(@RequestParam("id") Long id) {
        noteService.deleteById(id);
        return "redirect:/note/list";
    }

    @GetMapping(value = "/edit")
    public ModelAndView editNote(@RequestParam("id") Long id) {
        ModelAndView edit = new ModelAndView("note/edit");
        Note byId = noteService.getById(id);
        edit.addObject("note", byId);
        return edit;
    }

    @PostMapping(path = "/edit")
    public String updateNote(@ModelAttribute("note") Note updateNote) {
        noteService.update(updateNote);
        return "redirect:/note/list";
    }
}














































