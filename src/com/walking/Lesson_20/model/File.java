package com.walking.Lesson_20.model;

public class File {
    private final String name;
    private final long file_size;
    private final FileType type;

    public File(String name, long file_size, FileType type){
        this.name = name;
        this.file_size = file_size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public FileType getType() {
        return type;
    }

    public long getFile_size() {
        return file_size;
    }
}

