package com.video.stream.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "youtube_courses")
public class Course {

    @Id
    private String id;

    private String title;

//    @OneToMany(mappedBy = "course")
//    private List<Video> videos = new ArrayList<>();
}
