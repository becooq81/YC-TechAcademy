package com.yctech.sns.post.repository;

import com.yctech.sns.post.domain.Post;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Serializable> {
    List<Post> findByOrderByIdDesc();
    List<Post> findAllByUserId(Long userId);
    List<Post> findByIdInOrderByIdDesc(List<Long> postIdList);
}
