package com.compliler.model;

@TableName(name ="video")
@DiscriminatorValue("episode")
public class Episode extends Video{
    protected String name;
    protected Integer season;
    protected Integer episodeNumber;

    public Episode(){super();}
    public Episode(Long id, Long creatorId, Integer duration){super(id, creatorId, duration);}
    public Episode(Long id, Long creatorId, Integer duration, String name, Integer season, Integer episodeNumber){
        super(id, creatorId, duration);
        this.name = name;
        this.season = season;
        this.episodeNumber = episodeNumber;
    }

    public String getName(){
        return this.name;
    }
    public Integer getSeason(){
        return this.season;
    }
    public Integer getEpisodeNumber(){
        return this.episodeNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSeason(Integer season){
        this.season = season;
    }
    public void setEpisodeNumber(Integer episodeNumber){
        this.episodeNumber = episodeNumber;
    }
}
