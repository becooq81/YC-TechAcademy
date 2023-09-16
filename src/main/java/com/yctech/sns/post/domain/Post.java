package com.yctech.sns.post.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Getter
@Table(name = "posts")
@Entity
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private Date createdAt;

    protected Post() {}

    public Post(Long userId, String title, String content) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.createdAt = new Date();
    }

    public Post(Long userId, String title, String content, Date createdAt) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }
}
