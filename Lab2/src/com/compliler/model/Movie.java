package com.compliler.model;

@TableName(name = "video")
@DiscriminatorValue("movie")
public class Movie extends Video{
    protected String name;
    protected String genre;

    public Movie(){super();}
    public Movie(Long id, Long creatorId, Integer duration){super(id, creatorId, duration);}
    public Movie(Long id, Long creatorId, Integer duration, String name, String genre){
        super(id, creatorId, duration);
        this.name = name;
        this.genre = genre;
    }

    public String getName(){
        return this.name;
    }
    public String getGenre(){
        return this.genre;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }


}
