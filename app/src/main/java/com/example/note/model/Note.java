package com.example.note.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Note implements Comparable<Note> {
    @PrimaryKey
    private int id;
    private String title;
    private String content;
    private String tag;
    private Long creationTimestamp;
    private Long lastModification;
    private boolean pinned;

    public Note(int id) {
        this.id = id;
        this.title = "";
        this.content = "";
        this.tag ="";
        this.creationTimestamp = System.currentTimeMillis();
        this.lastModification = this.creationTimestamp;
        this.pinned = false;
    }

    @Ignore
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.tag = "";
        this.creationTimestamp = System.currentTimeMillis();
        this.lastModification = this.creationTimestamp;
        this.pinned = false;
    }

    @Ignore
    public Note(String title, String content, String tag) {
        this.title = title;
        this.content = content;
        this.tag = tag;
        this.creationTimestamp = System.currentTimeMillis();
        this.lastModification = this.creationTimestamp;
        this.pinned = false;
    }

    @Ignore
    public Note(int id, String title) {
        this.id = id;
        this.title = title;
        this.content = "";
        this.tag = "";
        this.creationTimestamp = System.currentTimeMillis();
        this.lastModification = this.creationTimestamp;
        this.pinned = false;
    }


    @Ignore
    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tag = "";
        this.creationTimestamp = System.currentTimeMillis();
        this.lastModification = this.creationTimestamp;
        this.pinned = false;
    }

    @Ignore
    public Note(int id, String title, String content, String tag) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tag = tag;
        this.creationTimestamp = System.currentTimeMillis();
        this.lastModification = this.creationTimestamp;
        this.pinned = false;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Long getLastModification() {
        return lastModification;
    }

    public void setLastModification(Long lastModification) {
        this.lastModification = lastModification;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", tag='" + tag + '\'' +
                ", creationTimestamp=" + creationTimestamp +
                ", lastModification=" + lastModification +
                '}';
    }

    @Override
    public boolean equals(Object other)  {
        if (!(other instanceof Note)) {
            return false;
        }
        Note otherNote = (Note) other;

        if(this.id == otherNote.getId())
            return true;
        return false;
    }

    @Override
    public int compareTo(Note note) {
        return note.lastModification.compareTo(lastModification);
    }
}

