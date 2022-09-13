package com.springboothello.helloworldapi;

public class Course {
    private int id;
    private String name;
    private String author;
    Course(int id,String name,String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", author='" + getAuthor() + "'" +
            "}";
    }
    
    
}
