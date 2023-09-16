package com.yctech.sns.post.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;

@Getter
@Entity(name = "posts")
public class Post {
    @Id @Generated
    private Long id;

    private String title;

    private String content;
}
