package com.example.JavaHw.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Note {
    private Long id;
    private String title;
    private String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
