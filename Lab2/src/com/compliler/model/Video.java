package com.compliler.model;

@DiscriminationColumn(name = "dtype")
public abstract class Video {
    protected Long id;
    protected Long creatorId;
    protected Integer duration;

    public Video(Long id, Long creatorId, Integer duration){
        this.id = id;
        this.creatorId = creatorId;
        this.duration = duration;
    }

    public Video(){}

    public Long creatorId(){
        return creatorId;
    }
    public Long getId(){
        return id;
    }

    public Integer getDuration(){
        return duration;
    }


}
