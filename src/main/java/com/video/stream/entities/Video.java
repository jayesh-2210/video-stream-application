package com.video.stream.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "youtube_videos")
@Data
public class Video {
    @Id
    private String videoId;
    private String title;
    private String description;
    private String contentType;
//    @ManyToOne
//    private Course course;
}
